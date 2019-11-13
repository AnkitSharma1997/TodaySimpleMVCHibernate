package com.jwt.service;

import java.util.List;

import com.jwt.model.User;

public interface UserService {
	
	public void addUser(User user);

	public List<User> getAllUser();

	public void deleteUser(Integer userid);

	public User getUser(int userid);

	public User updateUser(User user);
}
