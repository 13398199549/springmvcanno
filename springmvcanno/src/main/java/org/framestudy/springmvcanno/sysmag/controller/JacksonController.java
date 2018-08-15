package org.framestudy.springmvcanno.sysmag.controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.framestudy.springmvcanno.bean.MessagerBean;
import org.framestudy.springmvcanno.bean.PagerBean;
import org.framestudy.springmvcanno.bean.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RequestMapping("/json")
//@RestController  // == @Controller + @ResponseBody
@Controller
public class JacksonController {
	
	
	
	
	@RequestMapping(value="/om")
	public void listUserBeanByUserNameAndGender2PagerBean(UserBean user,PrintWriter out) {
		List<UserBean> users = null;
		PagerBean page = new PagerBean(1, 10);
		
		try {
			System.out.println(user);
			users = new ArrayList<UserBean>();
			users.add(new UserBean("小明","xm",1));
			users.add(new UserBean("小明1","xm1",1));
			users.add(new UserBean("小明2","xm2",1));
			page.setTotalRows(3);
			page.setDatas(users);
			
			ObjectMapper mapper = new ObjectMapper();
			
			 mapper.setFilterProvider(new SimpleFilterProvider().addFilter("userFilter",
			          SimpleBeanPropertyFilter.serializeAllExcept("houses","girls","role")));
			
			//filterOutAllExcept("userName","loginName") 序列化对象时，只包含userName和loginName
			//serializeAllExcept("houses","girls","role") 序列化对象时，除了houses，girls，role
			//之外的属性，都参与到序列化
			 
			String jsonString = mapper.writeValueAsString(users);
			out.print(jsonString);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	@RequestMapping(value="/six",method= {RequestMethod.POST},produces= {"application/json;charset=utf-8"})
	public @ResponseBody Map<String,UserBean> listUserByUserName(String userName) {
		
		Map<String,UserBean> userMap = new HashMap<String, UserBean>();
		
		try {
			userMap.put("小明", new UserBean("小明","xm",1));
			userMap.put("小明2", new UserBean("小明2","xm2",1));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return userMap;
	}
	
	
	
	
	@RequestMapping(value="/five",method= {RequestMethod.POST},produces= {"application/json;charset=utf-8"})
	public @ResponseBody PagerBean listUserBeanByUserNameAndGender2PagerBean(UserBean user) {
		List<UserBean> users = null;
		PagerBean page = new PagerBean(1, 10);
		try {
			System.out.println(user);
			users = new ArrayList<UserBean>();
			users.add(new UserBean("小明","xm",1));
			users.add(new UserBean("小明1","xm1",1));
			users.add(new UserBean("小明2","xm2",1));
			page.setTotalRows(3);
			page.setDatas(users);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return page;
	}
	
	
	@RequestMapping(value="/four",method= {RequestMethod.POST},produces= {"application/json;charset=utf-8"})
	public @ResponseBody List<UserBean> listUserBeanByUserNameAndGender(UserBean user) {
		List<UserBean> users = null;
		try {
			System.out.println(user);
			users = new ArrayList<UserBean>();
			users.add(new UserBean("小明","xm",1));
			users.add(new UserBean("小明1","xm1",1));
			users.add(new UserBean("小明2","xm2",1));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return users;
	}
	
	
	
	@RequestMapping(value="/three",method= {RequestMethod.POST},produces= {"application/json;charset=utf-8"})
	public @ResponseBody MessagerBean saveUserBean3(@RequestBody List<UserBean> users) {
		MessagerBean msg = new MessagerBean(true, "操作成功");
		try {
			System.out.println(users);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			msg.setStatus(false);
			msg.setInformation("系统繁忙，请稍后重试！");
		}
		
		return msg;
	}
	
	
	
	@RequestMapping(value="/two",method= {RequestMethod.POST},produces= {"application/json;charset=utf-8"})
	public @ResponseBody MessagerBean saveUserBean2(UserBean user) {
		MessagerBean msg = new MessagerBean(true, "操作成功");
		try {
			System.out.println(user);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			msg.setStatus(false);
			msg.setInformation("系统繁忙，请稍后重试！");
		}
		
		return msg;
	}
	
	
	@RequestMapping(value="/one",method= {RequestMethod.POST},produces= {"application/json;charset=utf-8"})
	public @ResponseBody MessagerBean saveUserBean(@RequestBody UserBean user) {
		MessagerBean msg = new MessagerBean(true, "操作成功");
		try {
			System.out.println(user);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			msg.setStatus(false);
			msg.setInformation("系统繁忙，请稍后重试！");
		}
		
		return msg;
	}
	
	
	
	
	
}
