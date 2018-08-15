package org.framestudy.springmvcanno.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
/**
 * 登录拦截器
 * @author DELL
 *
 */
public class LoginInterceptor implements HandlerInterceptor {
	/**
	 * 当登录方法执行之前，需要执行的方法
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("LoginInterceptor------preHandle()");
		
		return true;
	}
	/**
	 * 当登录方法执行成功之后，需要执行的方法
	 * 记录登录日志
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("LoginInterceptor------postHandle()");
	}
	/**
	 * 当所有的拦截器方式都执行完毕之后，需要执行的收尾的方法
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("LoginInterceptor------afterCompletion()");
	}

}
