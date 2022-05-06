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
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<title>myreserved [ myreserved.jsp ]</title>
<script>

</script>
<style>
	ul { list-style: none; }
	
	#theList { border: 1px; }
</style>

</head>
<body>
	<h1>마이페이지</h1>
	<h2>예약내역</h2>

	<ul>
		<li>
			<a>2022-05-04 9:00 닥터스트레인지 77분 1관 좌석번호28번 예약번호 1번(샘플 데이터)</a>
		</li>
	</ul>

</body>
</html>
