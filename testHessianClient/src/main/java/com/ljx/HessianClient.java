package com.ljx;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;
import com.ljx.model.User;
import com.ljx.service.IUserService;

public class HessianClient {
	public static void main(String[] args) throws MalformedURLException {
		// 在服务器端的web.xml文件中配置的HessianServlet映射的访问URL地址
		String url = "http://172.16.2.37:8089/testHessianServer/ServiceServlet";
		HessianProxyFactory factory = new HessianProxyFactory();
		IUserService service = (IUserService) factory.create(IUserService.class, url);// 创建IService接口的实例对象
		User user = service.getUser();// 调用Hessian服务器端的ServiceImpl类中的getUser方法来获取一个User对象
		System.out.println(user.getName());

	}
}
