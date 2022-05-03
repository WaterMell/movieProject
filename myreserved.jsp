<%@page import="movie.vo.ReservationVO"%>
<%@page import="movie.dao.ReservationDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	List<String> list = ReservationDAO.getReserveList();
	
	pageContext.setAttribute("reservedSelectAll", list);
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>myreserved [ myreserved.jsp ]</title>
<script>
	
	
</script>
</head>
<body>
	<h1>마이페이지</h1>
	<h2>예약내역</h2>
	
	<c:forEach var="vo" items="${reservedSelectAll }">
		<li>${reservedSelectAll }</li>
	</c:forEach>
	
</body>
</html>