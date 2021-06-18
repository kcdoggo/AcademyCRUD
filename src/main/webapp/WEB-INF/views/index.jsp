<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="${path}/resources/css/style.css" rel="stylesheet">

<title>Insert title here</title>
</head>
<body>
	<div class="header">
		<h2>Cdoggo</h2>

		<ul class="nav">
			<li><a href="student/list">학생관리</a></li>
			<li><a href="course/list">강의관리</a></li>
			<li><a href="scmanage/list">수강관리</a></li>
		</ul>
	</div>
	
	
	<div class="mainPhrase">
		<h1>Never stop Learning</h1>
	</div>
	
	
	
</body>
</html>