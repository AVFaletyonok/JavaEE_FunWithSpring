package org.example.infra;

import org.springframework.boot.actuate.endpoint.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id = "features")
public class FeaturesEndpoint {

    private final Map<String, Boolean> features = new ConcurrentHashMap<>();

    @ReadOperation
    public Map<String, Boolean> getList() {
        return features;
    }

    @ReadOperation
    public Boolean getFeature(@Selector String name) {
        return features.get(name);
    }

    @WriteOperation
    public void setFeature(@Selector String name, boolean isEnable) {
        features.put(name, isEnable);
    }

    @DeleteOperation
    public void deleteFeature(@Selector String name) {
        features.remove(name);
    }
}
