package com.ljx.service.impl;

import com.ljx.interfaces.IUserService;
import com.ljx.model.User;

public class UserServiceImpl implements IUserService {

	@Override
	public User getUser() {
		return new User("ljx");
	}

}
