/* 
 * Class: Server 1 - Meeting 
 * Author @Erica Pereira 
 * Smart HR office 
 * gRpc API 
 * 
 */

package meeting.service1;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Properties;


import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import meeting.service1.Schedule_MeetingGrpc.Schedule_MeetingImplBase;
import meeting.service1.Schedule_MeetingGrpc.Schedule_MeetingStub;

import java.io.FileInputStream;
import java.io.InputStream;


/* 
 * Server side - 1 
 * Call the class service1 where I implement the RPC methods 
 * discover jmDNS for server side implement 
 * 
 */

public class Server1_meeting extends Schedule_MeetingImplBase{
	
	static int port = 9099;
	static Schedule_MeetingStub nonblockingstub;


	public static void main ( String[] args) throws InterruptedException, IOException {
		
	      ManagedChannel clientChannel = ManagedChannelBuilder.forAddress("localhost",port)
	        		.usePlaintext()
	        		.build();

	        
			nonblockingstub = Schedule_MeetingGrpc.newStub(clientChannel);
				
		Properties prop = Server1_meeting.getProperties();
		
		// registration the the services

		Server1_meeting.registerService(prop);


		int port = Integer.valueOf( prop.getProperty("service_port") );// #.9099;

	
		// calliing RPC services for server

		try {
			Server server = ServerBuilder
				.forPort(port).addService(new ScheduleMeeting_service())
				.build();
		server.start();
		
		System.out.println(" Server 1 started at  "  + port);
	

		server.awaitTermination();

		} catch (IOException | InterruptedException e) {
			System.err.println("Error starting server");
			e.printStackTrace();

		}
			
	}	
	
	  // get the properties file
	private static Properties getProperties() {
		
		Properties prop = null;		

		 try (InputStream input = new FileInputStream("src/main/resources/meeting.properties")) {

	            prop = new Properties();

	            
	            prop.load(input);

	            System.out.println(" Schedule Meeting Service properies ...");
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
	            JmDNS serverJmdns = JmDNS.create(InetAddress.getLocalHost());
	            
	            String service_type = prop.getProperty("service_type") ;//"_meeting._tcp.local.";
	            String service_name = prop.getProperty("service_name")  ;// "example";
	            int service_port = Integer.valueOf( prop.getProperty("service_port") );// #.9099;
	            String service_description_properties = prop.getProperty("service_description")  ;
	           
	            
	            // Register a service
	            ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_description_properties);
	            serverJmdns.registerService(serviceInfo);
	            
	            System.out.printf("registrering service with type %s and name %s \n", service_type, service_name);
	            
	            Thread.sleep(10);
	            
	            serverJmdns.unregisterAllServices();
	           
	           
		  } catch (IOException e) {
	            System.out.println(e.getMessage());
	            
	        } catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}
	
	
	



	

}
