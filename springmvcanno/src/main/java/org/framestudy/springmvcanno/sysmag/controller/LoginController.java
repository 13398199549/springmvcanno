package org.framestudy.springmvcanno.sysmag.controller;

import org.framestudy.springmvcanno.bean.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * @Controller 该注解含义是：定义个需要交给spring容器管理的表现层组件
 * @author puxubo
 *
 */
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(value="/sysmag")
@Controller
public class LoginController {
   
	@RequestMapping(value= {"/login"},params= {"loginName","password!=123456"},method= {RequestMethod.GET})
	public ModelAndView login(String loginName,String password) {
		UserBean user = new UserBean();
		user.setLoginName(loginName);
		user.setUserName("老马");
		user.setPassword(password);
		user.setGender(1);
		
		
		System.out.println(user);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", user);// === req.setAttribute("user",user);
		mv.setViewName("sysmag/main");//返回即将跳转的页面逻辑视图名称
		return mv;
	}
	
	
	
	
	
	
	
}
