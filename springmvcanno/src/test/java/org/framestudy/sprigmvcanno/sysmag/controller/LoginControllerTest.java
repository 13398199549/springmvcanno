package org.framestudy.sprigmvcanno.sysmag.controller;

import javax.annotation.Resource;

import org.framestudy.springmvcanno.sysmag.controller.LoginController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.ModelAndView;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-servlet.xml"})
public class LoginControllerTest {

	@Resource
	private LoginController loginController;
	
	@Test
	public void login() {
		
		ModelAndView mv = loginController.login("xiaoming", "123456");
		System.out.println(mv);
	}
}
