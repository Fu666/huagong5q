<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/login.action " method="post">
用户名：<input type="text" name="username"><br><br>
密码：<input type="password" name="password"><br><br>
<input type="submit" value="登录"/><br><br>
</form>
</body>
</html>  