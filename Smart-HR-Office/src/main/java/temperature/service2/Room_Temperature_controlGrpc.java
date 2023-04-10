package temperature.service2;

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
 * <pre>
 * service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: smart_Room_Temperature2.proto")
public final class Room_Temperature_controlGrpc {

  private Room_Temperature_controlGrpc() {}

  public static final String SERVICE_NAME = "Smart.HR_Office.Room_Temperature_control";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<temperature.service2.TemperatureRequest,
      temperature.service2.TemperatureResponse> getSetRoomTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetRoomTemperature",
      requestType = temperature.service2.TemperatureRequest.class,
      responseType = temperature.service2.TemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<temperature.service2.TemperatureRequest,
      temperature.service2.TemperatureResponse> getSetRoomTemperatureMethod() {
    io.grpc.MethodDescriptor<temperature.service2.TemperatureRequest, temperature.service2.TemperatureResponse> getSetRoomTemperatureMethod;
    if ((getSetRoomTemperatureMethod = Room_Temperature_controlGrpc.getSetRoomTemperatureMethod) == null) {
      synchronized (Room_Temperature_controlGrpc.class) {
        if ((getSetRoomTemperatureMethod = Room_Temperature_controlGrpc.getSetRoomTemperatureMethod) == null) {
          Room_Temperature_controlGrpc.getSetRoomTemperatureMethod = getSetRoomTemperatureMethod = 
              io.grpc.MethodDescriptor.<temperature.service2.TemperatureRequest, temperature.service2.TemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Smart.HR_Office.Room_Temperature_control", "SetRoomTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  temperature.service2.TemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  temperature.service2.TemperatureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Room_Temperature_controlMethodDescriptorSupplier("SetRoomTemperature"))
                  .build();
          }
        }
     }
     return getSetRoomTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<temperature.service2.RoomTemperatureRequest,
      temperature.service2.RoomTemperatureResponse> getShowRoomTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShowRoomTemperature",
      requestType = temperature.service2.RoomTemperatureRequest.class,
      responseType = temperature.service2.RoomTemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<temperature.service2.RoomTemperatureRequest,
      temperature.service2.RoomTemperatureResponse> getShowRoomTemperatureMethod() {
    io.grpc.MethodDescriptor<temperature.service2.RoomTemperatureRequest, temperature.service2.RoomTemperatureResponse> getShowRoomTemperatureMethod;
    if ((getShowRoomTemperatureMethod = Room_Temperature_controlGrpc.getShowRoomTemperatureMethod) == null) {
      synchronized (Room_Temperature_controlGrpc.class) {
        if ((getShowRoomTemperatureMethod = Room_Temperature_controlGrpc.getShowRoomTemperatureMethod) == null) {
          Room_Temperature_controlGrpc.getShowRoomTemperatureMethod = getShowRoomTemperatureMethod = 
              io.grpc.MethodDescriptor.<temperature.service2.RoomTemperatureRequest, temperature.service2.RoomTemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Smart.HR_Office.Room_Temperature_control", "ShowRoomTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  temperature.service2.RoomTemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  temperature.service2.RoomTemperatureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Room_Temperature_controlMethodDescriptorSupplier("ShowRoomTemperature"))
                  .build();
          }
        }
     }
     return getShowRoomTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<temperature.service2.AdjustRoomTemperatureRequest,
      temperature.service2.AdjustRoomTemperatureResponse> getAdjustRoomTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdjustRoomTemperature",
      requestType = temperature.service2.AdjustRoomTemperatureRequest.class,
      responseType = temperature.service2.AdjustRoomTemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<temperature.service2.AdjustRoomTemperatureRequest,
      temperature.service2.AdjustRoomTemperatureResponse> getAdjustRoomTemperatureMethod() {
    io.grpc.MethodDescriptor<temperature.service2.AdjustRoomTemperatureRequest, temperature.service2.AdjustRoomTemperatureResponse> getAdjustRoomTemperatureMethod;
    if ((getAdjustRoomTemperatureMethod = Room_Temperature_controlGrpc.getAdjustRoomTemperatureMethod) == null) {
      synchronized (Room_Temperature_controlGrpc.class) {
        if ((getAdjustRoomTemperatureMethod = Room_Temperature_controlGrpc.getAdjustRoomTemperatureMethod) == null) {
          Room_Temperature_controlGrpc.getAdjustRoomTemperatureMethod = getAdjustRoomTemperatureMethod = 
              io.grpc.MethodDescriptor.<temperature.service2.AdjustRoomTemperatureRequest, temperature.service2.AdjustRoomTemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Smart.HR_Office.Room_Temperature_control", "AdjustRoomTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  temperature.service2.AdjustRoomTemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  temperature.service2.AdjustRoomTemperatureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Room_Temperature_controlMethodDescriptorSupplier("AdjustRoomTemperature"))
                  .build();
          }
        }
     }
     return getAdjustRoomTemperatureMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Room_Temperature_controlStub newStub(io.grpc.Channel channel) {
    return new Room_Temperature_controlStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Room_Temperature_controlBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Room_Temperature_controlBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Room_Temperature_controlFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Room_Temperature_controlFutureStub(channel);
  }

