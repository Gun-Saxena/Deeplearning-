package com.cognizant.exercise4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercise4Application {
    private static final Logger logger= LoggerFactory.getLogger(Exercise4Application .class);
    public static void main(String[] args){
        SpringApplication.run(Exercise4Application .class, args);
        logger.info("Inside Main");
    }
}
