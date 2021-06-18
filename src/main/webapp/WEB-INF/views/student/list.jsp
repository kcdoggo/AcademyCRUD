<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">

<html>
<head>
<meta charset="UTF-8">
<title>학생 정보 목록</title>
</head>
<body>

	<h1 class="text-center">학생 정보관리</h1>
	<div>
		<table class="table">

			<thead class="table-dark">
				<tr>
					<td>학생번호</td>
					<td>학생이름</td>
					<td>전공</td>
					<td>주소</td>
					<td>관리</td>
				</tr>
			</thead>
			<tbody>
				<c:if test="${list.size()<1}">
					<tr>
						<td colspan="5">등록된 학생의 정보가 없습니다.</td>
					</tr>
				</c:if>
				<c:forEach var="item" items="${list}">

					<tr>
						<td>${item.studentid}</td>
						<td>${item.studentname}</td>
						<td>${item.major}</td>
						<td>${item.address}</td>
						<td><a class="btn btn-outline-primary"
							href="delete?studentid=${item.studentid}">삭제</a><a
							class="btn btn-outline-primary"
							href="update?studentid=${item.studentid}">변경</a></td>
					</tr>

				</c:forEach>

			</tbody>
		</table>

	</div>
	<div class="d-grid gap-2 d-md-block">

		<a class="btn btn-success" type="button" href="add">등록</a>
	</div>
</body>
</html>