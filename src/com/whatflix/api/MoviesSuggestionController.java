package com.whatflix.api;

import java.util.ArrayList;
import java.util.List;

import com.whatflix.dao.UserDao;
import com.whatflix.helper.SearchHelper;
import com.whatflix.model.User;
import com.whatflix.model.UserRecommendation;

public class MoviesSuggestionController {

	private SearchHelper searchHelper;

	private UserDao userDao;

	public void setSearchHelper(SearchHelper searchHelper) {
		this.searchHelper = searchHelper;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public List<String> search(int userId, String text) {
		User user = userDao.getUserById(userId);
		List<String> movies = searchHelper.searhForMovies(user);
		return movies;
	}

	public List<UserRecommendation> getAllUserRecommendations() {
		List<User> users = userDao.getAllUsers();
		List<UserRecommendation> recommendation = new ArrayList<>();
		if (users != null) {
			users.forEach(u -> {
				List<String> movies = searchHelper.searhForMovies(u);
				UserRecommendation ur = new UserRecommendation();
				ur.setMovies(movies);
				ur.setUserId(u.getId());
				recommendation.add(ur);
			});
		}

		return recommendation;
	}
}
