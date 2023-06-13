package com.sheeps.jsonbin.pb;

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
    comments = "Source: jsonbin.proto")
public final class JsonStorageServiceGrpc {

  private JsonStorageServiceGrpc() {}

  public static final String SERVICE_NAME = "pb.JsonStorageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sheeps.jsonbin.pb.Jsonbin.GetDocRequest,
      com.sheeps.jsonbin.pb.Jsonbin.GetDocResponse> getGetDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDocument",
      requestType = com.sheeps.jsonbin.pb.Jsonbin.GetDocRequest.class,
      responseType = com.sheeps.jsonbin.pb.Jsonbin.GetDocResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sheeps.jsonbin.pb.Jsonbin.GetDocRequest,
      com.sheeps.jsonbin.pb.Jsonbin.GetDocResponse> getGetDocumentMethod() {
    io.grpc.MethodDescriptor<com.sheeps.jsonbin.pb.Jsonbin.GetDocRequest, com.sheeps.jsonbin.pb.Jsonbin.GetDocResponse> getGetDocumentMethod;
    if ((getGetDocumentMethod = JsonStorageServiceGrpc.getGetDocumentMethod) == null) {
      synchronized (JsonStorageServiceGrpc.class) {
        if ((getGetDocumentMethod = JsonStorageServiceGrpc.getGetDocumentMethod) == null) {
          JsonStorageServiceGrpc.getGetDocumentMethod = getGetDocumentMethod = 
              io.grpc.MethodDescriptor.<com.sheeps.jsonbin.pb.Jsonbin.GetDocRequest, com.sheeps.jsonbin.pb.Jsonbin.GetDocResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "pb.JsonStorageService", "GetDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sheeps.jsonbin.pb.Jsonbin.GetDocRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sheeps.jsonbin.pb.Jsonbin.GetDocResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JsonStorageServiceMethodDescriptorSupplier("GetDocument"))
                  .build();
          }
        }
     }
     return getGetDocumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sheeps.jsonbin.pb.Jsonbin.GetDocsRequest,
      com.sheeps.jsonbin.pb.Jsonbin.GetDocsResponse> getGetDocumentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDocuments",
      requestType = com.sheeps.jsonbin.pb.Jsonbin.GetDocsRequest.class,
      responseType = com.sheeps.jsonbin.pb.Jsonbin.GetDocsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sheeps.jsonbin.pb.Jsonbin.GetDocsRequest,
      com.sheeps.jsonbin.pb.Jsonbin.GetDocsResponse> getGetDocumentsMethod() {
    io.grpc.MethodDescriptor<com.sheeps.jsonbin.pb.Jsonbin.GetDocsRequest, com.sheeps.jsonbin.pb.Jsonbin.GetDocsResponse> getGetDocumentsMethod;
    if ((getGetDocumentsMethod = JsonStorageServiceGrpc.getGetDocumentsMethod) == null) {
      synchronized (JsonStorageServiceGrpc.class) {
        if ((getGetDocumentsMethod = JsonStorageServiceGrpc.getGetDocumentsMethod) == null) {
          JsonStorageServiceGrpc.getGetDocumentsMethod = getGetDocumentsMethod = 
              io.grpc.MethodDescriptor.<com.sheeps.jsonbin.pb.Jsonbin.GetDocsRequest, com.sheeps.jsonbin.pb.Jsonbin.GetDocsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "pb.JsonStorageService", "GetDocuments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sheeps.jsonbin.pb.Jsonbin.GetDocsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sheeps.jsonbin.pb.Jsonbin.GetDocsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JsonStorageServiceMethodDescriptorSupplier("GetDocuments"))
                  .build();
          }
        }
     }
     return getGetDocumentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sheeps.jsonbin.pb.Jsonbin.GetDocsRequest,
      com.sheeps.jsonbin.pb.Jsonbin.GetDocsStreamResponse> getGetStreamDocumentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStreamDocuments",
      requestType = com.sheeps.jsonbin.pb.Jsonbin.GetDocsRequest.class,
      responseType = com.sheeps.jsonbin.pb.Jsonbin.GetDocsStreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.sheeps.jsonbin.pb.Jsonbin.GetDocsRequest,
      com.sheeps.jsonbin.pb.Jsonbin.GetDocsStreamResponse> getGetStreamDocumentsMethod() {
    io.grpc.MethodDescriptor<com.sheeps.jsonbin.pb.Jsonbin.GetDocsRequest, com.sheeps.jsonbin.pb.Jsonbin.GetDocsStreamResponse> getGetStreamDocumentsMethod;
    if ((getGetStreamDocumentsMethod = JsonStorageServiceGrpc.getGetStreamDocumentsMethod) == null) {
      synchronized (JsonStorageServiceGrpc.class) {
        if ((getGetStreamDocumentsMethod = JsonStorageServiceGrpc.getGetStreamDocumentsMethod) == null) {
          JsonStorageServiceGrpc.getGetStreamDocumentsMethod = getGetStreamDocumentsMethod = 
              io.grpc.MethodDescriptor.<com.sheeps.jsonbin.pb.Jsonbin.GetDocsRequest, com.sheeps.jsonbin.pb.Jsonbin.GetDocsStreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "pb.JsonStorageService", "GetStreamDocuments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sheeps.jsonbin.pb.Jsonbin.GetDocsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sheeps.jsonbin.pb.Jsonbin.GetDocsStreamResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JsonStorageServiceMethodDescriptorSupplier("GetStreamDocuments"))
                  .build();
          }
        }
     }
     return getGetStreamDocumentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sheeps.jsonbin.pb.Jsonbin.CountDocsRequest,
      com.sheeps.jsonbin.pb.Jsonbin.CountDocsResponse> getCountDocumentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CountDocuments",
      requestType = com.sheeps.jsonbin.pb.Jsonbin.CountDocsRequest.class,
      responseType = com.sheeps.jsonbin.pb.Jsonbin.CountDocsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sheeps.jsonbin.pb.Jsonbin.CountDocsRequest,
      com.sheeps.jsonbin.pb.Jsonbin.CountDocsResponse> getCountDocumentsMethod() {
    io.grpc.MethodDescriptor<com.sheeps.jsonbin.pb.Jsonbin.CountDocsRequest, com.sheeps.jsonbin.pb.Jsonbin.CountDocsResponse> getCountDocumentsMethod;
    if ((getCountDocumentsMethod = JsonStorageServiceGrpc.getCountDocumentsMethod) == null) {
      synchronized (JsonStorageServiceGrpc.class) {
        if ((getCountDocumentsMethod = JsonStorageServiceGrpc.getCountDocumentsMethod) == null) {
          JsonStorageServiceGrpc.getCountDocumentsMethod = getCountDocumentsMethod = 
              io.grpc.MethodDescriptor.<com.sheeps.jsonbin.pb.Jsonbin.CountDocsRequest, com.sheeps.jsonbin.pb.Jsonbin.CountDocsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "pb.JsonStorageService", "CountDocuments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sheeps.jsonbin.pb.Jsonbin.CountDocsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sheeps.jsonbin.pb.Jsonbin.CountDocsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JsonStorageServiceMethodDescriptorSupplier("CountDocuments"))
                  .build();
          }
        }
     }
     return getCountDocumentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sheeps.jsonbin.pb.Jsonbin.PushDocsRequest,
      com.sheeps.jsonbin.pb.Jsonbin.PushDocsResponse> getPushDocumentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PushDocuments",
      requestType = com.sheeps.jsonbin.pb.Jsonbin.PushDocsRequest.class,
      responseType = com.sheeps.jsonbin.pb.Jsonbin.PushDocsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sheeps.jsonbin.pb.Jsonbin.PushDocsRequest,
      com.sheeps.jsonbin.pb.Jsonbin.PushDocsResponse> getPushDocumentsMethod() {
    io.grpc.MethodDescriptor<com.sheeps.jsonbin.pb.Jsonbin.PushDocsRequest, com.sheeps.jsonbin.pb.Jsonbin.PushDocsResponse> getPushDocumentsMethod;
    if ((getPushDocumentsMethod = JsonStorageServiceGrpc.getPushDocumentsMethod) == null) {
      synchronized (JsonStorageServiceGrpc.class) {
        if ((getPushDocumentsMethod = JsonStorageServiceGrpc.getPushDocumentsMethod) == null) {
          JsonStorageServiceGrpc.getPushDocumentsMethod = getPushDocumentsMethod = 
              io.grpc.MethodDescriptor.<com.sheeps.jsonbin.pb.Jsonbin.PushDocsRequest, com.sheeps.jsonbin.pb.Jsonbin.PushDocsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "pb.JsonStorageService", "PushDocuments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sheeps.jsonbin.pb.Jsonbin.PushDocsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sheeps.jsonbin.pb.Jsonbin.PushDocsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JsonStorageServiceMethodDescriptorSupplier("PushDocuments"))
                  .build();
          }
        }
     }
     return getPushDocumentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sheeps.jsonbin.pb.Jsonbin.PatchDocsRequest,
      com.sheeps.jsonbin.pb.Jsonbin.PatchDocsResponse> getPatchDocumentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PatchDocuments",
      requestType = com.sheeps.jsonbin.pb.Jsonbin.PatchDocsRequest.class,
      responseType = com.sheeps.jsonbin.pb.Jsonbin.PatchDocsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sheeps.jsonbin.pb.Jsonbin.PatchDocsRequest,
      com.sheeps.jsonbin.pb.Jsonbin.PatchDocsResponse> getPatchDocumentsMethod() {
    io.grpc.MethodDescriptor<com.sheeps.jsonbin.pb.Jsonbin.PatchDocsRequest, com.sheeps.jsonbin.pb.Jsonbin.PatchDocsResponse> getPatchDocumentsMethod;
    if ((getPatchDocumentsMethod = JsonStorageServiceGrpc.getPatchDocumentsMethod) == null) {
      synchronized (JsonStorageServiceGrpc.class) {
        if ((getPatchDocumentsMethod = JsonStorageServiceGrpc.getPatchDocumentsMethod) == null) {
          JsonStorageServiceGrpc.getPatchDocumentsMethod = getPatchDocumentsMethod = 
              io.grpc.MethodDescriptor.<com.sheeps.jsonbin.pb.Jsonbin.PatchDocsRequest, com.sheeps.jsonbin.pb.Jsonbin.PatchDocsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "pb.JsonStorageService", "PatchDocuments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sheeps.jsonbin.pb.Jsonbin.PatchDocsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sheeps.jsonbin.pb.Jsonbin.PatchDocsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JsonStorageServiceMethodDescriptorSupplier("PatchDocuments"))
                  .build();
          }
        }
     }
     return getPatchDocumentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sheeps.jsonbin.pb.Jsonbin.DeleteDocsRequest,
      com.sheeps.jsonbin.pb.Jsonbin.DeleteDocsResponse> getDeleteDocumentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDocuments",
      requestType = com.sheeps.jsonbin.pb.Jsonbin.DeleteDocsRequest.class,
      responseType = com.sheeps.jsonbin.pb.Jsonbin.DeleteDocsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sheeps.jsonbin.pb.Jsonbin.DeleteDocsRequest,
      com.sheeps.jsonbin.pb.Jsonbin.DeleteDocsResponse> getDeleteDocumentsMethod() {
    io.grpc.MethodDescriptor<com.sheeps.jsonbin.pb.Jsonbin.DeleteDocsRequest, com.sheeps.jsonbin.pb.Jsonbin.DeleteDocsResponse> getDeleteDocumentsMethod;
    if ((getDeleteDocumentsMethod = JsonStorageServiceGrpc.getDeleteDocumentsMethod) == null) {
      synchronized (JsonStorageServiceGrpc.class) {
        if ((getDeleteDocumentsMethod = JsonStorageServiceGrpc.getDeleteDocumentsMethod) == null) {
          JsonStorageServiceGrpc.getDeleteDocumentsMethod = getDeleteDocumentsMethod = 
              io.grpc.MethodDescriptor.<com.sheeps.jsonbin.pb.Jsonbin.DeleteDocsRequest, com.sheeps.jsonbin.pb.Jsonbin.DeleteDocsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "pb.JsonStorageService", "DeleteDocuments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sheeps.jsonbin.pb.Jsonbin.DeleteDocsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sheeps.jsonbin.pb.Jsonbin.DeleteDocsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JsonStorageServiceMethodDescriptorSupplier("DeleteDocuments"))
                  .build();
          }
        }
     }
     return getDeleteDocumentsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JsonStorageServiceStub newStub(io.grpc.Channel channel) {
    return new JsonStorageServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JsonStorageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new JsonStorageServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JsonStorageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new JsonStorageServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class JsonStorageServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getDocument(com.sheeps.jsonbin.pb.Jsonbin.GetDocRequest request,
        io.grpc.stub.StreamObserver<com.sheeps.jsonbin.pb.Jsonbin.GetDocResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDocumentMethod(), responseObserver);
    }

    /**
     */
    public void getDocuments(com.sheeps.jsonbin.pb.Jsonbin.GetDocsRequest request,
        io.grpc.stub.StreamObserver<com.sheeps.jsonbin.pb.Jsonbin.GetDocsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDocumentsMethod(), responseObserver);
    }

    /**
     */
    public void getStreamDocuments(com.sheeps.jsonbin.pb.Jsonbin.GetDocsRequest request,
        io.grpc.stub.StreamObserver<com.sheeps.jsonbin.pb.Jsonbin.GetDocsStreamResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStreamDocumentsMethod(), responseObserver);
    }

    /**
     */
    public void countDocuments(com.sheeps.jsonbin.pb.Jsonbin.CountDocsRequest request,
        io.grpc.stub.StreamObserver<com.sheeps.jsonbin.pb.Jsonbin.CountDocsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCountDocumentsMethod(), responseObserver);
    }

    /**
     */
    public void pushDocuments(com.sheeps.jsonbin.pb.Jsonbin.PushDocsRequest request,
        io.grpc.stub.StreamObserver<com.sheeps.jsonbin.pb.Jsonbin.PushDocsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPushDocumentsMethod(), responseObserver);
    }

    /**
     */
    public void patchDocuments(com.sheeps.jsonbin.pb.Jsonbin.PatchDocsRequest request,
        io.grpc.stub.StreamObserver<com.sheeps.jsonbin.pb.Jsonbin.PatchDocsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPatchDocumentsMethod(), responseObserver);
    }

    /**
     */
    public void deleteDocuments(com.sheeps.jsonbin.pb.Jsonbin.DeleteDocsRequest request,
        io.grpc.stub.StreamObserver<com.sheeps.jsonbin.pb.Jsonbin.DeleteDocsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteDocumentsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDocumentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sheeps.jsonbin.pb.Jsonbin.GetDocRequest,
                com.sheeps.jsonbin.pb.Jsonbin.GetDocResponse>(
                  this, METHODID_GET_DOCUMENT)))
          .addMethod(
            getGetDocumentsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sheeps.jsonbin.pb.Jsonbin.GetDocsRequest,
                com.sheeps.jsonbin.pb.Jsonbin.GetDocsResponse>(
                  this, METHODID_GET_DOCUMENTS)))
          .addMethod(
            getGetStreamDocumentsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.sheeps.jsonbin.pb.Jsonbin.GetDocsRequest,
                com.sheeps.jsonbin.pb.Jsonbin.GetDocsStreamResponse>(
                  this, METHODID_GET_STREAM_DOCUMENTS)))
          .addMethod(
            getCountDocumentsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sheeps.jsonbin.pb.Jsonbin.CountDocsRequest,
                com.sheeps.jsonbin.pb.Jsonbin.CountDocsResponse>(
                  this, METHODID_COUNT_DOCUMENTS)))
          .addMethod(
            getPushDocumentsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sheeps.jsonbin.pb.Jsonbin.PushDocsRequest,
                com.sheeps.jsonbin.pb.Jsonbin.PushDocsResponse>(
                  this, METHODID_PUSH_DOCUMENTS)))
          .addMethod(
            getPatchDocumentsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sheeps.jsonbin.pb.Jsonbin.PatchDocsRequest,
                com.sheeps.jsonbin.pb.Jsonbin.PatchDocsResponse>(
                  this, METHODID_PATCH_DOCUMENTS)))
          .addMethod(
            getDeleteDocumentsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sheeps.jsonbin.pb.Jsonbin.DeleteDocsRequest,
                com.sheeps.jsonbin.pb.Jsonbin.DeleteDocsResponse>(
                  this, METHODID_DELETE_DOCUMENTS)))
          .build();
    }
  }

  /**
   */
  public static final class JsonStorageServiceStub extends io.grpc.stub.AbstractStub<JsonStorageServiceStub> {
    private JsonStorageServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JsonStorageServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JsonStorageServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JsonStorageServiceStub(channel, callOptions);
    }

    /**
     */
    public void getDocument(com.sheeps.jsonbin.pb.Jsonbin.GetDocRequest request,
        io.grpc.stub.StreamObserver<com.sheeps.jsonbin.pb.Jsonbin.GetDocResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDocumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDocuments(com.sheeps.jsonbin.pb.Jsonbin.GetDocsRequest request,
        io.grpc.stub.StreamObserver<com.sheeps.jsonbin.pb.Jsonbin.GetDocsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDocumentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStreamDocuments(com.sheeps.jsonbin.pb.Jsonbin.GetDocsRequest request,
        io.grpc.stub.StreamObserver<com.sheeps.jsonbin.pb.Jsonbin.GetDocsStreamResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetStreamDocumentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void countDocuments(com.sheeps.jsonbin.pb.Jsonbin.CountDocsRequest request,
        io.grpc.stub.StreamObserver<com.sheeps.jsonbin.pb.Jsonbin.CountDocsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCountDocumentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pushDocuments(com.sheeps.jsonbin.pb.Jsonbin.PushDocsRequest request,
        io.grpc.stub.StreamObserver<com.sheeps.jsonbin.pb.Jsonbin.PushDocsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPushDocumentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void patchDocuments(com.sheeps.jsonbin.pb.Jsonbin.PatchDocsRequest request,
        io.grpc.stub.StreamObserver<com.sheeps.jsonbin.pb.Jsonbin.PatchDocsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPatchDocumentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDocuments(com.sheeps.jsonbin.pb.Jsonbin.DeleteDocsRequest request,
        io.grpc.stub.StreamObserver<com.sheeps.jsonbin.pb.Jsonbin.DeleteDocsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteDocumentsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JsonStorageServiceBlockingStub extends io.grpc.stub.AbstractStub<JsonStorageServiceBlockingStub> {
    private JsonStorageServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JsonStorageServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JsonStorageServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JsonStorageServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sheeps.jsonbin.pb.Jsonbin.GetDocResponse getDocument(com.sheeps.jsonbin.pb.Jsonbin.GetDocRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDocumentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sheeps.jsonbin.pb.Jsonbin.GetDocsResponse getDocuments(com.sheeps.jsonbin.pb.Jsonbin.GetDocsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDocumentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.sheeps.jsonbin.pb.Jsonbin.GetDocsStreamResponse> getStreamDocuments(
        com.sheeps.jsonbin.pb.Jsonbin.GetDocsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetStreamDocumentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sheeps.jsonbin.pb.Jsonbin.CountDocsResponse countDocuments(com.sheeps.jsonbin.pb.Jsonbin.CountDocsRequest request) {
      return blockingUnaryCall(
          getChannel(), getCountDocumentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sheeps.jsonbin.pb.Jsonbin.PushDocsResponse pushDocuments(com.sheeps.jsonbin.pb.Jsonbin.PushDocsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPushDocumentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sheeps.jsonbin.pb.Jsonbin.PatchDocsResponse patchDocuments(com.sheeps.jsonbin.pb.Jsonbin.PatchDocsRequest request) {
      return blockingUnaryCall(
          getChannel(), getPatchDocumentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sheeps.jsonbin.pb.Jsonbin.DeleteDocsResponse deleteDocuments(com.sheeps.jsonbin.pb.Jsonbin.DeleteDocsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteDocumentsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JsonStorageServiceFutureStub extends io.grpc.stub.AbstractStub<JsonStorageServiceFutureStub> {
    private JsonStorageServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JsonStorageServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JsonStorageServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JsonStorageServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sheeps.jsonbin.pb.Jsonbin.GetDocResponse> getDocument(
        com.sheeps.jsonbin.pb.Jsonbin.GetDocRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDocumentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sheeps.jsonbin.pb.Jsonbin.GetDocsResponse> getDocuments(
        com.sheeps.jsonbin.pb.Jsonbin.GetDocsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDocumentsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sheeps.jsonbin.pb.Jsonbin.CountDocsResponse> countDocuments(
        com.sheeps.jsonbin.pb.Jsonbin.CountDocsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCountDocumentsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sheeps.jsonbin.pb.Jsonbin.PushDocsResponse> pushDocuments(
        com.sheeps.jsonbin.pb.Jsonbin.PushDocsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPushDocumentsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sheeps.jsonbin.pb.Jsonbin.PatchDocsResponse> patchDocuments(
        com.sheeps.jsonbin.pb.Jsonbin.PatchDocsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPatchDocumentsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sheeps.jsonbin.pb.Jsonbin.DeleteDocsResponse> deleteDocuments(
        com.sheeps.jsonbin.pb.Jsonbin.DeleteDocsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteDocumentsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DOCUMENT = 0;
  private static final int METHODID_GET_DOCUMENTS = 1;
  private static final int METHODID_GET_STREAM_DOCUMENTS = 2;
  private static final int METHODID_COUNT_DOCUMENTS = 3;
  private static final int METHODID_PUSH_DOCUMENTS = 4;
  private static final int METHODID_PATCH_DOCUMENTS = 5;
  private static final int METHODID_DELETE_DOCUMENTS = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JsonStorageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JsonStorageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DOCUMENT:
          serviceImpl.getDocument((com.sheeps.jsonbin.pb.Jsonbin.GetDocRequest) request,
              (io.grpc.stub.StreamObserver<com.sheeps.jsonbin.pb.Jsonbin.GetDocResponse>) responseObserver);
          break;
        case METHODID_GET_DOCUMENTS:
          serviceImpl.getDocuments((com.sheeps.jsonbin.pb.Jsonbin.GetDocsRequest) request,
              (io.grpc.stub.StreamObserver<com.sheeps.jsonbin.pb.Jsonbin.GetDocsResponse>) responseObserver);
          break;
        case METHODID_GET_STREAM_DOCUMENTS:
          serviceImpl.getStreamDocuments((com.sheeps.jsonbin.pb.Jsonbin.GetDocsRequest) request,
              (io.grpc.stub.StreamObserver<com.sheeps.jsonbin.pb.Jsonbin.GetDocsStreamResponse>) responseObserver);
          break;
        case METHODID_COUNT_DOCUMENTS:
          serviceImpl.countDocuments((com.sheeps.jsonbin.pb.Jsonbin.CountDocsRequest) request,
              (io.grpc.stub.StreamObserver<com.sheeps.jsonbin.pb.Jsonbin.CountDocsResponse>) responseObserver);
          break;
        case METHODID_PUSH_DOCUMENTS:
          serviceImpl.pushDocuments((com.sheeps.jsonbin.pb.Jsonbin.PushDocsRequest) request,
              (io.grpc.stub.StreamObserver<com.sheeps.jsonbin.pb.Jsonbin.PushDocsResponse>) responseObserver);
          break;
        case METHODID_PATCH_DOCUMENTS:
          serviceImpl.patchDocuments((com.sheeps.jsonbin.pb.Jsonbin.PatchDocsRequest) request,
              (io.grpc.stub.StreamObserver<com.sheeps.jsonbin.pb.Jsonbin.PatchDocsResponse>) responseObserver);
          break;
        case METHODID_DELETE_DOCUMENTS:
          serviceImpl.deleteDocuments((com.sheeps.jsonbin.pb.Jsonbin.DeleteDocsRequest) request,
              (io.grpc.stub.StreamObserver<com.sheeps.jsonbin.pb.Jsonbin.DeleteDocsResponse>) responseObserver);
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

  private static abstract class JsonStorageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JsonStorageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sheeps.jsonbin.pb.Jsonbin.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JsonStorageService");
    }
  }

  private static final class JsonStorageServiceFileDescriptorSupplier
      extends JsonStorageServiceBaseDescriptorSupplier {
    JsonStorageServiceFileDescriptorSupplier() {}
  }

  private static final class JsonStorageServiceMethodDescriptorSupplier
      extends JsonStorageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JsonStorageServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (JsonStorageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JsonStorageServiceFileDescriptorSupplier())
              .addMethod(getGetDocumentMethod())
              .addMethod(getGetDocumentsMethod())
              .addMethod(getGetStreamDocumentsMethod())
              .addMethod(getCountDocumentsMethod())
              .addMethod(getPushDocumentsMethod())
              .addMethod(getPatchDocumentsMethod())
              .addMethod(getDeleteDocumentsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
