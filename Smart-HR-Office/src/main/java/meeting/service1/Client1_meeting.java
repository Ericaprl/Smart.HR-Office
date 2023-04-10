package meeting.service1;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import meeting.service1.Schedule_MeetingGrpc.Schedule_MeetingStub;


import java.util.concurrent.TimeUnit;

import java.util.Scanner;


import io.grpc.StatusRuntimeException;



public class Client1_meeting {

	static Schedule_MeetingStub nonblockingstub;


	public static void main(String[] args) {
		

	
        ManagedChannel clientChannel = ManagedChannelBuilder.forAddress("localhost",9099)
        		.usePlaintext()
        		.build();

        
		nonblockingstub = Schedule_MeetingGrpc.newStub(clientChannel);

		
		try (Scanner scanner = new Scanner(System.in)) {
			int choice;

			do {
				System.out.println("Enter 1 for Create Meeting, 2 for Modify meeting, 3 for Cancel meeting ");
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					createMeeting();
					break;
				case 2:
					modifyMeeting();
					break;
				case 3:
					cancelMeeting();
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

	// Client Streaming RPC

	// RCP create Meeting
	public static void createMeeting() {
		StreamObserver<CreateMeetingResponse> response = new StreamObserver<CreateMeetingResponse>() {

			@Override
			public void onNext(CreateMeetingResponse response) {
				System.out.println(
						"Received response from the server: " 
				+ response.getMeetingId() + " " + response.getMessage());
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

		StreamObserver<CreateMeetingRequest> streamCreatmeeting = nonblockingstub.createMeeting(response);

		try {
			streamCreatmeeting.onNext(CreateMeetingRequest.newBuilder().setOrganizerId("John")
					.setTitle("Weekly Meeting").setStartTime(System.currentTimeMillis() + 3600000).build());

			Thread.sleep(1000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		streamCreatmeeting.onCompleted();
	}
	
	
	// bidirectional streaming RPC

	// RCP modify Meeting
	public static void modifyMeeting() {
		StreamObserver<ModifyMeetingResponse> responsemidy = new StreamObserver<ModifyMeetingResponse>() {

			@Override
			public void onNext(ModifyMeetingResponse response) {
				System.out.println("Received response from the server: " + response.getSuccessModify() + " "
						+ response.getMessage());

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

		
		
		StreamObserver<ModifyMeetingRequest> streamomodify = nonblockingstub.modifyMeeting(responsemidy);

		try {
			streamomodify.onNext(ModifyMeetingRequest.newBuilder().setModiMeetingId("test-test-Bidirectional-streaming-RPC")
					.build());

			Thread.sleep(1000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		streamomodify.onCompleted();
		
	}

	
	// Server streaming RPC

	// RCP cancel Meeting
	public static void cancelMeeting() {

		nonblockingstub.cancelMeeting(CancelMeetingRequest.newBuilder().build(),
				new StreamObserver<CancelMeetingResponse>() {

					@Override
					public void onNext(CancelMeetingResponse responseCancel) {
						System.out.println("Received response from the server: " + responseCancel.getSuccessCancel()
								+ " " + responseCancel.getErrorMessage());

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

	
	
	
	
	

		

		
	



}
