package com.bohenmian.aop.service.impl;

import com.bohenmian.aop.model.User;
import com.bohenmian.aop.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public User createUser(String username, int age) {
		User user = new User();
		user.setUsername(username);
		user.setAge(age);
		return user;
	}

	@Override
	public User queryUser() {
		User user = new User();
		user.setUsername("tom");
		user.setAge(18);
		return user;
	}
}
