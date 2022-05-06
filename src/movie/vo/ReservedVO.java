package movie.vo;

public class ReservedVO {
	private String schedule_date;
	private String start_time;
	private String m_name;
	private String m_running_time;
	private String theater_no;
	private String seat_no;
	private String reserv_no;

	public String getSchedule_date() {
		return schedule_date;
	}

	public void setSchedule_date(String schedule_date) {
		this.schedule_date = schedule_date;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_running_time() {
		return m_running_time;
	}

	public void setM_running_time(String m_running_time) {
		this.m_running_time = m_running_time;
	}

	public String getTheater_no() {
		return theater_no;
	}

	public void setTheater_no(String theater_no) {
		this.theater_no = theater_no;
	}

	public String getSeat_no() {
		return seat_no;
	}

	public void setSeat_no(String seat_no) {
		this.seat_no = seat_no;
	}

	public String getReserv_no() {
		return reserv_no;
	}

	public void setReserv_no(String reserv_no) {
		this.reserv_no = reserv_no;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	@Override
	public String toString() {
		return "ReservedVO [schedule_date=" + schedule_date + ", start_time=" + start_time + ", m_name=" + m_name
				+ ", m_running_time=" + m_running_time + ", theater_no=" + theater_no + ", seat_no=" + seat_no
				+ ", reserv_no=" + reserv_no + "]";
	}

	

}
