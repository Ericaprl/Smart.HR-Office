/* 
 * Class: RPC service 2 - Room temperature  
 * Author @Erica Pereira 
 * Smart HR office 
 * gRpc API 
 * 
 */
package temperature.service2;

import io.grpc.stub.StreamObserver;
import temperature.service2.Room_Temperature_controlGrpc.Room_Temperature_controlImplBase;

//Class with only RCP method for the server side

public class RoomTemperature_service extends Room_Temperature_controlImplBase  {

	
	
	// Server Streaming RPC
	// set Room Temperature - It will reply if the temperature is set or not
	@Override
	public void setRoomTemperature(TemperatureRequest request, 
			StreamObserver<TemperatureResponse> responseObserver) {
		
        System.out.println(" -- Receiving request from client to  set the temperature -- " );
     
        
        // Logic 
		double temperature = request.getSetTemperature();
		
	    boolean success = true;

        for ( int i = 0; i<5; i++) {
        	
        TemperatureResponse.Builder response = TemperatureResponse.newBuilder();
 		// return success 
        if( success ) {
        	
        	response.setMessage(" The current temperature has been set: " + temperature);
            // return error 
        } else {
        	response.setMessage(" Sorry, temperature cannot be set ");

        }
        
	    responseObserver.onNext(response.build());
        
        }
        responseObserver.onCompleted();
		
	}
	

	// unary RPC
	// show Room Temperature - It will response with the actual temperature
	@Override
	public void showRoomTemperature(RoomTemperatureRequest request,
			StreamObserver<RoomTemperatureResponse> responseObserver) {
	
		
     System.out.println(" -- Receiving request from client to display the temperature -- " );
     
     
     // Logic 
     
     String temperature = " Romm request:  " + request.getRoomNumber();
     
     RoomTemperatureResponse response = RoomTemperatureResponse.newBuilder()
    		 .setMessage(temperature).setTemperature(19).build();
     
    	
     responseObserver.onNext(response);
     responseObserver.onCompleted();

		
	}

	
	// Bidirectional streaming RPC
	// Adjust Room Temperature - It will adjust the temperature

	@Override
	public StreamObserver<AdjustRoomTemperatureRequest> adjustRoomTemperature(
			StreamObserver<AdjustRoomTemperatureResponse> responseObserver) {
		
		return new StreamObserver<AdjustRoomTemperatureRequest> (){
		

			@Override
			public void onNext(AdjustRoomTemperatureRequest request) {
				
	
		        System.out.println(" -- Receiving request from client to Adjust the temperature -- " );
		        
		      	// Logic 
	            double newTemperature = request.getTemperatureAdjustment() + 2.0; 
	            
	            responseObserver.onNext( AdjustRoomTemperatureResponse.newBuilder()
	                    .setNewAdjTemperature((int) newTemperature)
	                    .build());
	            
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
	


}
	
	

	
	
	


	
	
	
	
	
	


