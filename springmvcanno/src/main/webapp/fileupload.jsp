<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ include file="header.jsp" %>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<base href="<%=basePath %>">
</head>
<body>
	<form action="files/upload" method="post" enctype="multipart/form-data">
		
		请选择文件：<input type="file" name="fileName"/>
		<br/>
		文件描述：<textarea rows="5" cols="10" name="fileDescrible"></textarea>
		<br/>
		<input type="submit" value="文件上传"/>
	
	</form>
	
	
	
	
	<form action="files/multi/upload" method="post" enctype="multipart/form-data">
		
		请选择文件：<input type="file" name="fileName"/>
		<br/>
		请选择文件：<input type="file" name="fileName"/>
		<br/>
		请选择文件：<input type="file" name="fileName"/>
		<br/>
		文件描述：<textarea rows="5" cols="10" name="fileDescrible"></textarea>
		<br/>
		<input type="submit" value="文件上传"/>
	
	</form>
</body>
</html>