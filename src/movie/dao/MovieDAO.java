package movie.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import movie.mybatis.DBService;
import movie.vo.MovieVO;

public class MovieDAO {
	
	//영화 목록 전체 조회
	public static List<MovieVO> movieList(){
		SqlSession ss = DBService.getFactory().openSession();
		List<MovieVO> list = ss.selectList("moviemake.movieSelectAll");
		ss.close();
		return list;
	}


}
