package com.sheeps.jsonbin.resource;

import com.sheeps.jsonbin.engine.ParseEngine;

public record ResourceSettings (String host, int port, String token, boolean insecure, ParseEngine engine) {
    public ResourceSettings {
        if (host == null || host.isBlank()) {
            throw new IllegalArgumentException("host cannot be null or blank");
        }
        if (port < 0 || port > 65535) {
            throw new IllegalArgumentException("port must be between 0 and 65535");
        }
        if (token == null || token.isBlank()) {
            throw new IllegalArgumentException("token cannot be null or blank");
        }
        if (engine == null) {
            throw new IllegalArgumentException("engine cannot be null");
        }
    }
}
