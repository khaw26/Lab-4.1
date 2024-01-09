package th.ac.ku.kps.eng.cpe.entity;

import java.util.List;

public class Customer {
	public String name;
	public List<PhoneNumber> Listphone;
	public Customer(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<PhoneNumber> getListphone() {
		return Listphone;
	}
	public void setListphone(List<PhoneNumber> listphone) {
		Listphone = listphone;
	}
	
}
