<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<base href="<%=basePath%>">
<script type="text/javascript" src="static/js/jQuery-2.2.2-min.js?version=20180724" charset="utf-8"></script>
<script type="text/javascript" src="static/js/jquery.json.js?version=20180724" charset="utf-8"></script>
<script type="text/javascript" src="static/js/jackson.view.js?version=20180724" charset="utf-8"></script>
</head>
<body>

	<button id="btn01">使用Jackson完成单个对象的新增</button>
	<button id="btn02">不使用Jackson完成单个对象的新增</button>
	<button id="btn03">使用Jackson完成批量对象的新增</button>
	<button id="btn04">根据用户名和性别查询大量用户数据</button>
	<button id="btn05">根据用户名和性别查询完成对用户进行分页查询</button>
	<button id="btn06">根据用户名查询用户登录名以及密码</button>
	<button id="btn07">使用Jackson完成按需针对对象进行序列化</button>



</body>
</html>