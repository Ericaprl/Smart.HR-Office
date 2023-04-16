/* 
 * Class: RPC service 1 - Meeting 
 * Author @Erica Pereira 
 * Smart HR office 
 * gRpc API 
 * 
 */
package meeting.service1;


import java.util.UUID;
import java.util.stream.Stream;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import meeting.service1.Schedule_MeetingGrpc.Schedule_MeetingImplBase;


// Class with only RCP method for the server side
public class ScheduleMeeting_service  extends Schedule_MeetingImplBase{
	
	
	

	
	// Client Streaming RPC
	// Create Meeting -It will give to the client a new meeting ID as a response. 
	
	@Override 
	
	 public StreamObserver<CreateMeetingRequest> createMeeting(
	            StreamObserver<CreateMeetingResponse> responseObserver) {
		   
	
        return new StreamObserver<CreateMeetingRequest>() {

			@Override
			public void onNext(CreateMeetingRequest request) {
				
				 System.out.println(" -- Receiving CreateMeeting request from client -- ");
				 
				 	String organizerID = request.getOrganizerId();
				 	String title = request.getTitle();
				 	long time = request.getStartTime();
				 	
				 	
				 // Logic 
	        		String meetingDetails = " Meeting details:  "  + organizerID + " , " + title + " , " + time;
	                boolean isValid = isValidMeeting(meetingDetails);

	                
	        		 CreateMeetingResponse.Builder response = CreateMeetingResponse.newBuilder();
	               
	         		// return success 

	        		 if (isValid) {
	                     String meetingId = generateMeetingId();
	                     response.setMeetingId(" Meeting ID:" + " \n " + meetingId)
	                     .setMessage("\n " + "Meeting created successfully  ");

		             // return error 
	                 
	        		 } else {
	                     String errorMsg = "Meeting cannot be created";
	                     response.setMessage(errorMsg);
	                     responseObserver.onError(Status.INVALID_ARGUMENT
	                             .withDescription(errorMsg)
	                             .asRuntimeException());
	                    
	                 }
	        		   responseObserver.onNext(response.build());

	             }

			@Override
			public void onError(Throwable t) {
				  System.err.println("Error creating meeting: " + t.getMessage());
				  responseObserver.onError(Status.UNKNOWN
	                        .withDescription("Error creating meeting")
	                        .asRuntimeException());
			}

			@Override
			public void onCompleted() {
	            System.out.println("Create Meeting request completed");
                responseObserver.onCompleted();

			}
		};
	}
	
	
	
	// bidirectional streaming RPC
	// Modify meeting - It will notify if the meeting is success changed or not.  
	@Override 

	public StreamObserver<ModifyMeetingRequest> modifyMeeting(StreamObserver<ModifyMeetingResponse> responseObserver) {	
		return new StreamObserver<ModifyMeetingRequest>() {

			@Override
			public void onNext(ModifyMeetingRequest request) {

				 System.out.println(" -- Receiving ModifyMeeting request from client -- ");

				 
				 String meetingId = request.getModiMeetingId();
	             UpdateMessage updates = request.getUpdates();

			      
				 // logic  
	                boolean success = modifyMeetingLogic(meetingId, updates);

	                ModifyMeetingResponse.Builder response = ModifyMeetingResponse.newBuilder();
	                if (success) {
	                	// return success 
	                    response.setSuccessModify(true).setMessage("Meeting modified successfully");
	                	
	                }else {
	                	// return error 
	                    response.setSuccessModify(false).setMessage("Meeting cannot be modified");
	                }
	             
	                responseObserver.onNext(response.build());
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
	

	// Server streaming RPC
	// Cancel meeting  - It will cancel the meeting 
	@Override
	public void cancelMeeting(CancelMeetingRequest request, StreamObserver<CancelMeetingResponse> responseObserver) {
		
		System.out.println(" -- Receiving Cancelation request from client  -- ");
	    
		
		String meetingID = request.getCancelMeetingId();
		
		// Logic 
	    boolean success = true;

	    for ( int i = 0; i<10; i++) {
	    CancelMeetingResponse.Builder response = CancelMeetingResponse.newBuilder();
	    
    		// return success 

	    if (success) {
	        response.setSuccessCancel("Meeting " + meetingID + " cancelled successfully");
	        
        	// return error 

	    } else {
	        response.setErrorMessage("Sorry, meeting " + meetingID + " cannot be cancelled");
	    }
		
	    responseObserver.onNext(response.build());
	    }
	    
	    responseObserver.onCompleted();

	}
	
	



	

	// logic for create meeting 
	
	private String generateMeetingId() {
		  return UUID.randomUUID().toString();

		}
	
	private boolean isValidMeeting(String meetingDetails) {
	    String[] details = meetingDetails.split(",");
	    return details.length == 3 &&
	            Stream.of(details)
	                  .map(String::trim)
	                  .noneMatch(String::isEmpty) &&
	            Long.parseLong(details[2].trim()) > System.currentTimeMillis();
	}
	
	// logic for modify meeting 
	private boolean modifyMeetingLogic(String meetingId, UpdateMessage updates) {
	    return true;
	}

	
}
