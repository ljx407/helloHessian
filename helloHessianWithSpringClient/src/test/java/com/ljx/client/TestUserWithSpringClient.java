package com.ljx.client;

import javax.annotation.Resource;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ljx.interfaces.IUserService;
import com.ljx.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-client.xml"})
public class TestUserWithSpringClient {
	
	@Resource(name = "userService")
	private IUserService userService ;
	
	@Test
	public void testGetUser() {
		User user = userService.getUser();
		assertThat(user, notNullValue());
		assertThat(user.getUsername(), is("ljx"));
		assertThat(user.getPassword(), is("123"));
	}
}
