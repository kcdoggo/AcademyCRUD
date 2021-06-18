<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

<meta charset="UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>

<title>학생 정보 추가하기</title>
</head>
<body>
	
	<div class="container">
	<h1>학생 정보관리</h1>

	<form method="POST">
		<div class="mb-3">	
			<lable class="form-label">학생 아이디: </lable>
			<input class="form-control" type="text" name="studentid">
		</div>
		
		<div class="mb-3">	
			<lable class="form-label" >학생 이름: </lable>
			<input class="form-control" type="text" name="studentname">
		</div>
		
		<div class="mb-3">	
			<lable class="form-label">전공: </lable>
			<input class="form-control" type="text" name="major">
		</div>
		
		<div class="mb-3">	
			<lable class="form-label">주소 : </lable>
			<input class="form-control"  type="text" name="address">
		</div>
		<div class="mb-3 form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">저는 로봇이 아닙니다.</label>
  </div>
		<input class="btn btn-primary" type="submit" value="제출하기">
		
	</form>
	</div>
		<a href="..">목록으로</a>


</body>
</html>