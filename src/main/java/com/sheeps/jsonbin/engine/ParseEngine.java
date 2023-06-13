package com.sheeps.jsonbin.engine;

public interface ParseEngine {
    byte[] marshall(Object obj);

    <T> T unmarshall(byte[] bytes, Class<T> clazz);
}
