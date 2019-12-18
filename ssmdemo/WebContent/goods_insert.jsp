<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/goods/insert.action" method="post" enctype="multipart/form-data">
商品名称：<input type="text" name="name"/><br><br><!--  enctype是让你可以提交图片等数据-->
商品价格：<input type="text" name="price"/><br><br>
商品图片：<input type="file" name="upfile"/><br><br>
商品种类：<input type="text" name="kind"/><br><br>
商品数量：<input type="text" name="num"/><br><br>
<input type="submit" value="增加"/></form>
</body>
</html>