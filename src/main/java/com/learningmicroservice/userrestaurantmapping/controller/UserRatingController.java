package com.learningmicroservice.userrestaurantmapping.controller;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningmicroservice.userrestaurantmapping.model.UserDetails;
import com.learningmicroservice.userrestaurantmapping.service.UserRestaurantMapping;

@RestController
@RequestMapping("/restaurant")
public class UserRatingController {
	
	@Autowired
	private UserRestaurantMapping resMapping;
	
	@RequestMapping("/ratings/{restaurantName}")
	public UserDetails getUserRating(@PathVariable String restaurantName){
		
		
		return resMapping.getMapping(restaurantName);
	}
	

}
