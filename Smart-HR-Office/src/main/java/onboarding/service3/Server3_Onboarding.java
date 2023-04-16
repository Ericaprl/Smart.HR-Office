/* 
 * Class: Server 3 - Oboarding 
 * Author @Erica Pereira 
 * Smart HR office 
 * gRpc API 
 * 
 */

package onboarding.service3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import io.grpc.Server;
import io.grpc.ServerBuilder;


/* 
 * Server side - 3 
 * Call the class service3 where I implement the RPC methods 
 * discover jmDNS for server side implement 
 * 
 */

public class Server3_Onboarding {
	
	static int port = 5051;

	public static void main ( String[] args) throws InterruptedException, IOException {
		

		Properties prop = Server3_Onboarding.getProperties();
		
		// registration the the services

		Server3_Onboarding.registerService(prop);


		int port = Integer.valueOf( prop.getProperty("service_port") );// #.5051;

	
		// calliing RPC services for server

		try {
			Server server = ServerBuilder
				.forPort(port).addService(new Onboarding_service())
				.build();
		server.start();
		
		System.out.println(" Server 3 started at  "  + port);
	

		server.awaitTermination();

		} catch (IOException | InterruptedException e) {
			System.err.println("Error starting server");
			e.printStackTrace();

		}
			
	}	
	
	
	
    // get the properties file
	private static Properties getProperties() {
		
		Properties prop = null;		

		 try (InputStream input = new FileInputStream("src/main/resources/onboarding.properties")) {

	            prop = new Properties();

	            prop.load(input);

	            System.out.println("Onboarding Service properies ...");
	            System.out.println("\t service_type: " + prop.getProperty("service_type"));
	            System.out.println("\t service_name: " +prop.getProperty("service_name"));
	            System.out.println("\t service_description: " +prop.getProperty("service_description"));
		        System.out.println("\t service_port: " +prop.getProperty("service_port"));
		        
		 } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	
		 return prop;
	}
	
	
	private static  void registerService(Properties prop) {
		
		
		 try {
	            // Create a JmDNS instance
	            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
	            String service_type = prop.getProperty("service_type") ;//"_onboarding._tcp.local.";
	            String service_name = prop.getProperty("service_name")  ;
	            int service_port = Integer.valueOf( prop.getProperty("service_port") );// #.5051;

		
	            String service_description_properties = prop.getProperty("service_description")  ;
	           
	            
	            // Register a service
	            ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_description_properties);
	            jmdns.registerService(serviceInfo);
	            
	            System.out.printf("registrering service with type %s and name %s \n", service_type, service_name);
	            
	            Thread.sleep(10);
	            
	           jmdns.unregisterAllServices();
	           
	           
		  } catch (IOException e) {
	            System.out.println(e.getMessage());
	            
	        } catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	

		
	}
		
		
}
