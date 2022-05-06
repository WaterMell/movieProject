package movie.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import movie.mybatis.DBService;
import movie.vo.ScheduleVO;

public class ScheduleDAO {
	
	//영화 제목(or 영화 번호)를 넘겨받아 ScheduleVO리턴
	public static List<ScheduleVO> getMovieDays(String m_no){
		SqlSession ss = DBService.getFactory().openSession();
		List<ScheduleVO> list = ss.selectList("moviemake.movieDay", m_no);
		
		return list;
	}
	
	public static List<ScheduleVO> getScheduleAll() {
		SqlSession ss = DBService.getFactory().openSession();
		List<ScheduleVO> list = ss.selectList("moviemake.scheduleAll");
		ss.close();
		return list;
	}
	
}
