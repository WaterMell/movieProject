package movie.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import movie.dao.ReservationDAO;

public class ReservedPageCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<String> list = ReservationDAO.getReserveList();
		
		request.setAttribute("list", list);
		
		return "myinfo.jsp";
	}

}
