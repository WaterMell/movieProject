package movie.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import movie.dao.ScheduleDAO;
import movie.vo.ScheduleVO;


@WebServlet("/getMovieDays")
public class getMovieDaysController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">>getMovieDaysController.doGet() 실행~");
		//한글 깨짐 방지를 위한 문자타입(UTF-8) 처리
		response.setContentType("text/html;charset=UTF-8");
		
		String m_no = request.getParameter("m_no");
		System.out.println("m_no : " +m_no);
		
		//DB 데이터 가져오기
		List<ScheduleVO> list = ScheduleDAO.getMovieDays(m_no);
		System.out.println("list : " + list);
		
		String result = makeJson(list);
		System.out.println(":: 응답 JSON 문자열 : " +result);
		
		PrintWriter out = response.getWriter();
		out.print(result);
	}


	private String makeJson(List<ScheduleVO> list) {
		/*
		 {"list" : [
		 {
		 	"schedule_no" : "1",
		 	"m_no" : "1"
		 	"theater_no" :  "1",
		 	"schedule_date" : "2022-04-29",
		 	"start_time" : "09:00" 
		 },
		 {},
		 {}]}
		 */
		
		StringBuilder result = new StringBuilder();
		result.append("{ \"list\" : [");
		
		for(ScheduleVO vo : list) {
			result.append("{");
			result.append("\"schedule_no\" : \""+ vo.getSchedule_no() + "\",");
			result.append("\"m_no\" : \""+ vo.getSchedule_no() + "\",");
			result.append("\"theater_no\" : \""+ vo.getTheater_no() + "\",");
			result.append("\"schedule_date\" : \""+ vo.getSchedule_date() + "\"");
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
