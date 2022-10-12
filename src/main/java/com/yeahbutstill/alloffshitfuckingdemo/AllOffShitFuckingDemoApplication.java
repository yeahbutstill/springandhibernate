package com.yeahbutstill.alloffshitfuckingdemo;

import com.yeahbutstill.alloffshitfuckingdemo.mvc.entity.StudentJPA;
import com.yeahbutstill.alloffshitfuckingdemo.mvc.repo.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AllOffShitFuckingDemoApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AllOffShitFuckingDemoApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(AllOffShitFuckingDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(StudentRepository repo) {

		return args -> {
			repo.save(
					new StudentJPA(
							"Dani",
							"Setiawan",
							"dani@yeahbutstill"
					)
			);
		};

	}
}
