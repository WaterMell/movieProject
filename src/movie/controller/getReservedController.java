package movie.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import movie.dao.MovieDAO;
import movie.dao.ReservationDAO;
import movie.dao.ReservedDAO;
import movie.dao.ScheduleDAO;
import movie.vo.MovieVO;
import movie.vo.ReservationVO;
import movie.vo.ReservedVO;
import movie.vo.ScheduleVO;

/**
 * Servlet implementation class getReservedController
 */
@WebServlet("/getReserved")
public class getReservedController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("> getReservedController.doGet() 실행!!");
		
		//한글 꺠짐 방지 (UTF-8) 처리
		response.setContentType("text/html;charset=UTF-8");
		
		//DB 데이터 가져오기
//		List<MovieVO> mList = MovieDAO.movieList();
//		List<ScheduleVO> sList = ScheduleDAO.getScheduleAll();
//		List<ReservationVO> rList = ReservationDAO.getReservList();
//		List<Object> totList = new ArrayList<Object>();
		List<ReservedVO> list = ReservedDAO.getReservedList();
		System.out.println("list : " + list);
		//String mResult = makeMovieJson(mList);
		//System.out.println("무비json 문자열: " + list);
		
		String result = makeJson(list);
		System.out.println("응답JSON 문자열 : " + result);
		
		PrintWriter out = response.getWriter();
		out.print(result);
		System.out.println("doGet() 나옴");
	}
	
	private String makeJson(List<ReservedVO> list) {
		System.out.println("makeJson() 들어옴..");
		StringBuilder result = new StringBuilder();
		result.append("{ \"list\" : [");

		for (ReservedVO vo : list) {
			result.append("{");
			result.append("\"schedule_date\" : \" " + vo.getSchedule_date() + "\" ,");
			result.append("\"start_time\" : \" " + vo.getStart_time() + "\",");
			result.append("\"m_name\" :\" " + vo.getM_name() + "\",");
			result.append("\"m_running_time\" : \" " + vo.getM_running_time() + "\" ,");
			result.append("\"theater_no\" : \" " + vo.getTheater_no() + "\",");
			result.append("\"seat_no\" : \" " + vo.getSeat_no() + "\",");
			result.append("\"reserv_no\" : \" " + vo.getReserv_no() + "\" ");
	        result.append("},");
		}

		result.delete(result.length() - 1, result.length());
		result.append("]}");
		return result.toString();
	 }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    System.out.println("> GetJsonMembersController.doPost() 실행~");
		doGet(request, response);
	}

}
