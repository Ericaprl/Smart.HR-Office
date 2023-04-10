package onboarding.service3;

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
    comments = "Source: smart_Onboarding3.proto")
public final class Onboarding_employeesGrpc {

  private Onboarding_employeesGrpc() {}

  public static final String SERVICE_NAME = "Smart.HR_Office.Onboarding_employees";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<onboarding.service3.OnboardingRequest,
      onboarding.service3.OnboardingResponse> getOnboardEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnboardEmployee",
      requestType = onboarding.service3.OnboardingRequest.class,
      responseType = onboarding.service3.OnboardingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<onboarding.service3.OnboardingRequest,
      onboarding.service3.OnboardingResponse> getOnboardEmployeeMethod() {
    io.grpc.MethodDescriptor<onboarding.service3.OnboardingRequest, onboarding.service3.OnboardingResponse> getOnboardEmployeeMethod;
    if ((getOnboardEmployeeMethod = Onboarding_employeesGrpc.getOnboardEmployeeMethod) == null) {
      synchronized (Onboarding_employeesGrpc.class) {
        if ((getOnboardEmployeeMethod = Onboarding_employeesGrpc.getOnboardEmployeeMethod) == null) {
          Onboarding_employeesGrpc.getOnboardEmployeeMethod = getOnboardEmployeeMethod = 
              io.grpc.MethodDescriptor.<onboarding.service3.OnboardingRequest, onboarding.service3.OnboardingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Smart.HR_Office.Onboarding_employees", "OnboardEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  onboarding.service3.OnboardingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  onboarding.service3.OnboardingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Onboarding_employeesMethodDescriptorSupplier("OnboardEmployee"))
                  .build();
          }
        }
     }
     return getOnboardEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<onboarding.service3.CreateEmployeeRequest,
      onboarding.service3.CreateEmployeeResponse> getCreateEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEmployee",
      requestType = onboarding.service3.CreateEmployeeRequest.class,
      responseType = onboarding.service3.CreateEmployeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<onboarding.service3.CreateEmployeeRequest,
      onboarding.service3.CreateEmployeeResponse> getCreateEmployeeMethod() {
    io.grpc.MethodDescriptor<onboarding.service3.CreateEmployeeRequest, onboarding.service3.CreateEmployeeResponse> getCreateEmployeeMethod;
    if ((getCreateEmployeeMethod = Onboarding_employeesGrpc.getCreateEmployeeMethod) == null) {
      synchronized (Onboarding_employeesGrpc.class) {
        if ((getCreateEmployeeMethod = Onboarding_employeesGrpc.getCreateEmployeeMethod) == null) {
          Onboarding_employeesGrpc.getCreateEmployeeMethod = getCreateEmployeeMethod = 
              io.grpc.MethodDescriptor.<onboarding.service3.CreateEmployeeRequest, onboarding.service3.CreateEmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Smart.HR_Office.Onboarding_employees", "CreateEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  onboarding.service3.CreateEmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  onboarding.service3.CreateEmployeeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Onboarding_employeesMethodDescriptorSupplier("CreateEmployee"))
                  .build();
          }
        }
     }
     return getCreateEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<onboarding.service3.EmployeeStatusRequest,
      onboarding.service3.EmployeeStatusResponse> getCheckEmployeeStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckEmployeeStatus",
      requestType = onboarding.service3.EmployeeStatusRequest.class,
      responseType = onboarding.service3.EmployeeStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<onboarding.service3.EmployeeStatusRequest,
      onboarding.service3.EmployeeStatusResponse> getCheckEmployeeStatusMethod() {
    io.grpc.MethodDescriptor<onboarding.service3.EmployeeStatusRequest, onboarding.service3.EmployeeStatusResponse> getCheckEmployeeStatusMethod;
    if ((getCheckEmployeeStatusMethod = Onboarding_employeesGrpc.getCheckEmployeeStatusMethod) == null) {
      synchronized (Onboarding_employeesGrpc.class) {
        if ((getCheckEmployeeStatusMethod = Onboarding_employeesGrpc.getCheckEmployeeStatusMethod) == null) {
          Onboarding_employeesGrpc.getCheckEmployeeStatusMethod = getCheckEmployeeStatusMethod = 
              io.grpc.MethodDescriptor.<onboarding.service3.EmployeeStatusRequest, onboarding.service3.EmployeeStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Smart.HR_Office.Onboarding_employees", "CheckEmployeeStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  onboarding.service3.EmployeeStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  onboarding.service3.EmployeeStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new Onboarding_employeesMethodDescriptorSupplier("CheckEmployeeStatus"))
                  .build();
          }
        }
     }
     return getCheckEmployeeStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Onboarding_employeesStub newStub(io.grpc.Channel channel) {
    return new Onboarding_employeesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Onboarding_employeesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Onboarding_employeesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Onboarding_employeesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Onboarding_employeesFutureStub(channel);
  }

