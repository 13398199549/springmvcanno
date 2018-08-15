package org.framestudy.springmvcanno.sysmag.controller;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.framestudy.springmvcanno.bean.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContext;

@RequestMapping("/users")
@Controller
public class UserController {
	
	/**
	 * 国际化跳转
	 * @return
	 */
	@RequestMapping("/i18n")
	public String changeI18n() {
		return "validator";
	}
	
	
	/**
	 * 针对对象进行格式验证
	 * 掌握
	 * @Valid 这个注解，表示在参数绑定之后，方法调用之前，需要针对user对象，进行格式验证
	 * @ModelAttribute("errs") === model.addAttribute("errs",br.getAllErrors());
	 * @param user
	 * @param br 验证结果
	 * @return
	 */
	@RequestMapping("/validator")
	public String validator(@ModelAttribute("errs") @Valid UserBean user,BindingResult br) {
		if(br.hasErrors()) {
			
			System.out.println(br.getAllErrors());
			
			return "validator";
		}
		
		System.out.println(user);
		

		return "index";
	}
	
	
	
	/**
	 * Map 作为返回类型，向Map中设置数据等同于向request中设置数据
	 * 但是它会将请求路径，来作为即将需要跳转页面的逻辑视图名称
	 * 了解
	 * @param user
	 * @return
	 */
	@RequestMapping("/register09")
	public Map register2(UserBean user) {
		System.out.println(user);
		
		Map map = new HashMap<>();
		map.put("user", user);
		return map;
	}
	
	
	/**
	 * HTTP的请求头数据来作为方法的参数
	 * 了解
	 * @param user
	 * @param userAgent
	 * @param accept
	 * @return
	 */
	@RequestMapping("/register08")
	public String register(UserBean user,@RequestHeader("User-Agent")String userAgent,@RequestHeader("Accept")String accept) {
		System.out.println(user);
		System.out.println(userAgent);
		System.out.println(accept);
		
		
		return "index";
	}
	
	/**
	 * Cookie作为方法的参数
	 * 了解(之上)
	 * @param user
	 * @param jsessionid
	 * @return
	 */
	@RequestMapping("/register07")
	public String register(UserBean user,@CookieValue("JSESSIONID") String jsessionid) {
		System.out.println(user);
		System.out.println(jsessionid);
		
		
		return "index";
	}
	
	
	/**
	 * 输出流作为方法参数，通常结合ajax完成方法的回调
	 * 了解
	 * 特点：输出流既可以输出页面，也可以输出数据
	 * @param user
	 * @param out
	 */
	@RequestMapping("/register06")
	public void register(UserBean user,PrintWriter out) {
		System.out.println(user);
		
		out.print(false);
	}
	
	
	/**
	 * 当String做为返回类型时，模型数据可以放置在model对象中
	 * 模型数据放入到model对象中，等同于向request中放入数据
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping("/register05")
	public String register(UserBean user,Model model) {
		System.out.println(user);
		model.addAttribute("user", user);
		return "index";
	}
	
	
	
	/**
	 * 当String做为返回类型时，模型数据可以放置在map键值对中，
	 * 模型数据放入到map键值对中，等同于向request中放入数据
	 * @param user
	 * @param map
	 * @return
	 */
	@RequestMapping("/register04")
	public String register(UserBean user,Map map) {
		System.out.println(user);
		map.put("user", user);
//		return "index";
		
		//服务器内部完成"请求转发"
//		return "forward:/users/register03";
		//服务器内部完成"重定向"
//		return "redirect:/users/register03";
		//服务器外部完成"重定向"
		return "redirect:http://www.baidu.com";
		
	}

	
	
	
	/**
	 * 页面表单提交项的java封装对象来作为方法参数
	 * 掌握
	 * 特点：对象的属性需要与页面表单提交项名称保持一致
	 * @param user
	 * @return
	 */
	@RequestMapping("/register03")
	public ModelAndView register(UserBean user,HttpServletRequest req) {
		
		System.out.println(user);
		RequestContext rc = new RequestContext(req);
		System.out.println(rc.getMessage("validator.view.userName"));
		
		//假设注册成功了，需要跳转到登录页面上去
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	/**
	 * 自定义数据绑定规则
	 * 特点：只针对当前类的参数，或者属性有效
	 * @param binder
	 * @throws Exception
	 */
//	@InitBinder
//	protected void initBinder (WebDataBinder binder) throws Exception {
//		binder.registerCustomEditor(Date.class,new UtilDatePropertyEditor());
//	}

	
	/**
	 * 页面表单提交项来作为方法参数
	 * 了解
	 * 特点：如果参数名称与页面表单提交项一致，那么可以自动完成赋值
	 * 如果不一致，也可以通过@RequestParam完成双向关联
	 * @param userName
	 * @param loginName
	 * @param pwd
	 * @param age
	 * @param gender
	 * @return
	 */
	@RequestMapping("/register02")
	public ModelAndView register(String userName,String loginName,@RequestParam(value="password",defaultValue="123456")String pwd,Integer age,Integer gender,Boolean marry,Double income,String [] hobby) {
		UserBean user = new UserBean(userName,loginName,pwd,age,gender,marry,income,hobby);
		
		System.out.println(user);
		//假设注册成功了，需要跳转到登录页面上去
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	/**
	 * 能够作为方法参数的第一种类型(作用域对象)
	 * 了解
	 * 特点：作用域对象个数，以及顺序可以自定义
	 * @param req
	 * @param res
	 * @param session
	 * @return
	 */
	@RequestMapping("/register")
	public ModelAndView register(HttpServletRequest req,HttpServletResponse res,HttpSession session) {
		//通过req对象的getParameter()获取页面表单提交项的数据
		String userName = req.getParameter("userName");
		userName = !StringUtils.hasLength(userName) ? "" : userName;
		String loginName = req.getParameter("loginName");
		loginName = !StringUtils.hasLength(loginName) ? "" : loginName;
		String password = req.getParameter("password");
		password = !StringUtils.hasLength(password) ? "" : password;
		String age = req.getParameter("age");
		age = !StringUtils.hasLength(age) ? "" : age;
		String gender = req.getParameter("gender");
		gender = !StringUtils.hasLength(gender) ? "" : gender;
		
		UserBean user = new UserBean(userName,loginName,password,Integer.valueOf(age),Integer.valueOf(gender));
		
		System.out.println(user);
		
		
		//假设注册成功了，需要跳转到登录页面上去
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
