package onboarding.service3;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import onboarding.service3.Onboarding_employeesGrpc.Onboarding_employeesBlockingStub;
import onboarding.service3.Onboarding_employeesGrpc.Onboarding_employeesStub;


public class Client3_Onboarding {
	

	
	static  Onboarding_employeesBlockingStub blockingStub;
	static  Onboarding_employeesStub nonblockingstub;
	
	
	public static void main(String[] args) {

        ManagedChannel clientChannel = ManagedChannelBuilder.forAddress("localhost",5051)
        		.usePlaintext()
        		.build();
        
        blockingStub =  Onboarding_employeesGrpc.newBlockingStub(clientChannel);
        
      nonblockingstub = Onboarding_employeesGrpc.newStub(clientChannel);

      try (Scanner scanner = new Scanner(System.in)) {
			int choice;

			do {
				System.out.println("Enter 1 for Onboard Employee, 2 for Create Employee user, 3 for Check employee status");
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					onboardEmployee();
					break;
				case 2:
					createEmployee();
					break;
				case 3:
					checkEmployeeStatus();
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
	
	// bidirectional streamin RPC

	public static void onboardEmployee() {
		StreamObserver<OnboardingResponse> onborResponse = new StreamObserver<OnboardingResponse>() {

			@Override
			public void onNext(OnboardingResponse onborResponse) {
				
				System.out.println("Received response from the server: " + onborResponse.getIsOnboarded() + onborResponse.getMessage());
					
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
	
	StreamObserver<OnboardingRequest> streamOmbor = nonblockingstub.onboardEmployee(onborResponse);

	try {
		Employee employee = Employee.newBuilder().setName("Erica").setEmail("Erica@gmail.com").setAge(29).build();
		
		streamOmbor.onNext(OnboardingRequest.newBuilder().setEmployee(employee)
				.build());

		Thread.sleep(1000);

	} catch (InterruptedException e) {
		e.printStackTrace();
	}

	streamOmbor.onCompleted();
	

	}
	
	
	
	
	// Unary RPC

	public static void createEmployee() {
		
		CreateEmployeeResponse response = 
				blockingStub.createEmployee(CreateEmployeeRequest.newBuilder()
						.setUsername("Erica123").setPassword(" Testing321")
						.build());
		
		
		System.out.println(" Message sent by server:" + "\n" + " User: " + response.getSuccess() + response.getMessage());
		
		
		
		
		
	}

	
	// client streaming RPC

	public static void checkEmployeeStatus() {
		
		StreamObserver<EmployeeStatusResponse> statusResponse = new StreamObserver<EmployeeStatusResponse>() {

			@Override
			public void onNext(EmployeeStatusResponse statusResponse) {
				System.out.println(
						"Received response from the server: " 
				+ statusResponse.getEmployeeId() + " " + statusResponse.getIsEmployeeActive());
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
	
	StreamObserver<EmployeeStatusRequest> streamStatus = nonblockingstub.checkEmployeeStatus(statusResponse);

	try {
		streamStatus.onNext(EmployeeStatusRequest.newBuilder().setEmployeeId("erica12345")
				.build());

		Thread.sleep(1000);

	} catch (InterruptedException e) {
		e.printStackTrace();
	}

	streamStatus.onCompleted();
}



}
