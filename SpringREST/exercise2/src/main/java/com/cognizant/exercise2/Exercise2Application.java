package com.cognizant.exercise2;

import com.cognizant.exercise2.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Exercise2Application {
    private static final Logger logger=LoggerFactory.getLogger(Exercise2Application .class);
    public static void main(String[] args) {
        SpringApplication.run(Exercise2Application .class, args);
        logger.info("Inside Main");
        displayCountry();
    }
    private static void displayCountry() {
        logger.info("Start");
        ApplicationContext con=new ClassPathXmlApplicationContext("country.xml");
        Country country=con.getBean("country", Country.class);
        logger.debug("Country : {}", country);
        logger.info("End");
    }
}
