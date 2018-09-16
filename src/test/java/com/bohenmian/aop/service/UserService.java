package com.bohenmian.aop.service;

import com.bohenmian.aop.model.User;

public interface UserService {

	User createUser(String username, int age);

	User queryUser();
}
