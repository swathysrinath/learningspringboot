package com.learningmicroservice.userratings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.learningmicroservice.userratings.service.UserRatingService;

@SpringBootApplication
public class UserratingsApplication {
	
	@Bean
	public UserRatingService userRatingServic(){
		return new UserRatingService();
	}

	public static void main(String[] args) {
		SpringApplication.run(UserratingsApplication.class, args);
	}

}
