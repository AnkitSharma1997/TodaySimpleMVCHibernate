package com.jwt.dao;

import java.util.List;
import com.jwt.model.User;

public interface UserDAO {

	public void addUser(User user);

	public List<User> getAllUser();

	public void deleteUser(Integer userId);

	public User updateUser(User user);

	public User getUser(int userid);
}
