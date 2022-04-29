package movie.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import movie.mybatis.DBService;

public class ScheduleDAO {
	public static List<String> getDate() {
		SqlSession ss = DBService.getFactory().openSession();
		List<String> list = ss.selectList("movie.dateList");
		ss.close();
		return list;
	}
}
