package com.example.cw1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DhishaCw1Application {

	private static final Logger log = LoggerFactory.getLogger(DhishaCw1Application.class);

    public static void main(String[] args) {
        log.info("Before Starting application");
        SpringApplication.run(DhishaCw1Application.class, args);
    }
}
