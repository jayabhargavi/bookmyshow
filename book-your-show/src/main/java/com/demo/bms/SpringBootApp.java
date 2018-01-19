package com.demo.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
@EnableAutoConfiguration
@SpringBootApplication
public class SpringBootApp {
	public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootApp.class, args);
    }

}
