package movie.vo;

public class TheaterVO {

	private String theater_no;
	private int tot_seat;
	
	
	public String getTheater_no() {
		return theater_no;
	}
	public void setTheater_no(String theater_no) {
		this.theater_no = theater_no;
	}
	public int getTot_seat() {
		return tot_seat;
	}
	public void setTot_seat(int tot_seat) {
		this.tot_seat = tot_seat;
	}
	
	@Override
	public String toString() {
		return "TheaterVO [theater_no=" + theater_no + ", tot_seat=" + tot_seat + "]";
	}
}
