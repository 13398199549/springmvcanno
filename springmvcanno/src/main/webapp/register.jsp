<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="header.jsp" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="static/js/jQuery-2.2.2-min.js?version=20180724" charset="utf-8"></script>
<script type="text/javascript" src="static/js/register.view.js?version=20180724" charset="utf-8"></script>

</head>
<body>
	
	<form action="users/register03" method="post">
	
		用户名：<input type="text" name="userName"/>
		<br/>
		登录名：<input type="text" name="loginName"/>
			<br/>
		密码：<input type="password" name="password"/>
			<br/>
		年龄：<input type="text" name="age"/>
			<br/>
		性别：<input type="radio" name="gender" value="1" checked="checked"/>男 <input type="radio" name="gender" value="0"/>女
			<br/>
		是否婚配：
			<input type="radio" name="marry" value="true" checked="checked"/>已婚 <input type="radio" name="marry" value="false"/>未婚
		<br/>
		年收入：	
			<input type="text" name="income"/>
		<br/>
		
		出生日期：<input type="text" name="birthday"/>
		<br/>
		个人兴趣：<input type="checkbox" name="hobby" value="0"/>敲代码
			<input type="checkbox" name="hobby" value="1"/>改BUG
			<input type="checkbox" name="hobby" value="2"/>睡懒觉
			<input type="checkbox" name="hobby" value="3"/>放臭屁
		<br/>	
		房产地址：
		    <input type="text" name="houses[0].houseAddress"/>
			<input type="text" name="houses[1].houseAddress"/>
			<input type="text" name="houses[2].houseAddress"/>
		<br/>		
		女性朋友：	
			<input type="text" name="girls[0].girlName"/>
			<input type="text" name="girls[1].girlName"/>
		<br/>			
		车牌号码：	
			<input type="text" name="params['bmw']"/>
			<input type="text" name="params['benz']"/>
			<input type="text" name="params['ofo']"/>
		<br/>
		角色选择：			
		<select name="role.id">
			<option value="0">矮骡子</option>
			<option value="1">扛把子</option>
			<option value="2">二流子</option>
		</select>
			
		<input type="submit" value="注册"/>
	</form>
	
	
	<p/>
	
	<button id="btn01">注册</button>
	
	
	
	
</body>
</html>