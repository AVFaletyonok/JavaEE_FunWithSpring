package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("org.example.services") - will search classes for beans in this package
public class FunApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(FunApplication.class, args);
    }

}
