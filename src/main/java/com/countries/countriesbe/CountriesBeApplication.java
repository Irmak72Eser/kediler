package com.countries.countriesbe;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class CountriesBeApplication {

    public static void main(String[] args) {
    log.error("log atıyorum");
        SpringApplication.run(CountriesBeApplication.class, args);
    }

}
