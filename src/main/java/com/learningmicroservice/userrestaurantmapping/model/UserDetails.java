package com.learningmicroservice.userrestaurantmapping.model;

import java.util.List;

public class UserDetails {
	
	private List<String> listofUsers;
	
	public UserDetails( List<String> listofUsers){
		this.listofUsers=listofUsers;
	}
	
	

	@Override
	public String toString() {
		return "UserDetails [listofUsers=" + listofUsers + "]";
	}



	public List<String> getListofUsers() {
		return listofUsers;
	}

	public void setListofUsers(List<String> listofUsers) {
		this.listofUsers = listofUsers;
	}
	
	

}
