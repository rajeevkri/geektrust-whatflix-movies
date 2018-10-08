package com.whatflix.model;

import java.util.List;

public class User {
	private int id;

	private List<String> preferredLanguages;

	private List<String> favouriteActors;

	private List<String> favouriteDirectors;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getPreferredLanguages() {
		return preferredLanguages;
	}

	public void setPreferredLanguages(List<String> preferredLanguages) {
		this.preferredLanguages = preferredLanguages;
	}

	public List<String> getFavouriteActors() {
		return favouriteActors;
	}

	public void setFavouriteActors(List<String> favouriteActors) {
		this.favouriteActors = favouriteActors;
	}

	public List<String> getFavouriteDirectors() {
		return favouriteDirectors;
	}

	public void setFavouriteDirectors(List<String> favouriteDirectors) {
		this.favouriteDirectors = favouriteDirectors;
	}

}
