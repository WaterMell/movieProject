package movie.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import movie.mybatis.DBService;
import movie.vo.SeatVO;

public class SeatDAO {
	
	//영화 번호, 상영 날짜, 상영 시간을 넘겨받아 SeatVO 리턴
	public static List<SeatVO> getSeats(HashMap<String, Object> map){
		SqlSession ss = DBService.getFactory().openSession();
		List<SeatVO> seats = ss.selectList("moviemake.getSeat",map);
		
		return seats;
	}
	
	public static List<SeatVO> getSeatData(String no,String date, String time) {
		Map<String, Object> param = new HashMap();
		param.put("m_no",no);
		param.put("schedule_date", date);
		param.put("start_time", time);
		
		SqlSession ss = DBService.getFactory().openSession();
		List<SeatVO> seats = ss.selectList("moviemake.getSeat", param);
		ss.close();
		
		return seats;
	}

}
