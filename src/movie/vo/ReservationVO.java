package movie.vo;

public class ReservationVO {
	
	private String reserv_no;
	private String seat_no;
	private String schedule_no;
	private String cust_number;
	private String m_no;
	public String getReserv_no() {
		return reserv_no;
	}
	public void setReserv_no(String reserv_no) {
		this.reserv_no = reserv_no;
	}
	public String getSeat_no() {
		return seat_no;
	}
	public void setSeat_no(String seat_no) {
		this.seat_no = seat_no;
	}
	public String getSchedule_no() {
		return schedule_no;
	}
	public void setSchedule_no(String schedule_no) {
		this.schedule_no = schedule_no;
	}
	public String getCust_number() {
		return cust_number;
	}
	public void setCust_number(String cust_number) {
		this.cust_number = cust_number;
	}
	public String getM_no() {
		return m_no;
	}
	public void setM_no(String m_no) {
		this.m_no = m_no;
	}
	@Override
	public String toString() {
		return "ReservationVO [reserv_no=" + reserv_no + ", seat_no=" + seat_no + ", schedule_no=" + schedule_no
				+ ", cust_number=" + cust_number + ", m_no=" + m_no + "]";
	}

}
