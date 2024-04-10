package org.example.grpc;

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
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: NumberService.proto")
public final class NumberServiceGrpc {

  private NumberServiceGrpc() {}

  public static final String SERVICE_NAME = "org.example.grpc.NumberService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.grpc.NumberServiceOuterClass.Request,
      org.example.grpc.NumberServiceOuterClass.Response> getGenerateNumbersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "generateNumbers",
      requestType = org.example.grpc.NumberServiceOuterClass.Request.class,
      responseType = org.example.grpc.NumberServiceOuterClass.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.grpc.NumberServiceOuterClass.Request,
      org.example.grpc.NumberServiceOuterClass.Response> getGenerateNumbersMethod() {
    io.grpc.MethodDescriptor<org.example.grpc.NumberServiceOuterClass.Request, org.example.grpc.NumberServiceOuterClass.Response> getGenerateNumbersMethod;
    if ((getGenerateNumbersMethod = NumberServiceGrpc.getGenerateNumbersMethod) == null) {
      synchronized (NumberServiceGrpc.class) {
        if ((getGenerateNumbersMethod = NumberServiceGrpc.getGenerateNumbersMethod) == null) {
          NumberServiceGrpc.getGenerateNumbersMethod = getGenerateNumbersMethod =
              io.grpc.MethodDescriptor.<org.example.grpc.NumberServiceOuterClass.Request, org.example.grpc.NumberServiceOuterClass.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "generateNumbers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.NumberServiceOuterClass.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.grpc.NumberServiceOuterClass.Response.getDefaultInstance()))
              .setSchemaDescriptor(new NumberServiceMethodDescriptorSupplier("generateNumbers"))
              .build();
        }
      }
    }
    return getGenerateNumbersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NumberServiceStub newStub(io.grpc.Channel channel) {
    return new NumberServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NumberServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NumberServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NumberServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NumberServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class NumberServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void generateNumbers(org.example.grpc.NumberServiceOuterClass.Request request,
        io.grpc.stub.StreamObserver<org.example.grpc.NumberServiceOuterClass.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateNumbersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGenerateNumbersMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                org.example.grpc.NumberServiceOuterClass.Request,
                org.example.grpc.NumberServiceOuterClass.Response>(
                  this, METHODID_GENERATE_NUMBERS)))
          .build();
    }
  }

  /**
   */
  public static final class NumberServiceStub extends io.grpc.stub.AbstractStub<NumberServiceStub> {
    private NumberServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NumberServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NumberServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NumberServiceStub(channel, callOptions);
    }

    /**
     */
    public void generateNumbers(org.example.grpc.NumberServiceOuterClass.Request request,
        io.grpc.stub.StreamObserver<org.example.grpc.NumberServiceOuterClass.Response> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGenerateNumbersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NumberServiceBlockingStub extends io.grpc.stub.AbstractStub<NumberServiceBlockingStub> {
    private NumberServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NumberServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NumberServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NumberServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<org.example.grpc.NumberServiceOuterClass.Response> generateNumbers(
        org.example.grpc.NumberServiceOuterClass.Request request) {
      return blockingServerStreamingCall(
          getChannel(), getGenerateNumbersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NumberServiceFutureStub extends io.grpc.stub.AbstractStub<NumberServiceFutureStub> {
    private NumberServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NumberServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NumberServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NumberServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GENERATE_NUMBERS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NumberServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NumberServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GENERATE_NUMBERS:
          serviceImpl.generateNumbers((org.example.grpc.NumberServiceOuterClass.Request) request,
              (io.grpc.stub.StreamObserver<org.example.grpc.NumberServiceOuterClass.Response>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class NumberServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NumberServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.grpc.NumberServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NumberService");
    }
  }

  private static final class NumberServiceFileDescriptorSupplier
      extends NumberServiceBaseDescriptorSupplier {
    NumberServiceFileDescriptorSupplier() {}
  }

  private static final class NumberServiceMethodDescriptorSupplier
      extends NumberServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NumberServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NumberServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NumberServiceFileDescriptorSupplier())
              .addMethod(getGenerateNumbersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
