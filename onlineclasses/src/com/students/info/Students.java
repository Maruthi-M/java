package com.students.info;
public class Students {
	private int sid;
	private String sName;
	private int sClass;
	private String mobileNumber;
	private String address;
	public Students()
	{
		super();
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getSclass() {
		return sClass;
	}
	public void setSclass(int sclass) {
		this.sClass = sclass;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Students(int sid, String sName, int sclass, String mobileNumber, String address) {
		super();
		//this.studentList = new ArrayList<Students>();
		this.sid = sid;
		this.sName = sName;
		this.sClass = sclass;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Students [sid=" + sid + ", sName=" + sName + ", sclass=" + sClass + ", mobileNumber=" + mobileNumber
				+ ", address=" + address + "]";
	}
}
