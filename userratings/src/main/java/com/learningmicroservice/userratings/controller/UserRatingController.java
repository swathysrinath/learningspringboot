package com.learningmicroservice.userratings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningmicroservice.userratings.model.Ratings;
import com.learningmicroservice.userratings.service.UserRatingService;

@RestController
@RequestMapping("/ratings")
public class UserRatingController {
	
	@Autowired
	private UserRatingService userRatingService;
	
	@RequestMapping("/userIds/{userId}")
	public Ratings  getUserRatings(@PathVariable String userId){
		
		return userRatingService.getUserRatings(userId);
		
	}
	
	
	@RequestMapping("/test")
		public String example(){
			return "imworking";
		}

}
