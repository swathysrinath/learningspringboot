package com.learningmicroservice.userratings.model;

public class Ratings {
	
	private String userName;
	
	private int ratings;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	public Ratings(String userName, int ratings) {
		super();
		this.userName = userName;
		this.ratings = ratings;
	}


	public Ratings(){
		
	}

	@Override
	public String toString() {
		return "Ratings [userName=" + userName + ", ratings=" + ratings + "]";
	}
	
	

}
