<%@page import="java.util.List"%>
<%@page import="movie.dao.MovieDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--예약 입력 폼 선택받고 reserve_ok.jsp 파일로 데이터 넘겨주기 --%>

<%
	List<String> list = MovieDAO.movieList();
	//System.out.println(">>list : " + list);
	
	pageContext.setAttribute("movieList", list);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약 정보 입력 폼</title>
<style>
	#reserve1 {
		display: inline-table;
	}
</style>
</head>
<body>
	<h1>CINEMA RESERVATION</h1>
	<h2>영화예약</h2>
	
<div id="schedule">
	<table id="reserve1" border>
		<thead>
			<tr>
				<th>영화</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="movieList" items="${movieList }">
			<tr>
				<td>${movieList }</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<table id="reserve1" border>
		<thead>
			<tr>
				<th>날짜</th>	
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>날짜 들어가기~</td>
			</tr>
		</tbody>
	</table>
	<table id="reserve1" border>
		<thead>
			<tr>
				<th>시간</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th>시간 들어가기~~</th>
			</tr>
		</tbody>
	</table>
</div>

</body>
</html>