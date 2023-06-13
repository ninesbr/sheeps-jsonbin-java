package com.sheeps.jsonbin.resource;

public interface JsonbinResource<T> {
    T getDocument(String id);
}
