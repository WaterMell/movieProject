package movie.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import movie.mybatis.DBService;

public class MovieDAO {
	
	//영화 목록 전체 조회
	public static List<String> movieList(){
		SqlSession ss = DBService.getFactory().openSession();
		List<String> list = ss.selectList("moviemake.movieSelectAll");
		ss.close();
		return list;
	}

}
