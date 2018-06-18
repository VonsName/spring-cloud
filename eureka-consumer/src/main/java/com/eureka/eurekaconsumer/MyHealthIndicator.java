package com.eureka.eurekaconsumer;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * @author ASUS
 */
@Component
public class MyHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {

        return Health.up().build();
    }
}
