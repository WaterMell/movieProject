package movie.vo;

public class CustomerVO {
	private String cust_number;
	private String customer_id;
	private String password;
	private String customer_name;
	private String phone;

	
	public String getCust_number() {
		return cust_number;
	}

	public void setCust_number(String cust_number) {
		this.cust_number = cust_number;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "CustomerVO [cust_number=" + cust_number + ", customer_id=" + customer_id + ", password=" + password
				+ ", customer_name=" + customer_name + ", phone=" + phone + "]";
	}
	
	
}
