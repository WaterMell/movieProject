<%@page import="java.util.Map"%>
<%@page import="movie.vo.SeatVO"%>
<%@page import="movie.dao.SeatDAO"%>
<%@page import="java.util.HashMap"%>
<%@page import="movie.vo.MovieVO"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.util.List"%>
<%@page import="movie.dao.MovieDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--예약 입력 폼 선택받고 reserve_ok.jsp 파일로 데이터 넘겨주기 --%>

<%
	List<MovieVO> list = MovieDAO.movieList();
	//System.out.println(">>list : " + list);
   
   pageContext.setAttribute("movieList", list); 
   
   Map<String, Object> param = new HashMap();
   
   
   //List<SeatVO> seats = SeatDAO.getSeatData(no, date, time);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약 정보 입력 폼</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">

	  $(function(){
		$(".getMovieDay").click(function(){
			$(this).addClass('selected');
		});
	});  
	 
	$(document).on("click",".getSeat",function(){
		alert("getSeat 실행~");
		console.log($(this).text());
		let schedule_date = $(this).text().substring(0,10);
		let start_time = $(this).text().substring(10).trim();
		console.log("schedule_date : " + schedule_date);
		console.log("start_time : " + start_time);
		
		
		
		//String schedule_date = $(this);
		//System.out.println("schedule_date : " + schedule_date);
		 
	});
	
	function getMovieDays(no){  //String no 입니닷
		alert(">>getMovieDays() 실행~ ");
		
		$.ajax("getMovieDays",{
			type : "get",
			dataType : "json",
			data : "m_no=" +no ,
			success : function(data){
				alert("Ajax 처리 성공 - 응답받은 데이터 : " + data);
				console.log(data);
		        console.log(data.list);
		            
	            //전달받은 JSON 데이터 처리
	            let htmlTag = "";
	            let alist = data.list;
	            $.each(alist,function(index, member){
	               htmlTag += "<tr>";
	               htmlTag += "<td><button class=\"getMovieDay getSeat\">"+this["schedule_date"] + "   "+ this["start_time"]+"</button></td>"
	               htmlTag += "</tr>";
	            });
	            $("#tbody").html(htmlTag);
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
<style>
  	.title {
  	float: left;
  	margin-right : 50px;
 	}
 	
	div h3{
	display: inline-block;
	}
	
	#cnt{
	background-color: #faebd7;
	}
	
	.getMovieDay{
	width: 100%;
	background-color: #ffff96;
	}
	
	.selected{
	background-color: #ffdc46;
	}
  

</style>
</head>
<body>
   <h1>CINEMA RESERVATION</h1>
   <h2>영화예약</h2>

<div id="cnt">
	<h3>인원선택</h3>
   <input type="radio" name="cnt" value="0" checked>0명
   <input type="radio" name="cnt" value="1">1명
   <input type="radio" name="cnt" value="2">3명
   <input type="radio" name="cnt" value="3">4명
</div>

   <table class="title" border>
      <thead>
         <tr>
            <th>영화</th>
         </tr>
      </thead>
      <tbody>
      <c:forEach var="movieList" items="${movieList }">
         <tr>
            <td><button class="getMovieDay" onclick="getMovieDays(${movieList.m_no})" >${movieList.m_name }</button></td>
         </tr>
      </c:forEach>
      </tbody>
   </table>
   
   <table class="title" border>
      <thead>
         <tr>
            <th>날짜 시간</th>   
         </tr>
      </thead>
      <tbody id="tbody">
      </tbody>
    </table>
<form action="controller?type=seatinfo" method="post">
	<input type="hidden" name="no" value="${movieList.m_no }">
	<input type="hidden" name="cnt" value=cnt>
	<input type="hidden" name="date" value=schedule_date>
	<input type="hidden" name="time" value=start_time>
	<input type="submit" value="좌석 선택">
</form>

</body>
</html>