package com.yeahbutstill.springandhibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "com.yeahbutstill.springandhibernate")
public class SpringandhibernateApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringandhibernateApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringandhibernateApplication.class, args);
	}

}
