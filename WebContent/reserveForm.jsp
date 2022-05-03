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
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약 정보 입력 폼</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">

	$(function(){
		$(".getMovieDay").click(getMovieDays());
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
	               htmlTag += "<td>"+this["schedule_date"]+"</td>"
	               htmlTag += "<td>"+this["start_time"]+"</td>"
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
  	#title1 {
  	float: left;
  	margin-right : 200px;
 	}
  

</style>
</head>
<body>
   <h1>CINEMA RESERVATION</h1>
   <h2>영화예약</h2>
   
<div class="frame" id="schedule">
   <table id="title1" border>
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
   
   <table id="title2" border>
      <thead>
         <tr>
            <th>날짜</th>   
            <th>시간</th>
         </tr>
      </thead>
      <tbody id="tbody">
       	<tr>
       		<td>2022-04-29(샘플링)</td>
       		<td>09:00(샘플링)</td>
       	</tr>
      </tbody>
    </table>
</div>

</body>
</html>