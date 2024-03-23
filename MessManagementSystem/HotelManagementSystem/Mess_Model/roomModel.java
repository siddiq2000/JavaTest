// roomModel.java
package Mess_Model;

public class roomModel {
	private int roomNo;
	private String type;
	private double price;
	private int rid;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private boolean available;
	private String reservedBy;

	public roomModel(int roomNo, String type, double price, String reservedBy, boolean available) {
		super();
		this.roomNo = roomNo;
		this.type = type;
		this.price = price;
		this.reservedBy = reservedBy;
		this.available = available;
	}



	public String getReservedBy() {
		return reservedBy;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public void setReservedBy(String roomCustomerName) {

		this.reservedBy = roomCustomerName;
	}

}
