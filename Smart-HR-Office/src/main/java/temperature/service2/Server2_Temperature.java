/* 
 * Class: Server 2 - Temperature 
 * Author @Erica Pereira 
 * Smart HR office 
 * gRpc API 
 * 
 */
package temperature.service2;

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
 * Server side - 2
 * Call the class service2 where I implement the RPC methods 
 * discover jmDNS for server side implement 
 * 
 */

public class Server2_Temperature {
	
	
	static int port = 5050;

	public static void main ( String[] args) throws InterruptedException, IOException {
		
		
		Properties prop = Server2_Temperature.getProperties();
		
		// registration the the services
		Server2_Temperature .registerService(prop);


		int port = Integer.valueOf( prop.getProperty("service_port") );// #.5050;

	
		// calliing RPC services for server

		try {
			Server server = ServerBuilder
				.forPort(port).addService(new RoomTemperature_service())
				.build();
		server.start();
		
		System.out.println(" Server 2 started at  "  + port);
	

		server.awaitTermination();

		} catch (IOException | InterruptedException e) {
			System.err.println("Error starting server");
			e.printStackTrace();

		}
			
	}	
	
    // get the properties file
	private static Properties getProperties() {
		
		Properties prop = null;		

		 try (InputStream input = new FileInputStream("src/main/resources/temperature.properties")) {

	            prop = new Properties();

	            prop.load(input);

	            System.out.println("Room Temperature Service properies ...");
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
	            String service_type = prop.getProperty("service_type") ;//"_temperature._tcp.local.";
	            String service_name = prop.getProperty("service_name")  ;
	            int service_port = Integer.valueOf( prop.getProperty("service_port") );// #.5050;
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
