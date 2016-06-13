package com.ljx.service.impl;

import com.ljx.model.User;
import com.ljx.service.IUserService;

public class UserServiceImpl implements IUserService {

	@Override
	public User getUser() {
		return new User("ljx");
	}

}
