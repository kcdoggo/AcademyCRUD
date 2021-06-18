<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

<html>
<head>
<meta charset="UTF-8">
<title>강의 목록</title>
</head>
<body>

	<h1 class="text-center" >강의 정보관리</h1>
	<div>
		<table class="table">
		
			<thead class="table-dark">
			<tr>
				<td>강의 번호</td>
				<td>강의 이름</td>
				<td>강의 교수</td>
				<td>강의 가격</td>
				<td>관리</td>
			</tr>			
			</thead>
			<tbody>
			<c:if test="${list.size()<1}">
				<tr>
					<td colspan="5">등록된 강의 정보가 없습니다.</td>
				</tr>
			</c:if>	
			<c:forEach var="item" items="${list}">
			
				<tr>
					<td>${item.courseid}</td>
					<td>${item.coursename}</td>
					<td>${item.professor}</td>
					<td>${item.courseprice}</td>
					<td><a class="btn btn-outline-primary" href="delete?studentid=${item.courseid}">삭제</a><a  class="btn btn-outline-primary" href="update?courseid=${item.courseid}">변경</a></td>
				</tr>
				
			</c:forEach>
			
			</tbody>
		</table>
	
	</div>
	<a href="add">등록</a>

</body>
</html>