package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.UserDAO;
import com.jwt.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao;

	@Override
	@Transactional
	public void addUser(User user) {
		userDao.addUser(user);
	}

	@Override
	@Transactional
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

	@Override
	@Transactional
	public void deleteUser(Integer userId) {
		userDao.deleteUser(userId);
	}

	public User getUser(int userid) {
		return userDao.getUser(userid);
	}

	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}

	public void setEmployeeDAO(UserDAO userdao) {
		this.userDao = userDao;
	}

}
