<%@page import="movie.dao.ReservationDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function() {
		$(".menu1").mouseenter(function() {
			$('.subMenu1').slideDown(1000);

			$(".subMenu1").mouseleave(function() {
				$('.subMenu1').slideUp(1000);
			});
		});

		$(".menu2").mouseenter(function() {
			$('.subMenu2').slideDown(1000);

			$(".subMenu2").mouseleave(function() {
				$('.subMenu2').slideUp(1000);
			});
		});
	});
	
	function go_modify() {
		location.href = "controller?type=modify";
	}
	function go_AcoDel() {
		location.href = "controller?type=AcoDel";
	}
	
	$(document).ready(function(){
		$("#reserved").click(getReserved);
	});
	
	// id parameter로 받아야함
	function getReserved() {
		alert(">> getReserved() 실행");

		$.ajax("getReserved", {
			type : "get",
			dataType : "json",
			success : function(data) {
				alert("Ajax 처리 성공 - 응답답은 데이터 : " + data);
				console.log(data);
				console.log(data.list);

				let htmlTag = "";
				let alist = data.list;
				$.each(alist, function(index, member) {
					htmlTag += "<h3>" + "예매 내역" + "</h3>";
					htmlTag += "<li>" + this.schedule_date + "</li>";
					htmlTag += "<li>" + this.start_time + "</li>";
					htmlTag += "<li>" + this.m_name + "</li>";
					htmlTag += "<li>" + this.m_running_time + "</li>";
					htmlTag += "<li>" + this.theater_no + "</li>";
					htmlTag += "<li>" + this.seat_no + "</li>";
					htmlTag += "<li>" + this.reserv_no + "</li>";
				});
				$("#theReservList").html(htmlTag);
			},
            error : function(jqXHR, textStatus, errorThrown){
                alert("Ajax 처리 실패 : \n"
                      + "jqXHR.readyState : " + jqXHR.readyState + "\n"
                      + "textStatus : " + textStatus + "\n"
                      + "errorThrown : " + errorThrown);
			}
		});
	}
</script>
<title>MyPage</title>
<style>
	.subMenu1 {
		display: none;
	}
	
	.subMenu2 {
		display: none;
	}
	
	ul, ol {
		list-style: none;
	}
	
	li>a>span {
		vertical-align: top;
		white-space: nowrap;
	}
	
	li>ul>li>a>span {
		white-space: nowrap;
	}
	
	.dept01 {
		display: flex;
	}
	
	.dept02 {
		display: flex;
	}
	
	.menu1 { box-sizing: 3px; }
	
	#theReservList { border-style: solid; }
</style>
</head>
<body>
	<div class="title">
		<h1>마이페이지</h1>
	</div>
	<div class="topMenu">
		<ul class="dept01">
			<li>
				<a class="menu1">
					결제내역
				</a>
				<ul class="subMenu1">
					<li>
						<a id="reserved" style=cursor:pointer;>예매내역</a>
					</li>
				</ul>
			</li>
			<li>
				<a class="menu2">
					회원정보 관리
				</a>
				<ul class="subMenu2">
					<li id="asd">
						<a style=cursor:pointer; onclick="go_modify()">비밀번호 변경</a>
					</li>
					<li id="asd">
						<a style=cursor:pointer; onclick="go_AcoDel()">탈퇴</a>
					</li>
				</ul>
			</li>
		</ul>
	</div>
	<hr>
	<ul id="theReservList">
		<li>
			2022-05-04 9:00 닥터스트레인지 77분 1관 좌석번호28번 예약번호 1번(샘플 데이터)
		</li>
	</ul>
</body>
</html>