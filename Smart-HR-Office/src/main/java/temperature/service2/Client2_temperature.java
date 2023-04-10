package temperature.service2;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import temperature.service2.Room_Temperature_controlGrpc.Room_Temperature_controlBlockingStub;
import temperature.service2.Room_Temperature_controlGrpc.Room_Temperature_controlStub;

public class Client2_temperature {
	
	static  Room_Temperature_controlBlockingStub blockingStub;
	static  Room_Temperature_controlStub nonblockingstub;
	
	public static void main(String[] args) {


        ManagedChannel clientChannel = ManagedChannelBuilder.forAddress("localhost",5050)
        		.usePlaintext()
        		.build();
        
        blockingStub =  Room_Temperature_controlGrpc.newBlockingStub(clientChannel);
        
		nonblockingstub = Room_Temperature_controlGrpc.newStub(clientChannel);

		
        
		try (Scanner scanner = new Scanner(System.in)) {
			int choice;

			do {
				System.out.println("Enter 1 for Set Room temperature, 2 for Display room temperature, 3 for Adjust room temperature");
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					setRoomTemperature();
					break;
				case 2:
					showRoomTemperature();
					break;
				case 3:
					adjustRoomTemperature();
					break;
				default:
					System.out.println("Invalid input, please try again.");
					break;

				}

			} while (choice != -1);
		} catch (StatusRuntimeException e) {
			e.getStatus();
			
		} finally {
			try {
				clientChannel.shutdown().awaitTermination(1, TimeUnit.SECONDS);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
     
		
	}
	
	

	// Server Streaming RPC set room 
	
	public static void setRoomTemperature() {
		
		nonblockingstub.setRoomTemperature(TemperatureRequest.newBuilder().build(), 
				new StreamObserver<TemperatureResponse> (){

					@Override
					public void onNext(TemperatureResponse setResponse) {
						
						double temp = setResponse.getCurrentTemperature();
						temp = 20;
						
						
						 System.out.println(" -- Received response from the server: -- " +
						 temp + setResponse.getCurrentTemperature());

						
					}

					@Override
					public void onError(Throwable t) {
						t.printStackTrace();

					}

					@Override
					public void onCompleted() {
						System.out.println("Stream completed");

						
					}
			
		});
		

	}

	// unary RPC show room 
	public static void showRoomTemperature() {
		
		RoomTemperatureResponse response = 
				blockingStub.showRoomTemperature(RoomTemperatureRequest.newBuilder()
						.setRoomNumber(3)
						.build());
		
		
		System.out.println(" Message sent by server:" + "\n" + " Temperature: " + response.getTemperature() + response.getMessage());
		
		
		
		
	}
	
	// Bidirectional streaming RPC adjust room 
	public static void adjustRoomTemperature() {
		
		StreamObserver<AdjustRoomTemperatureResponse> adjResponse = new StreamObserver<AdjustRoomTemperatureResponse>() {

			@Override
			public void onNext(AdjustRoomTemperatureResponse adjResponse) {
				System.out.println("Received response from the server: " + adjResponse.getNewAdjTemperature() + " "
						+ adjResponse.getMessage());
				
			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();

			}

			@Override
			public void onCompleted() {
				System.out.println("Stream completed");

			}
	};


	StreamObserver<AdjustRoomTemperatureRequest> streamAdj = nonblockingstub.adjustRoomTemperature(adjResponse);

	try {
		streamAdj.onNext(AdjustRoomTemperatureRequest.newBuilder().setTemperatureAdjustment(19)
				.setAdjRoomNumber(3).build());

		Thread.sleep(1000);

	} catch (InterruptedException e) {
		e.printStackTrace();
	}

	streamAdj.onCompleted();
	
	}
	
	

}
