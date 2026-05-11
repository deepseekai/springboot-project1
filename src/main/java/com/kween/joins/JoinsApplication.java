package com.kween.joins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JoinsApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(JoinsApplication.class);

	public static void main(String[] args) {

        LOGGER.info("JoinsApplication start");
        SpringApplication.run(JoinsApplication.class, args);
    }
}

