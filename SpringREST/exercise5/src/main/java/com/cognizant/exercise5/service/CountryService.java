package com.cognizant.exercise5.service;

import com.cognizant.exercise5.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    public Country getCountry(String code) {
        ApplicationContext con=new ClassPathXmlApplicationContext("country.xml");
        List<Country> countries=(List<Country>) con.getBean("countryList");
        return countries.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }
}