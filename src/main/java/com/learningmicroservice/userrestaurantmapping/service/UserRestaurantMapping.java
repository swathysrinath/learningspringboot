package com.learningmicroservice.userrestaurantmapping.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.learningmicroservice.userrestaurantmapping.model.UserDetails;

public class UserRestaurantMapping {
	
	
	
	public UserDetails getMapping(String restaurantName){
		return getUserIds(restaurantName);
		
		
	}
	
	private UserDetails getUserIds(String name){
		HashMap<String,UserDetails> getUserIds = new HashMap();
		getUserIds.put("annaporna", new UserDetails(Arrays.asList("swa123","sri89")));
		getUserIds.put("creamcenter", new UserDetails(Arrays.asList("cha20")));
		getUserIds.put("pind", new UserDetails(Arrays.asList("cha20","swa123")));
		getUserIds.put("kailashparbath", new UserDetails(Arrays.asList("cha20","swa123","sri89")));
		
		return getUserIds.get(name);
	}

}
