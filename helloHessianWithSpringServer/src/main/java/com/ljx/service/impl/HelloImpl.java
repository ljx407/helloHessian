package com.ljx.service.impl;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.ljx.service.IHello;

public class HelloImpl implements IHello {
	
	private static final Logger logger = LogManager.getLogger(HelloImpl.class);

	public String sayHello(String name) {
		String message = "you name is " + name;
		logger.info(String.format("%1$s%2$s","server : ",message));
		return message;
	}

}
