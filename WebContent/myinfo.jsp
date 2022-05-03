<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function(){
		$(".menu1").mouseenter(function(){
			$('.subMenu1').slideDown(1000);
			
			$(".subMenu1").mouseleave(function(){
				$('.subMenu1').slideUp(1000);
			});
		});
		
		$(".menu2").mouseenter(function(){
			$('.subMenu2').slideDown(1000);
			
			$(".subMenu2").mouseleave(function(){
				$('.subMenu2').slideUp(1000);
			});
		});
	});
	
	function go_reservedP() {
		document.href = "controller?type=reserved"
	}
	
	function go_canceled() {
		document.href = "controller?type=canceled"
	}
	
</script>
<title>MyPage</title>
<style>
	.subMenu1 { display: none; }
	.subMenu2 { display: none; }
	
	ul, ol {
		list-style: none;
	}
	
	li > a > span {
		vertical-align: top;
		white-space: nowrap;
	}
	
	li > ul > li > a > span {
		white-space: nowrap; 
	}
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
					<span>결제내역</span>
				</a>
				<ul class="subMenu1">
					<li id="asd">
						<a onclick="go_reservedP()"><span>예매내역</span></a>
					</li>
					<li id="asd">
						<a onclick="go_canceled()"><span>취소내역</span></a>
					</li>
				</ul>
			</li>
			<li>
				<a class="menu2">
					<span>회원정보 관리</span>
				</a>
				<ul class="subMenu2">
					<li id="asd">
						비밀번호 변경
					</li>
					<li id="asd">
						연락처 변경
					</li>
					<li id="asd">
						탈퇴
					</li>
				</ul>
			</li>
		</ul>
	</div>
	
</body>
</html>