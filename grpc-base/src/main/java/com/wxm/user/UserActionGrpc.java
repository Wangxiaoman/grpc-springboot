package com.wxm.user;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: userAction.proto")
public final class UserActionGrpc {

  private UserActionGrpc() {}

  public static final String SERVICE_NAME = "UserAction";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.wxm.user.UserActionRequest,
      com.wxm.user.UserActionReply> getSaveUserActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveUserAction",
      requestType = com.wxm.user.UserActionRequest.class,
      responseType = com.wxm.user.UserActionReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wxm.user.UserActionRequest,
      com.wxm.user.UserActionReply> getSaveUserActionMethod() {
    io.grpc.MethodDescriptor<com.wxm.user.UserActionRequest, com.wxm.user.UserActionReply> getSaveUserActionMethod;
    if ((getSaveUserActionMethod = UserActionGrpc.getSaveUserActionMethod) == null) {
      synchronized (UserActionGrpc.class) {
        if ((getSaveUserActionMethod = UserActionGrpc.getSaveUserActionMethod) == null) {
          UserActionGrpc.getSaveUserActionMethod = getSaveUserActionMethod = 
              io.grpc.MethodDescriptor.<com.wxm.user.UserActionRequest, com.wxm.user.UserActionReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserAction", "saveUserAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wxm.user.UserActionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wxm.user.UserActionReply.getDefaultInstance()))
                  .setSchemaDescriptor(new UserActionMethodDescriptorSupplier("saveUserAction"))
                  .build();
          }
        }
     }
     return getSaveUserActionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wxm.user.UserActionsRequest,
      com.wxm.user.UserActionReply> getSaveUserActionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveUserActions",
      requestType = com.wxm.user.UserActionsRequest.class,
      responseType = com.wxm.user.UserActionReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wxm.user.UserActionsRequest,
      com.wxm.user.UserActionReply> getSaveUserActionsMethod() {
    io.grpc.MethodDescriptor<com.wxm.user.UserActionsRequest, com.wxm.user.UserActionReply> getSaveUserActionsMethod;
    if ((getSaveUserActionsMethod = UserActionGrpc.getSaveUserActionsMethod) == null) {
      synchronized (UserActionGrpc.class) {
        if ((getSaveUserActionsMethod = UserActionGrpc.getSaveUserActionsMethod) == null) {
          UserActionGrpc.getSaveUserActionsMethod = getSaveUserActionsMethod = 
              io.grpc.MethodDescriptor.<com.wxm.user.UserActionsRequest, com.wxm.user.UserActionReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserAction", "saveUserActions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wxm.user.UserActionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wxm.user.UserActionReply.getDefaultInstance()))
                  .setSchemaDescriptor(new UserActionMethodDescriptorSupplier("saveUserActions"))
                  .build();
          }
        }
     }
     return getSaveUserActionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wxm.user.UserActionsRequest,
      com.wxm.user.UserActionReply> getGetUserActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserAction",
      requestType = com.wxm.user.UserActionsRequest.class,
      responseType = com.wxm.user.UserActionReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wxm.user.UserActionsRequest,
      com.wxm.user.UserActionReply> getGetUserActionMethod() {
    io.grpc.MethodDescriptor<com.wxm.user.UserActionsRequest, com.wxm.user.UserActionReply> getGetUserActionMethod;
    if ((getGetUserActionMethod = UserActionGrpc.getGetUserActionMethod) == null) {
      synchronized (UserActionGrpc.class) {
        if ((getGetUserActionMethod = UserActionGrpc.getGetUserActionMethod) == null) {
          UserActionGrpc.getGetUserActionMethod = getGetUserActionMethod = 
              io.grpc.MethodDescriptor.<com.wxm.user.UserActionsRequest, com.wxm.user.UserActionReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserAction", "getUserAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wxm.user.UserActionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wxm.user.UserActionReply.getDefaultInstance()))
                  .setSchemaDescriptor(new UserActionMethodDescriptorSupplier("getUserAction"))
                  .build();
          }
        }
     }
     return getGetUserActionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserActionStub newStub(io.grpc.Channel channel) {
    return new UserActionStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserActionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserActionBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserActionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserActionFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class UserActionImplBase implements io.grpc.BindableService {

    /**
     */
    public void saveUserAction(com.wxm.user.UserActionRequest request,
        io.grpc.stub.StreamObserver<com.wxm.user.UserActionReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveUserActionMethod(), responseObserver);
    }

    /**
     */
    public void saveUserActions(com.wxm.user.UserActionsRequest request,
        io.grpc.stub.StreamObserver<com.wxm.user.UserActionReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveUserActionsMethod(), responseObserver);
    }

    /**
     */
    public void getUserAction(com.wxm.user.UserActionsRequest request,
        io.grpc.stub.StreamObserver<com.wxm.user.UserActionReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserActionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveUserActionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.wxm.user.UserActionRequest,
                com.wxm.user.UserActionReply>(
                  this, METHODID_SAVE_USER_ACTION)))
          .addMethod(
            getSaveUserActionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.wxm.user.UserActionsRequest,
                com.wxm.user.UserActionReply>(
                  this, METHODID_SAVE_USER_ACTIONS)))
          .addMethod(
            getGetUserActionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.wxm.user.UserActionsRequest,
                com.wxm.user.UserActionReply>(
                  this, METHODID_GET_USER_ACTION)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class UserActionStub extends io.grpc.stub.AbstractStub<UserActionStub> {
    private UserActionStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserActionStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserActionStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserActionStub(channel, callOptions);
    }

    /**
     */
    public void saveUserAction(com.wxm.user.UserActionRequest request,
        io.grpc.stub.StreamObserver<com.wxm.user.UserActionReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveUserActionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveUserActions(com.wxm.user.UserActionsRequest request,
        io.grpc.stub.StreamObserver<com.wxm.user.UserActionReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveUserActionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserAction(com.wxm.user.UserActionsRequest request,
        io.grpc.stub.StreamObserver<com.wxm.user.UserActionReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserActionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class UserActionBlockingStub extends io.grpc.stub.AbstractStub<UserActionBlockingStub> {
    private UserActionBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserActionBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserActionBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserActionBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.wxm.user.UserActionReply saveUserAction(com.wxm.user.UserActionRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveUserActionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wxm.user.UserActionReply saveUserActions(com.wxm.user.UserActionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveUserActionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wxm.user.UserActionReply getUserAction(com.wxm.user.UserActionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserActionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class UserActionFutureStub extends io.grpc.stub.AbstractStub<UserActionFutureStub> {
    private UserActionFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserActionFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserActionFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserActionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wxm.user.UserActionReply> saveUserAction(
        com.wxm.user.UserActionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveUserActionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wxm.user.UserActionReply> saveUserActions(
        com.wxm.user.UserActionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveUserActionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wxm.user.UserActionReply> getUserAction(
        com.wxm.user.UserActionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserActionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_USER_ACTION = 0;
  private static final int METHODID_SAVE_USER_ACTIONS = 1;
  private static final int METHODID_GET_USER_ACTION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserActionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserActionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_USER_ACTION:
          serviceImpl.saveUserAction((com.wxm.user.UserActionRequest) request,
              (io.grpc.stub.StreamObserver<com.wxm.user.UserActionReply>) responseObserver);
          break;
        case METHODID_SAVE_USER_ACTIONS:
          serviceImpl.saveUserActions((com.wxm.user.UserActionsRequest) request,
              (io.grpc.stub.StreamObserver<com.wxm.user.UserActionReply>) responseObserver);
          break;
        case METHODID_GET_USER_ACTION:
          serviceImpl.getUserAction((com.wxm.user.UserActionsRequest) request,
              (io.grpc.stub.StreamObserver<com.wxm.user.UserActionReply>) responseObserver);
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

  private static abstract class UserActionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserActionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wxm.user.UserActionProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserAction");
    }
  }

  private static final class UserActionFileDescriptorSupplier
      extends UserActionBaseDescriptorSupplier {
    UserActionFileDescriptorSupplier() {}
  }

  private static final class UserActionMethodDescriptorSupplier
      extends UserActionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserActionMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserActionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserActionFileDescriptorSupplier())
              .addMethod(getSaveUserActionMethod())
              .addMethod(getSaveUserActionsMethod())
              .addMethod(getGetUserActionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
