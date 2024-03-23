package Mess_Model;

public class customerModel {
	private String name;
	private String email;
	private int cid;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	private String phonenumber;

	public customerModel(String name, String email, String phonenumber) {
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
	}

	public customerModel() {

	}
}
