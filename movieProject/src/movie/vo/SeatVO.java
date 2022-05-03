package movie.vo;

public class SeatVO {
	
	private String seat_pk;
	private String seat_no;
	private String theater_no;
	private String seat_ass;
	
	
	public String getSeat_pk() {
		return seat_pk;
	}
	public void setSeat_pk(String seat_pk) {
		this.seat_pk = seat_pk;
	}
	public String getSeat_no() {
		return seat_no;
	}
	public void setSeat_no(String seat_no) {
		this.seat_no = seat_no;
	}
	public String getTheater_no() {
		return theater_no;
	}
	public void setTheater_no(String theater_no) {
		this.theater_no = theater_no;
	}
	public String getSeat_ass() {
		return seat_ass;
	}
	public void setSeat_ass(String seat_ass) {
		this.seat_ass = seat_ass;
	}
	
	@Override
	public String toString() {
		return "SeatVO [seat_pk=" + seat_pk + ", seat_no=" + seat_no + ", theater_no=" + theater_no + ", seat_ass="
				+ seat_ass + "]";
	}
	
}
