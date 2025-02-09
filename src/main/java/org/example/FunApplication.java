package org.example;

import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.binder.MeterBinder;
import org.example.repositories.FunRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("org.example.services") - will search classes for beans in this package
public class FunApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(FunApplication.class, args);
    }

    @Bean
    public MeterBinder meterBinder(FunRepo repo) {
        return meterRegistry ->
                Gauge.builder("bread.size", repo::getRecordsCount)
                        .register(meterRegistry);
    }
}
