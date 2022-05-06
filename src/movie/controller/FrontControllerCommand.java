package movie.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import movie.command.CanceledCommand;
import movie.command.Command;
import movie.command.LoginCommand;
import movie.command.MovieCommand;
import movie.command.MyinfoCommand;
import movie.command.ReserveCommand;
import movie.command.ReservedPageCommand;
import movie.command.SeatCommand;
import movie.command.SignupCommand;

@WebServlet("/controller")
public class FrontControllerCommand extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">FrontControllerCommand.doGet() 실행~-----");
		String type = request.getParameter("type");
		System.out.println("> type : " + type);
		
		Command command = null;
		if("login".equals(type)) {
			command = new LoginCommand();
		}else if ("signup".equals(type)) {
			command = new SignupCommand();
		}else if ("movie".equals(type)) {
			command = new MovieCommand();
		}else if ("reserve".equals(type)) {
			command = new ReserveCommand();
		}else if ("myinfo".equals(type)) {
			command = new MyinfoCommand();
		} else if ("reserved".equals(type)) {
			command = new ReservedPageCommand();
		} else if ("canceled".equals(type)) {
			command = new CanceledCommand();
		} else if ("seatinfo".equals(type)) {
			command = new SeatCommand();
		}
		
		
		String path = command.exec(request, response);
		request.getRequestDispatcher(path).forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">FrontControllerCommand.doPost() 실행~-----");
		request.setCharacterEncoding("UTF-8"); 
		doGet(request, response);
	}

}
