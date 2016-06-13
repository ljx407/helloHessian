package com.ljx.client;

import java.net.MalformedURLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.caucho.hessian.client.HessianProxyFactory;
import com.ljx.service.IHello;

public class HelloClient {
	private static final Logger logger = LogManager.getLogger(HelloClient.class);
	public static void main(String[] args) throws MalformedURLException {
		String url = "http://localhost:8089/helloHessianWithSpringServer/helloHessianWithSpring";
		HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();
		IHello helloImpl = (IHello)hessianProxyFactory.create(IHello.class, url);
		String result = helloImpl.sayHello("ljx");
		logger.info(result);
	}
}
