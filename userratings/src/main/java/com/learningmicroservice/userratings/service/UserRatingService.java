package com.learningmicroservice.userratings.service;

import com.learningmicroservice.userratings.model.Ratings;

public class UserRatingService {
	
	
	public Ratings getUserRatings(String userDetails){
		
			return new Ratings(userDetails,((int)(Math.random()*10)));
	}
	

}
