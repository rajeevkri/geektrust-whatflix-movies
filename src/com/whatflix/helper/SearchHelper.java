package com.whatflix.helper;

import java.util.List;

import com.whatflix.model.Movies;
import com.whatflix.model.User;

//Considering this API has been build with elastic search help
public interface SearchHelper {

	List<String> searhForMovies(User user);

}
