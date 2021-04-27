package com.learningmicroservice.userrestaurantmapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.learningmicroservice.userrestaurantmapping.service.UserRestaurantMapping;

@SpringBootApplication
public class UserRestaurantMappingApplication {
	
	@Bean
	public UserRestaurantMapping getInstanceofURmapping(){
		return new UserRestaurantMapping();
	}

	public static void main(String[] args) {
		SpringApplication.run(UserRestaurantMappingApplication.class, args);
	}

}
