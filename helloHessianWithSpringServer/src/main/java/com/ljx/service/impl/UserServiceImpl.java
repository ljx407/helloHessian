package com.ljx.service.impl;

import org.springframework.stereotype.Service;

import com.ljx.interfaces.IUserService;
import com.ljx.model.User;

@Service("userService")
public class UserServiceImpl implements IUserService{

	@Override
	public User getUser() {
		return new User("ljx","123");
	}

}
