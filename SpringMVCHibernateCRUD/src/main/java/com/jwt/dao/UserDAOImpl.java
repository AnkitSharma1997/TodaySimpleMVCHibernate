package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addUser(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);

	}

	@SuppressWarnings("unchecked")
	public List<User> getAllUser() {

		return sessionFactory.getCurrentSession().createQuery("from User")
				.list();
	}

	@Override
	public void deleteUser(Integer userId) {
		User user = (User) sessionFactory.getCurrentSession().load(
				User.class, userId);
		if (null != user) {
			this.sessionFactory.getCurrentSession().delete(user);
		}

	}

	public User getUser(int userid) {
		return (User) sessionFactory.getCurrentSession().get(
				User.class, userid);
	}

	@Override
	public User updateUser(User employee) {
		sessionFactory.getCurrentSession().update(employee);
		return employee;
	}

	

}