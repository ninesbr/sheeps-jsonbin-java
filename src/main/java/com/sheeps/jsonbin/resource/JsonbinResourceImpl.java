package com.sheeps.jsonbin.resource;

import com.sheeps.jsonbin.engine.ParseEngine;
import com.sheeps.jsonbin.model.Model;
import com.sheeps.jsonbin.pb.JsonStorageServiceGrpc;
import com.sheeps.jsonbin.pb.Jsonbin;
import io.grpc.*;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class JsonbinResourceImpl<T extends Model<?>> implements JsonbinResource<T>, Closeable {
    private final ResourceSettings settings;

    private final Class<T> clazz;

    private final ParseEngine engine;
    private final ManagedChannel channel;

    private final JsonStorageServiceGrpc.JsonStorageServiceFutureStub stub;

    public JsonbinResourceImpl(Class<T> clazz, ResourceSettings settings) {
        this.clazz = clazz;
        this.engine = settings.engine();
        this.settings = settings;
        this.channel = Grpc.newChannelBuilderForAddress(this.settings.host(), this.settings.port(), this.newCredentials())
                .intercept(new ResourceInterceptor(this.settings))
                .keepAliveTime(5, TimeUnit.MINUTES)
                .keepAliveTime(10, TimeUnit.SECONDS) // Change to a larger value, e.g. 5min.
                .keepAliveTimeout(1, TimeUnit.SECONDS) // Change to a larger value, e.g. 10s.
                .keepAliveWithoutCalls(true)
                .build();
        this.stub = JsonStorageServiceGrpc.newFutureStub(this.channel)
                .withWaitForReady();
    }

    @Override
    public T getDocument(String id) {
        Future<Jsonbin.GetDocResponse> f = null;
        try {
            f = this.stub.getDocument(Jsonbin.GetDocRequest.newBuilder().setUniqueId(id).build());
            var resp = f.get(5, TimeUnit.SECONDS);
            return this.engine.unmarshall(resp.getDocument().toByteArray(), this.clazz);
        } catch (Exception e) {
            if (f != null) {
                f.cancel(true);
            }
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() throws IOException {
        try {
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new IOException(e);
        }
    }

    private ChannelCredentials newCredentials() {
        if (settings.insecure()) {
            return InsecureChannelCredentials.create();
        }
        return TlsChannelCredentials.create();
    }

}
