package movie.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import movie.mybatis.DBService;

public class ReservationDAO {
	public static List<String> getReserveList(){
		SqlSession ss = DBService.getFactory().openSession();
		List<String> list = ss.selectList("moviemake.reservedSelectAll");
		ss.close();
		return list;
	}
}
