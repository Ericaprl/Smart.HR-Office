package meeting.service1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: smart_Schedule_meeting1.proto")
public final class Schedule_MeetingGrpc {

  private Schedule_MeetingGrpc() {}

  public static final String SERVICE_NAME = "Smart.HR_Office.Schedule_Meeting";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<meeting.service1.CreateMeetingRequest,
      meeting.service1.CreateMeetingResponse> getCreateMeetingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMeeting",
      requestType = meeting.service1.CreateMeetingRequest.class,
      responseType = meeting.service1.CreateMeetingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<meeting.service1.CreateMeetingRequest,
      meeting.service1.CreateMeetingResponse> getCreateMeetingMethod() {
    io.grpc.MethodDescriptor<meeting.service1.CreateMeetingRequest, meeting.service1.CreateMeetingResponse> getCreateMeetingMethod;
    if ((getCreateMeetingMethod = Schedule_MeetingGrpc.getCreateMeetingMethod) == null) {
      synchronized (Schedule_MeetingGrpc.class) {
        if ((getCreateMeetingMethod = Schedule_MeetingGrpc.getCreateMeetingMethod) == null) {
          Schedule_MeetingGrpc.getCreateMeetingMethod = getCreateMeetingMethod = 
              io.grpc.MethodDescriptor.<meeting.service1.CreateMeetingRequest, meeting.service1.CreateMeetingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Smart.HR_Office.Schedule_Meeting", "CreateMeeting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meeting.service1.CreateMeetingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meeting.service1.CreateMeetingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Schedule_MeetingMethodDescriptorSupplier("CreateMeeting"))
                  .build();
          }
        }
     }
     return getCreateMeetingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<meeting.service1.ModifyMeetingRequest,
      meeting.service1.ModifyMeetingResponse> getModifyMeetingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifyMeeting",
      requestType = meeting.service1.ModifyMeetingRequest.class,
      responseType = meeting.service1.ModifyMeetingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<meeting.service1.ModifyMeetingRequest,
      meeting.service1.ModifyMeetingResponse> getModifyMeetingMethod() {
    io.grpc.MethodDescriptor<meeting.service1.ModifyMeetingRequest, meeting.service1.ModifyMeetingResponse> getModifyMeetingMethod;
    if ((getModifyMeetingMethod = Schedule_MeetingGrpc.getModifyMeetingMethod) == null) {
      synchronized (Schedule_MeetingGrpc.class) {
        if ((getModifyMeetingMethod = Schedule_MeetingGrpc.getModifyMeetingMethod) == null) {
          Schedule_MeetingGrpc.getModifyMeetingMethod = getModifyMeetingMethod = 
              io.grpc.MethodDescriptor.<meeting.service1.ModifyMeetingRequest, meeting.service1.ModifyMeetingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Smart.HR_Office.Schedule_Meeting", "ModifyMeeting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meeting.service1.ModifyMeetingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meeting.service1.ModifyMeetingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Schedule_MeetingMethodDescriptorSupplier("ModifyMeeting"))
                  .build();
          }
        }
     }
     return getModifyMeetingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<meeting.service1.CancelMeetingRequest,
      meeting.service1.CancelMeetingResponse> getCancelMeetingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelMeeting",
      requestType = meeting.service1.CancelMeetingRequest.class,
      responseType = meeting.service1.CancelMeetingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<meeting.service1.CancelMeetingRequest,
      meeting.service1.CancelMeetingResponse> getCancelMeetingMethod() {
    io.grpc.MethodDescriptor<meeting.service1.CancelMeetingRequest, meeting.service1.CancelMeetingResponse> getCancelMeetingMethod;
    if ((getCancelMeetingMethod = Schedule_MeetingGrpc.getCancelMeetingMethod) == null) {
      synchronized (Schedule_MeetingGrpc.class) {
        if ((getCancelMeetingMethod = Schedule_MeetingGrpc.getCancelMeetingMethod) == null) {
          Schedule_MeetingGrpc.getCancelMeetingMethod = getCancelMeetingMethod = 
              io.grpc.MethodDescriptor.<meeting.service1.CancelMeetingRequest, meeting.service1.CancelMeetingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Smart.HR_Office.Schedule_Meeting", "CancelMeeting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meeting.service1.CancelMeetingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  meeting.service1.CancelMeetingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Schedule_MeetingMethodDescriptorSupplier("CancelMeeting"))
                  .build();
          }
        }
     }
     return getCancelMeetingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Schedule_MeetingStub newStub(io.grpc.Channel channel) {
    return new Schedule_MeetingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Schedule_MeetingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Schedule_MeetingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Schedule_MeetingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Schedule_MeetingFutureStub(channel);
  }

