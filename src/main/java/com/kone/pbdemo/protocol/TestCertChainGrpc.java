package com.kone.pbdemo.protocol;

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
    value = "by gRPC proto compiler (version 1.26.0)",
    comments = "Source: message.proto")
public final class TestCertChainGrpc {

  private TestCertChainGrpc() {}

  public static final String SERVICE_NAME = "protocol.TestCertChain";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.kone.pbdemo.protocol.Para> getGetIdentityCertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getIdentityCert",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.kone.pbdemo.protocol.Para.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.kone.pbdemo.protocol.Para> getGetIdentityCertMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.kone.pbdemo.protocol.Para> getGetIdentityCertMethod;
    if ((getGetIdentityCertMethod = TestCertChainGrpc.getGetIdentityCertMethod) == null) {
      synchronized (TestCertChainGrpc.class) {
        if ((getGetIdentityCertMethod = TestCertChainGrpc.getGetIdentityCertMethod) == null) {
          TestCertChainGrpc.getGetIdentityCertMethod = getGetIdentityCertMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.kone.pbdemo.protocol.Para>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getIdentityCert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kone.pbdemo.protocol.Para.getDefaultInstance()))
              .setSchemaDescriptor(new TestCertChainMethodDescriptorSupplier("getIdentityCert"))
              .build();
        }
      }
    }
    return getGetIdentityCertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.kone.pbdemo.protocol.Para> getGetX509CertChainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getX509CertChain",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.kone.pbdemo.protocol.Para.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.kone.pbdemo.protocol.Para> getGetX509CertChainMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.kone.pbdemo.protocol.Para> getGetX509CertChainMethod;
    if ((getGetX509CertChainMethod = TestCertChainGrpc.getGetX509CertChainMethod) == null) {
      synchronized (TestCertChainGrpc.class) {
        if ((getGetX509CertChainMethod = TestCertChainGrpc.getGetX509CertChainMethod) == null) {
          TestCertChainGrpc.getGetX509CertChainMethod = getGetX509CertChainMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.kone.pbdemo.protocol.Para>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getX509CertChain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kone.pbdemo.protocol.Para.getDefaultInstance()))
              .setSchemaDescriptor(new TestCertChainMethodDescriptorSupplier("getX509CertChain"))
              .build();
        }
      }
    }
    return getGetX509CertChainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.kone.pbdemo.protocol.Para2,
      com.kone.pbdemo.protocol.Para2> getGenerateSignatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "generateSignature",
      requestType = com.kone.pbdemo.protocol.Para2.class,
      responseType = com.kone.pbdemo.protocol.Para2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.kone.pbdemo.protocol.Para2,
      com.kone.pbdemo.protocol.Para2> getGenerateSignatureMethod() {
    io.grpc.MethodDescriptor<com.kone.pbdemo.protocol.Para2, com.kone.pbdemo.protocol.Para2> getGenerateSignatureMethod;
    if ((getGenerateSignatureMethod = TestCertChainGrpc.getGenerateSignatureMethod) == null) {
      synchronized (TestCertChainGrpc.class) {
        if ((getGenerateSignatureMethod = TestCertChainGrpc.getGenerateSignatureMethod) == null) {
          TestCertChainGrpc.getGenerateSignatureMethod = getGenerateSignatureMethod =
              io.grpc.MethodDescriptor.<com.kone.pbdemo.protocol.Para2, com.kone.pbdemo.protocol.Para2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "generateSignature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kone.pbdemo.protocol.Para2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.kone.pbdemo.protocol.Para2.getDefaultInstance()))
              .setSchemaDescriptor(new TestCertChainMethodDescriptorSupplier("generateSignature"))
              .build();
        }
      }
    }
    return getGenerateSignatureMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TestCertChainStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestCertChainStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestCertChainStub>() {
        @java.lang.Override
        public TestCertChainStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestCertChainStub(channel, callOptions);
        }
      };
    return TestCertChainStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TestCertChainBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestCertChainBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestCertChainBlockingStub>() {
        @java.lang.Override
        public TestCertChainBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestCertChainBlockingStub(channel, callOptions);
        }
      };
    return TestCertChainBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TestCertChainFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestCertChainFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestCertChainFutureStub>() {
        @java.lang.Override
        public TestCertChainFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestCertChainFutureStub(channel, callOptions);
        }
      };
    return TestCertChainFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TestCertChainImplBase implements io.grpc.BindableService {

    /**
     */
    public void getIdentityCert(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.kone.pbdemo.protocol.Para> responseObserver) {
      asyncUnimplementedUnaryCall(getGetIdentityCertMethod(), responseObserver);
    }

    /**
     */
    public void getX509CertChain(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.kone.pbdemo.protocol.Para> responseObserver) {
      asyncUnimplementedUnaryCall(getGetX509CertChainMethod(), responseObserver);
    }

    /**
     */
    public void generateSignature(com.kone.pbdemo.protocol.Para2 request,
        io.grpc.stub.StreamObserver<com.kone.pbdemo.protocol.Para2> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateSignatureMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetIdentityCertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.kone.pbdemo.protocol.Para>(
                  this, METHODID_GET_IDENTITY_CERT)))
          .addMethod(
            getGetX509CertChainMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.kone.pbdemo.protocol.Para>(
                  this, METHODID_GET_X509CERT_CHAIN)))
          .addMethod(
            getGenerateSignatureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.kone.pbdemo.protocol.Para2,
                com.kone.pbdemo.protocol.Para2>(
                  this, METHODID_GENERATE_SIGNATURE)))
          .build();
    }
  }

  /**
   */
  public static final class TestCertChainStub extends io.grpc.stub.AbstractAsyncStub<TestCertChainStub> {
    private TestCertChainStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestCertChainStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestCertChainStub(channel, callOptions);
    }

    /**
     */
    public void getIdentityCert(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.kone.pbdemo.protocol.Para> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetIdentityCertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getX509CertChain(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.kone.pbdemo.protocol.Para> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetX509CertChainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void generateSignature(com.kone.pbdemo.protocol.Para2 request,
        io.grpc.stub.StreamObserver<com.kone.pbdemo.protocol.Para2> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateSignatureMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TestCertChainBlockingStub extends io.grpc.stub.AbstractBlockingStub<TestCertChainBlockingStub> {
    private TestCertChainBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestCertChainBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestCertChainBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.kone.pbdemo.protocol.Para getIdentityCert(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetIdentityCertMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.kone.pbdemo.protocol.Para getX509CertChain(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetX509CertChainMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.kone.pbdemo.protocol.Para2 generateSignature(com.kone.pbdemo.protocol.Para2 request) {
      return blockingUnaryCall(
          getChannel(), getGenerateSignatureMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TestCertChainFutureStub extends io.grpc.stub.AbstractFutureStub<TestCertChainFutureStub> {
    private TestCertChainFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestCertChainFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestCertChainFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kone.pbdemo.protocol.Para> getIdentityCert(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetIdentityCertMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kone.pbdemo.protocol.Para> getX509CertChain(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetX509CertChainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.kone.pbdemo.protocol.Para2> generateSignature(
        com.kone.pbdemo.protocol.Para2 request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateSignatureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_IDENTITY_CERT = 0;
  private static final int METHODID_GET_X509CERT_CHAIN = 1;
  private static final int METHODID_GENERATE_SIGNATURE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TestCertChainImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TestCertChainImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_IDENTITY_CERT:
          serviceImpl.getIdentityCert((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.kone.pbdemo.protocol.Para>) responseObserver);
          break;
        case METHODID_GET_X509CERT_CHAIN:
          serviceImpl.getX509CertChain((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.kone.pbdemo.protocol.Para>) responseObserver);
          break;
        case METHODID_GENERATE_SIGNATURE:
          serviceImpl.generateSignature((com.kone.pbdemo.protocol.Para2) request,
              (io.grpc.stub.StreamObserver<com.kone.pbdemo.protocol.Para2>) responseObserver);
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

  private static abstract class TestCertChainBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TestCertChainBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.kone.pbdemo.protocol.Message.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TestCertChain");
    }
  }

  private static final class TestCertChainFileDescriptorSupplier
      extends TestCertChainBaseDescriptorSupplier {
    TestCertChainFileDescriptorSupplier() {}
  }

  private static final class TestCertChainMethodDescriptorSupplier
      extends TestCertChainBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TestCertChainMethodDescriptorSupplier(String methodName) {
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
      synchronized (TestCertChainGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TestCertChainFileDescriptorSupplier())
              .addMethod(getGetIdentityCertMethod())
              .addMethod(getGetX509CertChainMethod())
              .addMethod(getGenerateSignatureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
