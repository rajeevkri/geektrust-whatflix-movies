package com.whatflix.model;

import java.util.List;

public class UserRecommendation {

	private int userId;

	private List<String> movies;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<String> getMovies() {
		return movies;
	}

	public void setMovies(List<String> movies) {
		this.movies = movies;
	}

}