  /**
   */
  public static abstract class Schedule_MeetingImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Client Streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<meeting.service1.CreateMeetingRequest> createMeeting(
        io.grpc.stub.StreamObserver<meeting.service1.CreateMeetingResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getCreateMeetingMethod(), responseObserver);
    }

    /**
     * <pre>
     * bidirectional streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<meeting.service1.ModifyMeetingRequest> modifyMeeting(
        io.grpc.stub.StreamObserver<meeting.service1.ModifyMeetingResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getModifyMeetingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server streaming RPC
     * </pre>
     */
    public void cancelMeeting(meeting.service1.CancelMeetingRequest request,
        io.grpc.stub.StreamObserver<meeting.service1.CancelMeetingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelMeetingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMeetingMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                meeting.service1.CreateMeetingRequest,
                meeting.service1.CreateMeetingResponse>(
                  this, METHODID_CREATE_MEETING)))
          .addMethod(
            getModifyMeetingMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                meeting.service1.ModifyMeetingRequest,
                meeting.service1.ModifyMeetingResponse>(
                  this, METHODID_MODIFY_MEETING)))
          .addMethod(
            getCancelMeetingMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                meeting.service1.CancelMeetingRequest,
                meeting.service1.CancelMeetingResponse>(
                  this, METHODID_CANCEL_MEETING)))
          .build();
    }
  }

  /**
   */
  public static final class Schedule_MeetingStub extends io.grpc.stub.AbstractStub<Schedule_MeetingStub> {
    private Schedule_MeetingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Schedule_MeetingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Schedule_MeetingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Schedule_MeetingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Client Streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<meeting.service1.CreateMeetingRequest> createMeeting(
        io.grpc.stub.StreamObserver<meeting.service1.CreateMeetingResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getCreateMeetingMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * bidirectional streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<meeting.service1.ModifyMeetingRequest> modifyMeeting(
        io.grpc.stub.StreamObserver<meeting.service1.ModifyMeetingResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getModifyMeetingMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Server streaming RPC
     * </pre>
     */
    public void cancelMeeting(meeting.service1.CancelMeetingRequest request,
        io.grpc.stub.StreamObserver<meeting.service1.CancelMeetingResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getCancelMeetingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class Schedule_MeetingBlockingStub extends io.grpc.stub.AbstractStub<Schedule_MeetingBlockingStub> {
    private Schedule_MeetingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Schedule_MeetingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Schedule_MeetingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Schedule_MeetingBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Server streaming RPC
     * </pre>
     */
    public java.util.Iterator<meeting.service1.CancelMeetingResponse> cancelMeeting(
        meeting.service1.CancelMeetingRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getCancelMeetingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class Schedule_MeetingFutureStub extends io.grpc.stub.AbstractStub<Schedule_MeetingFutureStub> {
    private Schedule_MeetingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Schedule_MeetingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Schedule_MeetingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Schedule_MeetingFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CANCEL_MEETING = 0;
  private static final int METHODID_CREATE_MEETING = 1;
  private static final int METHODID_MODIFY_MEETING = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Schedule_MeetingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Schedule_MeetingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CANCEL_MEETING:
          serviceImpl.cancelMeeting((meeting.service1.CancelMeetingRequest) request,
              (io.grpc.stub.StreamObserver<meeting.service1.CancelMeetingResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_MEETING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createMeeting(
              (io.grpc.stub.StreamObserver<meeting.service1.CreateMeetingResponse>) responseObserver);
        case METHODID_MODIFY_MEETING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.modifyMeeting(
              (io.grpc.stub.StreamObserver<meeting.service1.ModifyMeetingResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class Schedule_MeetingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Schedule_MeetingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return meeting.service1.Service1_Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Schedule_Meeting");
    }
  }

  private static final class Schedule_MeetingFileDescriptorSupplier
      extends Schedule_MeetingBaseDescriptorSupplier {
    Schedule_MeetingFileDescriptorSupplier() {}
  }

  private static final class Schedule_MeetingMethodDescriptorSupplier
      extends Schedule_MeetingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Schedule_MeetingMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (Schedule_MeetingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Schedule_MeetingFileDescriptorSupplier())
              .addMethod(getCreateMeetingMethod())
              .addMethod(getModifyMeetingMethod())
              .addMethod(getCancelMeetingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
