<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<h1>员工列表</h1>
	<table border="1" width="100%" cellpadding="1" cellspacing="0">
		<tr>
			<td></td>
			<td>name</td>
			<td>sex</td>
			<td>tel</td>
			<td>email</td>
			<td>salary</td>
			<td>position</td>
			<td>address</td>
			<td>nativeplace</td>
			<td>state</td>
			<td>created</td>
			<td>updated</td>
		</tr>
		<c:forEach items="${records}" var="item">
			<tr>
				<td>${item.id}</td>
				<td>${item.name}</td>
				<td>${item.sex}</td>
				<td>${item.tel}</td>
				<td>${item.email}</td>
				<td>${item.salary}</td>
				<td>${item.position}</td>
				<td>${item.address}</td>
				<td>${item.nativeplace}</td>
				<td>${item.state}</td>
				<td>${item.created}</td>
				<td>${item.updated}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
