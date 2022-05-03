package movie.vo;

public class ReviewVO {
	
	private String review_no;
	private String m_no;
	private String cust_number;
	private String review_content;
	private String regdate;
	private int score;
	
	
	public String getReview_no() {
		return review_no;
	}
	public void setReview_no(String review_no) {
		this.review_no = review_no;
	}
	public String getM_no() {
		return m_no;
	}
	public void setM_no(String m_no) {
		this.m_no = m_no;
	}
	public String getCust_number() {
		return cust_number;
	}
	public void setCust_number(String cust_number) {
		this.cust_number = cust_number;
	}
	public String getReview_content() {
		return review_content;
	}
	public void setReview_content(String review_content) {
		this.review_content = review_content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	@Override
	public String toString() {
		return "ReviewVO [review_no=" + review_no + ", m_no=" + m_no + ", cust_number=" + cust_number
				+ ", review_content=" + review_content + ", regdate=" + regdate + ", score=" + score + "]";
	}
	
}
