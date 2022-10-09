package com.yeahbutstill.alloffshitfuckingdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AllOffShitFuckingDemoApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AllOffShitFuckingDemoApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(AllOffShitFuckingDemoApplication.class, args);
	}

}