  /**
   * <pre>
   * service definition
   * </pre>
   */
  public static abstract class Room_Temperature_controlImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Server Streaming RPC
     * </pre>
     */
    public void setRoomTemperature(temperature.service2.TemperatureRequest request,
        io.grpc.stub.StreamObserver<temperature.service2.TemperatureResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetRoomTemperatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * unary RPC
     * </pre>
     */
    public void showRoomTemperature(temperature.service2.RoomTemperatureRequest request,
        io.grpc.stub.StreamObserver<temperature.service2.RoomTemperatureResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShowRoomTemperatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<temperature.service2.AdjustRoomTemperatureRequest> adjustRoomTemperature(
        io.grpc.stub.StreamObserver<temperature.service2.AdjustRoomTemperatureResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAdjustRoomTemperatureMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetRoomTemperatureMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                temperature.service2.TemperatureRequest,
                temperature.service2.TemperatureResponse>(
                  this, METHODID_SET_ROOM_TEMPERATURE)))
          .addMethod(
            getShowRoomTemperatureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                temperature.service2.RoomTemperatureRequest,
                temperature.service2.RoomTemperatureResponse>(
                  this, METHODID_SHOW_ROOM_TEMPERATURE)))
          .addMethod(
            getAdjustRoomTemperatureMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                temperature.service2.AdjustRoomTemperatureRequest,
                temperature.service2.AdjustRoomTemperatureResponse>(
                  this, METHODID_ADJUST_ROOM_TEMPERATURE)))
          .build();
    }
  }

  /**
   * <pre>
   * service definition
   * </pre>
   */
  public static final class Room_Temperature_controlStub extends io.grpc.stub.AbstractStub<Room_Temperature_controlStub> {
    private Room_Temperature_controlStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Room_Temperature_controlStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Room_Temperature_controlStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Room_Temperature_controlStub(channel, callOptions);
    }

    /**
     * <pre>
     * Server Streaming RPC
     * </pre>
     */
    public void setRoomTemperature(temperature.service2.TemperatureRequest request,
        io.grpc.stub.StreamObserver<temperature.service2.TemperatureResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSetRoomTemperatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * unary RPC
     * </pre>
     */
    public void showRoomTemperature(temperature.service2.RoomTemperatureRequest request,
        io.grpc.stub.StreamObserver<temperature.service2.RoomTemperatureResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowRoomTemperatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bidirectional streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<temperature.service2.AdjustRoomTemperatureRequest> adjustRoomTemperature(
        io.grpc.stub.StreamObserver<temperature.service2.AdjustRoomTemperatureResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getAdjustRoomTemperatureMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * service definition
   * </pre>
   */
  public static final class Room_Temperature_controlBlockingStub extends io.grpc.stub.AbstractStub<Room_Temperature_controlBlockingStub> {
    private Room_Temperature_controlBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Room_Temperature_controlBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Room_Temperature_controlBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Room_Temperature_controlBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Server Streaming RPC
     * </pre>
     */
    public java.util.Iterator<temperature.service2.TemperatureResponse> setRoomTemperature(
        temperature.service2.TemperatureRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSetRoomTemperatureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * unary RPC
     * </pre>
     */
    public temperature.service2.RoomTemperatureResponse showRoomTemperature(temperature.service2.RoomTemperatureRequest request) {
      return blockingUnaryCall(
          getChannel(), getShowRoomTemperatureMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * service definition
   * </pre>
   */
  public static final class Room_Temperature_controlFutureStub extends io.grpc.stub.AbstractStub<Room_Temperature_controlFutureStub> {
    private Room_Temperature_controlFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Room_Temperature_controlFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Room_Temperature_controlFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Room_Temperature_controlFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * unary RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<temperature.service2.RoomTemperatureResponse> showRoomTemperature(
        temperature.service2.RoomTemperatureRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getShowRoomTemperatureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_ROOM_TEMPERATURE = 0;
  private static final int METHODID_SHOW_ROOM_TEMPERATURE = 1;
  private static final int METHODID_ADJUST_ROOM_TEMPERATURE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Room_Temperature_controlImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Room_Temperature_controlImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_ROOM_TEMPERATURE:
          serviceImpl.setRoomTemperature((temperature.service2.TemperatureRequest) request,
              (io.grpc.stub.StreamObserver<temperature.service2.TemperatureResponse>) responseObserver);
          break;
        case METHODID_SHOW_ROOM_TEMPERATURE:
          serviceImpl.showRoomTemperature((temperature.service2.RoomTemperatureRequest) request,
              (io.grpc.stub.StreamObserver<temperature.service2.RoomTemperatureResponse>) responseObserver);
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
        case METHODID_ADJUST_ROOM_TEMPERATURE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.adjustRoomTemperature(
              (io.grpc.stub.StreamObserver<temperature.service2.AdjustRoomTemperatureResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class Room_Temperature_controlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Room_Temperature_controlBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return temperature.service2.Service2_Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Room_Temperature_control");
    }
  }

  private static final class Room_Temperature_controlFileDescriptorSupplier
      extends Room_Temperature_controlBaseDescriptorSupplier {
    Room_Temperature_controlFileDescriptorSupplier() {}
  }

  private static final class Room_Temperature_controlMethodDescriptorSupplier
      extends Room_Temperature_controlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Room_Temperature_controlMethodDescriptorSupplier(String methodName) {
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
      synchronized (Room_Temperature_controlGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Room_Temperature_controlFileDescriptorSupplier())
              .addMethod(getSetRoomTemperatureMethod())
              .addMethod(getShowRoomTemperatureMethod())
              .addMethod(getAdjustRoomTemperatureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
