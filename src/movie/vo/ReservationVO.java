package movie.vo;

public class ReservationVO {
	
	private String reserv_no;
	private String seat_no;
	private String schedule_no;
	private String customer_id;
	private String m_no;
	
	private String cust_number;
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
	public String getCustomer_id() {
		return customer_id;
	}
	public String getCust_number() {
		return cust_number;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
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
				+ ", customer_id=" + customer_id + ", m_no=" + m_no + "]";
	}
	
	
	
	
}
