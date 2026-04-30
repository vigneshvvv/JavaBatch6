package sample;

import java.util.Arrays;

public class UserInfo {

	private int id;

	private String name;
	private String address;
	private int mobileNo;
	private int pincode;
	private String[] tags;
	Dimensions dimensions;
	
	public Dimensions getDimensions() {
		return dimensions;
	}
	public void setDimensions(Dimensions dimensions) {
		this.dimensions = dimensions;
	}
	
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", name=" + name + ", address=" + address + ", mobileNo=" + mobileNo
				+ ", pincode=" + pincode + ", tags=" + Arrays.toString(tags) + ", dimensions=" + dimensions + "]";
	}


}
