package com.covid19.springboot.covid19Info;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableBatchProcessing
public class Covid19InfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Covid19InfoApplication.class, args);
	}

}
