package com.cognizant.exercise4.controller;

import com.cognizant.exercise4.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    private static final Logger logger=LoggerFactory.getLogger(CountryController.class);
    @RequestMapping("/country")
    public Country getCountryIndia() {
        logger.info("START");
        ApplicationContext con=new ClassPathXmlApplicationContext("country.xml");
        Country country=con.getBean("country", Country.class);
        logger.info("END");
        return country;
    }
}