  /**
   */
  public static abstract class Onboarding_employeesImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * bidirectional streamin RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<onboarding.service3.OnboardingRequest> onboardEmployee(
        io.grpc.stub.StreamObserver<onboarding.service3.OnboardingResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getOnboardEmployeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public void createEmployee(onboarding.service3.CreateEmployeeRequest request,
        io.grpc.stub.StreamObserver<onboarding.service3.CreateEmployeeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateEmployeeMethod(), responseObserver);
    }

    /**
     * <pre>
     * client streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<onboarding.service3.EmployeeStatusRequest> checkEmployeeStatus(
        io.grpc.stub.StreamObserver<onboarding.service3.EmployeeStatusResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getCheckEmployeeStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOnboardEmployeeMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                onboarding.service3.OnboardingRequest,
                onboarding.service3.OnboardingResponse>(
                  this, METHODID_ONBOARD_EMPLOYEE)))
          .addMethod(
            getCreateEmployeeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                onboarding.service3.CreateEmployeeRequest,
                onboarding.service3.CreateEmployeeResponse>(
                  this, METHODID_CREATE_EMPLOYEE)))
          .addMethod(
            getCheckEmployeeStatusMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                onboarding.service3.EmployeeStatusRequest,
                onboarding.service3.EmployeeStatusResponse>(
                  this, METHODID_CHECK_EMPLOYEE_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class Onboarding_employeesStub extends io.grpc.stub.AbstractStub<Onboarding_employeesStub> {
    private Onboarding_employeesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Onboarding_employeesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Onboarding_employeesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Onboarding_employeesStub(channel, callOptions);
    }

    /**
     * <pre>
     * bidirectional streamin RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<onboarding.service3.OnboardingRequest> onboardEmployee(
        io.grpc.stub.StreamObserver<onboarding.service3.OnboardingResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getOnboardEmployeeMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public void createEmployee(onboarding.service3.CreateEmployeeRequest request,
        io.grpc.stub.StreamObserver<onboarding.service3.CreateEmployeeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * client streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<onboarding.service3.EmployeeStatusRequest> checkEmployeeStatus(
        io.grpc.stub.StreamObserver<onboarding.service3.EmployeeStatusResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getCheckEmployeeStatusMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class Onboarding_employeesBlockingStub extends io.grpc.stub.AbstractStub<Onboarding_employeesBlockingStub> {
    private Onboarding_employeesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Onboarding_employeesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Onboarding_employeesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Onboarding_employeesBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public onboarding.service3.CreateEmployeeResponse createEmployee(onboarding.service3.CreateEmployeeRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateEmployeeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class Onboarding_employeesFutureStub extends io.grpc.stub.AbstractStub<Onboarding_employeesFutureStub> {
    private Onboarding_employeesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Onboarding_employeesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Onboarding_employeesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Onboarding_employeesFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<onboarding.service3.CreateEmployeeResponse> createEmployee(
        onboarding.service3.CreateEmployeeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateEmployeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_EMPLOYEE = 0;
  private static final int METHODID_ONBOARD_EMPLOYEE = 1;
  private static final int METHODID_CHECK_EMPLOYEE_STATUS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Onboarding_employeesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Onboarding_employeesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_EMPLOYEE:
          serviceImpl.createEmployee((onboarding.service3.CreateEmployeeRequest) request,
              (io.grpc.stub.StreamObserver<onboarding.service3.CreateEmployeeResponse>) responseObserver);
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
        case METHODID_ONBOARD_EMPLOYEE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.onboardEmployee(
              (io.grpc.stub.StreamObserver<onboarding.service3.OnboardingResponse>) responseObserver);
        case METHODID_CHECK_EMPLOYEE_STATUS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.checkEmployeeStatus(
              (io.grpc.stub.StreamObserver<onboarding.service3.EmployeeStatusResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class Onboarding_employeesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Onboarding_employeesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return onboarding.service3.Service3_Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Onboarding_employees");
    }
  }

  private static final class Onboarding_employeesFileDescriptorSupplier
      extends Onboarding_employeesBaseDescriptorSupplier {
    Onboarding_employeesFileDescriptorSupplier() {}
  }

  private static final class Onboarding_employeesMethodDescriptorSupplier
      extends Onboarding_employeesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Onboarding_employeesMethodDescriptorSupplier(String methodName) {
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
      synchronized (Onboarding_employeesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Onboarding_employeesFileDescriptorSupplier())
              .addMethod(getOnboardEmployeeMethod())
              .addMethod(getCreateEmployeeMethod())
              .addMethod(getCheckEmployeeStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
