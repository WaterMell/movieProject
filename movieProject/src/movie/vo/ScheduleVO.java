package movie.vo;

public class ScheduleVO {
	
	private String schedule_no;
	private String m_no;
	private String theater_no;
	private String schedule_date;
	private String start_time;
	
	
	public String getSchedule_no() {
		return schedule_no;
	}
	public void setSchedule_no(String schedule_no) {
		this.schedule_no = schedule_no;
	}
	public String getM_no() {
		return m_no;
	}
	public void setM_no(String m_no) {
		this.m_no = m_no;
	}
	public String getTheater_no() {
		return theater_no;
	}
	public void setTheater_no(String theater_no) {
		this.theater_no = theater_no;
	}
	public String getSchedule_date() {
		return schedule_date;
	}
	public void setSchedule_date(String schedule_date) {
		this.schedule_date = schedule_date;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	
	
	@Override
	public String toString() {
		return "ScheduleVO [schedule_no=" + schedule_no + ", m_no=" + m_no + ", theater_no=" + theater_no
				+ ", schedule_date=" + schedule_date + ", start_time=" + start_time + "]";
	}
	
}
