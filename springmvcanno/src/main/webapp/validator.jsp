<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %> 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ include file="header.jsp" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="static/js/jQuery-2.2.2-min.js?version=20180724" charset="utf-8"></script>
<script type="text/javascript" src="static/js/register.view.js?version=20180724" charset="utf-8"></script>

<style type="text/css">

	font{
		background-color: red;
		font-size: 13px;
	}


</style>
</head>
<body>
	<!-- 如果需要配置国际化，百度搜索：ISO语言代码，ISO国际代码 -->
	<a href="users/i18n?locale=zh_CN">中文</a> | <a href="users/i18n?locale=en_US">English</a>

	
	<sf:form action="users/validator" method="post" modelAttribute="errs">
	
		<s:message code="validator.view.userName"></s:message><input type="text" name="userName"/><font><sf:errors path="userName" delimiter=","></sf:errors></font>
		<br/>
		<s:message code="validator.view.loginName"></s:message><input type="text" name="loginName"/><font><sf:errors path="loginName" delimiter=","></sf:errors></font>
			<br/>
		<s:message code="validator.view.password"></s:message><input type="password" name="password"/><font><sf:errors path="password" delimiter=","></sf:errors></font>
			<br/>
		<s:message code="validator.view.age"></s:message><input type="text" name="age"/><font><sf:errors path="age" delimiter=","></sf:errors></font>
			<br/>
			
		性别：<input type="radio" name="gender" value="1" checked="checked"/>男 <input type="radio" name="gender" value="0"/>女
			<br/>
		是否婚配：
			<input type="radio" name="marry" value="true" checked="checked"/>已婚 <input type="radio" name="marry" value="false"/>未婚
			<font><sf:errors path="marry" delimiter=","></sf:errors></font>
		<br/>
		年收入：	
			<input type="text" name="income"/><font><sf:errors path="income" delimiter=","></sf:errors></font>
		<br/>
		
		出生日期：<input type="text" name="birthday"/><font><sf:errors path="birthday" delimiter=","></sf:errors></font>
		<br/>
		个人兴趣：<input type="checkbox" name="hobby" value="0"/>敲代码
			<input type="checkbox" name="hobby" value="1"/>改BUG
			<input type="checkbox" name="hobby" value="2"/>睡懒觉
			<input type="checkbox" name="hobby" value="3"/>放臭屁
			<font><sf:errors path="hobby" delimiter=","></sf:errors></font>
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
	</sf:form>
	
	
	<p/>
	
	<button id="btn01">注册</button>
	
	
	
	
</body>
</html>