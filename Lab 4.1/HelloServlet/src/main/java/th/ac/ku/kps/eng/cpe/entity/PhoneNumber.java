package th.ac.ku.kps.eng.cpe.entity;

public class PhoneNumber {
	public String number;
	public Customer cus;
	public PhoneNumber() {
		
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Customer getCus() {
		return cus;
	}
	public void setCus(Customer cus) {
		this.cus = cus;
	}
	
}
