package onboarding.service3;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import onboarding.service3.Onboarding_employeesGrpc.Onboarding_employeesImplBase;


public class Onboarding_service extends Onboarding_employeesImplBase {

	// bidirectional streamin RPC

	@Override
	public StreamObserver<OnboardingRequest> onboardEmployee(StreamObserver<OnboardingResponse> responseObserver) {

		return new StreamObserver<OnboardingRequest>() {

			@Override
			public void onNext(OnboardingRequest request) {

				System.out.println(" -- Receiving new orboarding request from client -- ");

				Employee employee = request.getEmployee();

				// Logic
				boolean isOnboarded = performOnboardingLogic(employee);

				OnboardingResponse.Builder emploResponse = OnboardingResponse.newBuilder();

				if (isOnboarded) {
					// return success
					String message = "Employee onboarded successfully";

					emploResponse.setIsOnboarded(true).setMessage(message);

				} else {
					// return not success
					String message = "Employee cannot be onboarded ";
					emploResponse.setIsOnboarded(false).setMessage(message);
				}

				responseObserver.onNext(emploResponse.build());
			}

			@Override
			public void onError(Throwable t) {
				responseObserver.onError(t);
			}

			@Override
			public void onCompleted() {
				responseObserver.onCompleted();
			}
		};
	}

	// Unary RPC

	@Override
	public void createEmployee(CreateEmployeeRequest request, StreamObserver<CreateEmployeeResponse> responseObserver) {

		System.out.println(" -- Receiving create new user request from client -- ");

		String username = request.getUsername();
		String password = request.getPassword();

		// Logic

		CreateEmployeeResponse.Builder response = CreateEmployeeResponse.newBuilder();

		if (username.equals(password)) {

			response.setSuccess(false).setMessage("Invalid username or password");

		} else {

			response.setSuccess(true).setMessage("User created successfully");

		}

		responseObserver.onNext(response.build());
		responseObserver.onCompleted();

	}

	// client streaming RPC

	@Override
	public StreamObserver<EmployeeStatusRequest> checkEmployeeStatus(
			StreamObserver<EmployeeStatusResponse> responseObserver) {

		return new StreamObserver<EmployeeStatusRequest>() {

			@Override
			public void onNext(EmployeeStatusRequest request) {

				System.out.println(" -- Receiving Employee status request from client -- ");

				boolean isActive = request.getEmployeeId() != null;

				EmployeeStatusResponse.Builder emplpResponse = EmployeeStatusResponse.newBuilder();
				if (isActive) {
					emplpResponse.setEmployeeId(" Employee ID:" + request.getEmployeeId())
							.setIsEmployeeActive(isActive);

				} else {
					String errorMsg = "Employee is inactive";
					emplpResponse.setEmployeeId(errorMsg);
					responseObserver.onError(Status.INVALID_ARGUMENT.withDescription(errorMsg).asRuntimeException());
				}
				responseObserver.onNext(emplpResponse.build());

			}

			@Override
			public void onError(Throwable t) {
				responseObserver.onError(t);
			}

			@Override
			public void onCompleted() {
				responseObserver.onCompleted();
			}

		};
	}

	private boolean performOnboardingLogic(Employee employee) {
		String name = employee.getName();
		String email = employee.getEmail();
		int age = employee.getAge();

		if (!name.isEmpty() && isValidEmail(email) && age > 16) {
			return true;

		}
		return false;

	}

	private boolean isValidEmail(String email) {
		String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		return email.matches(emailRegex);

	}

}
