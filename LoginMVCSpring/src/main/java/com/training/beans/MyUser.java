package com.training.beans;

public class MyUser {
	private String uname;
	private String upass;
	public MyUser() {
		super();
	}
	public MyUser(String uname, String upass) {
		super();
		this.uname = uname;
		this.upass = upass;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	@Override
	public String toString() {
		return "MyUser [uname=" + uname + ", upass=" + upass + "]";
	}
	
}
