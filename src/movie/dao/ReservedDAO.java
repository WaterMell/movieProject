package movie.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import movie.mybatis.DBService;
import movie.vo.ReservedVO;

public class ReservedDAO {
	//예약 내역 가져오기 (나중에 아이디를 파라미터로 받을 것)
	public static List<ReservedVO> getReservedList() {
		SqlSession ss = DBService.getFactory().openSession();
		List<ReservedVO> list = ss.selectList("moviemake.reservedAll");
		ss.close();
		return list;
	}
}
