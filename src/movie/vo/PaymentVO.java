package movie.vo;

public class PaymentVO {

	private String payment_no;
	private String reserv_no;
	private String pay_date;
	private int tot_price;
	
	
	public String getPayment_no() {
		return payment_no;
	}
	public void setPayment_no(String payment_no) {
		this.payment_no = payment_no;
	}
	public String getReserv_no() {
		return reserv_no;
	}
	public void setReserv_no(String reserv_no) {
		this.reserv_no = reserv_no;
	}
	public String getPay_date() {
		return pay_date;
	}
	public void setPay_date(String pay_date) {
		this.pay_date = pay_date;
	}
	public int getTot_price() {
		return tot_price;
	}
	public void setTot_price(int tot_price) {
		this.tot_price = tot_price;
	}
	
	
	@Override
	public String toString() {
		return "PaymentVO [payment_no=" + payment_no + ", reserv_no=" + reserv_no + ", pay_date=" + pay_date
				+ ", tot_price=" + tot_price + "]";
	}
	
}
