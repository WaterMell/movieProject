package movie.vo;

public class MovieVO {
	private String m_no;
	private String m_name;
	private String m_director ;
	private String m_running_time;
	private String m_actor;
	private String m_open;
	
	
	public String getM_no() {
		return m_no;
	}
	public void setM_no(String m_no) {
		this.m_no = m_no;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_director() {
		return m_director;
	}
	public void setM_director(String m_director) {
		this.m_director = m_director;
	}
	public String getM_running_time() {
		return m_running_time;
	}
	public void setM_running_time(String m_running_time) {
		this.m_running_time = m_running_time;
	}
	public String getM_actor() {
		return m_actor;
	}
	public void setM_actor(String m_actor) {
		this.m_actor = m_actor;
	}
	public String getM_open() {
		return m_open;
	}
	public void setM_open(String m_open) {
		this.m_open = m_open;
	}
	
	
	@Override
	public String toString() {
		return "MovieVO [m_no=" + m_no + ", m_name=" + m_name + ", m_director=" + m_director + ", m_running_time="
				+ m_running_time + ", m_actor=" + m_actor + ", m_open=" + m_open + "]";
	}
	
}
