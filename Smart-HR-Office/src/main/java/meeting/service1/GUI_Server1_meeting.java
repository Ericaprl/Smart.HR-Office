
package meeting.service1;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import meeting.service1.Schedule_MeetingGrpc.Schedule_MeetingStub;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI_Server1_meeting {

	private static Schedule_MeetingStub nonblockingstub;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Meeting Service");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String host = "localhost";
		int port = 9099;

		ManagedChannel clientChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();

		nonblockingstub = Schedule_MeetingGrpc.newStub(clientChannel);

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		JButton createButton = new JButton("Create Meeting");
		JButton modifyButton = new JButton("Modify Meeting");
		JButton cancelButton = new JButton("Cancel Meeting");

		panel.add(createButton, BorderLayout.NORTH);
		panel.add(modifyButton, BorderLayout.CENTER);
		panel.add(cancelButton, BorderLayout.SOUTH);

		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);

		createButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createMeeting();
			}
		});

		modifyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modifyMeeting();
			}
		});

		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancelMeeting();
			}
		});

	}

	// RCP create Meeting 
	public static void createMeeting ( ) {
		StreamObserver<CreateMeetingResponse> response = new StreamObserver<CreateMeetingResponse>() {
			
			@Override
			public void onNext(CreateMeetingResponse response) {
				System.out.println("Received response from the server: " + response.getMeetingId() + " " + response.getMessage());
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
		streamCreatmeeting.onNext(CreateMeetingRequest.newBuilder()
	                .setOrganizerId("John")
	                .setTitle("Weekly Meeting")
	                .setStartTime(System.currentTimeMillis() + 3600000) // start time in one hour
	                .build());
		 
        Thread.sleep(1000);


		  } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		
		streamCreatmeeting.onCompleted();
	}

	// RCP modify Meeting
	public static void modifyMeeting() {
		StreamObserver<ModifyMeetingResponse> responsemidy = new StreamObserver<ModifyMeetingResponse>() {

			@Override
			public void onNext(ModifyMeetingResponse response) {
				System.out.println("Received response from the server: " + " \n " + response.getSuccessModify() + " "
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

		for (int i = 0; i < 5; i++) {
			streamomodify.onNext(ModifyMeetingRequest.newBuilder().build());

		}

		streamomodify.onCompleted();
	}

	// RCP cancel Meeting
	public static void cancelMeeting() {

		nonblockingstub.cancelMeeting(CancelMeetingRequest.newBuilder().build(),
				new StreamObserver<CancelMeetingResponse>() {

					@Override
					public void onNext(CancelMeetingResponse response) {
						System.out.println("Received response from the server: " + response.getSuccessCancel() + " "
								+ response.getErrorMessage());

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
