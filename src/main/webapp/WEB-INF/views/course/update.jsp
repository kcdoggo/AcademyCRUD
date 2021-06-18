<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 정보변경</title>
</head>
<body>
	<h1>학생정보 변경</h1>
	<form method="POST">
		<div>	
			<lable>강의아이디: </lable>
			<input value="${item.courseid}" type="text" name="courseid">
		</div>
		
		<div>	
			<lable>강좌명: </lable>
			<input value="${item.coursename}" type="text" name="coursename">
		</div>
		
		<div>	
			<lable>강의교수: </lable>
			<input value="${item.professor}" type="text" name="professor">
		</div>
		
		<div>	
			<lable>가격 : </lable>
			<input value="${item.courseprice}"  type="text" name="courseprice">
		</div>
		<input type="submit" value="변경하기">
		
	</form>
</body>
</html>