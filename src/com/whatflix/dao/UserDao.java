package com.whatflix.dao;

import java.util.List;

import com.whatflix.model.User;

public interface UserDao {

	public User getUserById(int id);

	public List<User> getAllUsers();
}
