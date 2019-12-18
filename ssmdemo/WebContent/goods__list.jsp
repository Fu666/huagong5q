<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/goods_insert.jsp">+</a>
<form action="${pageContext.request.contextPath}/goods/findByName.action" method="post">
<input type="text" name="name"><input type="submit" value="查询">
</form>
 <table border="1" cellspacing="0" cellpadding="0">
<tr>
<td>编号</td>
<td>名称</td>
<td>价格</td>
<td>图片</td>
<td>种类</td>
<td>数量</td>
<td>操作</td>
</tr>
	<c:forEach items="${goods }" var="g">
	<tr>
	<td>${g.id}</td>
	<td>${g.name}</td>
	<td>${g.price}</td>
	<td>${g.img}</td>
	<td>${g.kind}</td>
	<td>${g.num}</td>
	<td>
	<a href="${pageContext.request.contextPath}/goods/yupdate.action?id=${g.id}">修改</a>
	<a href="${pageContext.request.contextPath}/goods/delete.action?id=${g.id}">删除</a>
	</td>
	</tr>
	</c:forEach>

</table> 
</body>
</html>