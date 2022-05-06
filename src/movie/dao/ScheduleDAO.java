package movie.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import movie.mybatis.DBService;
import movie.vo.ScheduleVO;

public class ScheduleDAO {
	
	//영화 번호를 넘겨받아 ScheduleVO리턴
	public static List<ScheduleVO> getMovieDays(String m_no){
		SqlSession ss = DBService.getFactory().openSession();
		List<ScheduleVO> list = ss.selectList("moviemake.movieDay", m_no);
		
		return list;
	}
	
	//영화 번호를 넘겨받아 상영날짜 리스트 리턴
	public static List<String> getDates(String m_no){
		SqlSession ss = DBService.getFactory().openSession();
		List<String> dates = ss.selectList("moviemake.getDate", m_no);
		return dates;
	}
	
	//영화 번호와 상영날짜 넘겨받아 상영시간 리스트 리턴
	public static List<String> getTimes(@Param("m_no")String m_no, @Param("schedule_date")String schedule_date){
		Map<String, String> map = new HashMap();
		map.put("m_no", m_no);
		map.put("schedule_date", schedule_date);
		
		SqlSession ss = DBService.getFactory().openSession();
		List<String> times = ss.selectList("moviemake.getTime", map);
		return times;
	}
}
