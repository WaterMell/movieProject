<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%--홈페이지 메인화면 구현(로그인/ 회원가입/영화/예매/마이페이지) --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화관 메인</title>
<script>
	function loginGo(){
		location.href = "controller?type=login";
	}
	
	function signupForm(){
		location.href = "controller?type=signup";
	}

	function movieList(){
		location.href = "controller?type=movie";
	}
	
	function reservationForm(){
		location.href = "controller?type=reserve";
	}


	function myInfoGo(){
		location.href = "controller?type=myinfo";
	}
	
	
</script>
</head>
<body>
	<h1>CINEMA</h1>
	
	<button onclick="loginGo()">로그인</button>
	<button onclick="signupForm()">회원가입</button>
	<button onclick="movieList()">영화</button>
	<button onclick="reservationForm()">예매</button>
	<button onclick="myInfoGo()">마이페이지</button>
</body>
</html>