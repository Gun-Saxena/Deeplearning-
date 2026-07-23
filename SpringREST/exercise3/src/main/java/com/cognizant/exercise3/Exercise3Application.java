package com.cognizant.exercise3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercise3Application {
    private static final Logger logger= LoggerFactory.getLogger(Exercise3Application.class);
    public static void main(String[] args) {
        SpringApplication.run(Exercise3Application.class, args);
        logger.info("Inside Main");
    }
}
