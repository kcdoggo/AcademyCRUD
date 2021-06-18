<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>강좌 정보변경</title>
</head>
<body>
	<h1>강좌정보 변경</h1>
	<form method="POST">
		<div>	
			<lable>강의 아이디: </lable>
			<input value="${item.courseid}" type="text" name="courseid">
		</div>
		
		<div>	
			<lable>강의 이름: </lable>
			<input value="${item.coursename}" type="text" name="cousrename">
		</div>
		
		<div>	
			<lable>강의 교수: </lable>
			<input value="${item.professor}" type="text" name="professor">
		</div>
		
		<div>	
			<lable>강의 가격 : </lable>
			<input value="${item.courseprice}"  type="text" name="courseprice">
		</div>
		<input type="submit" value="변경하기">
		
	</form>
</body>
</html>