package com.sheeps.jsonbin.resource;

import io.grpc.*;

public class ResourceInterceptor implements ClientInterceptor {
    public static final String X_ACCESS_KEY = "x-access-key";

    private final ResourceSettings settings;

    public ResourceInterceptor(ResourceSettings settings) {
        this.settings = settings;
    }

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> methodDescriptor, CallOptions callOptions, Channel channel) {
        return new ForwardingClientCall.SimpleForwardingClientCall<>(channel.newCall(methodDescriptor, callOptions)) {
            @Override
            public void start(Listener<RespT> responseListener, Metadata headers) {
                headers.put(Metadata.Key.of(X_ACCESS_KEY, Metadata.ASCII_STRING_MARSHALLER), settings.token());
                super.start(responseListener, headers);
            }
        };
    }
}
