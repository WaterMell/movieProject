<%@page import="movie.vo.ReservationVO"%>
<%@page import="movie.dao.ReservationDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	List<String> list = ReservationDAO.getReserveList();

	pageContext.setAttribute("reservedSelected", list);
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<title>myreserved [ myreserved.jsp ]</title>
<script>
	/*
	$(document).ready(function(){
		$("#theList").click(getReserved);
	});
	
	function getReserved() {
		alert(">> getReserved() 실행");

		$.ajax("getReserved", {
			type : "get",
			dataType : "json",
			success : function(data) {
				alert("Ajax 처리 성공 - 응답답은 데이터 : " + data);
				console.log(data);
				console.log(data.list);

				//
				let htmlTag = "";
				let alist = data.list;
				$.each(alist, function(index, member) {
					htmlTag += "<li>";
					htmlTag += "<a>" + this.schedule_date + "</a>";
					htmlTag += "<a>" + this.start_time + "</a>";
					htmlTag += "<a>" + this.m_name + "</a>";
					htmlTag += "<a>" + this.m_running_time + "</a>";
					htmlTag += "<a>" + this.theater_no + "</a>";
					htmlTag += "<a>" + this.seat_no + "</a>";
					htmlTag += "<a>" + this.reserv_no + "</a>";
					htmlTag += "</li>";
				});
				$("#theList").html(htmlTag);
			},
			error : function(jqXHR, textStatus, erorrThrown) {
				alert("Ajax 처리 실패 : \n" + "jqXHR.readyState : "
						+ jqXHR.readyState + "\n" + "textStatus : "
						+ textStatus + "\n" + "errorThrown : " + errorThrown);
			}
		});
	}
	*/
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
