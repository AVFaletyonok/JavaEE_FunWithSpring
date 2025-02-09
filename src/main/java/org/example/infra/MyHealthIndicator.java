package org.example.infra;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("MyHealthIndicator")
public class MyHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        final var healthBuilder = new Random().nextInt(10) > 5 ?
                Health.down() :
                Health.up();
        return healthBuilder
                .withDetail("name", "Bamby")
                .build();
    }
}
