package movie.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import movie.mybatis.DBService;
import movie.vo.ReservationVO;

public class ReservationDAO {
	// 예약 내역 가져오기
	public static List<String> getReserveList(){
		SqlSession ss = DBService.getFactory().openSession();
		List<String> list = ss.selectList("moviemake.reservedSelectAll");
		ss.close();
		return list;
	}

}
