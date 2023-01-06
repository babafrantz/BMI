package com.Application.BMI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class BmiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BmiApplication.class, args);
	}

}
