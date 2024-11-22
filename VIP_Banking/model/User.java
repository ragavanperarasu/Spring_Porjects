package com.VIP.VIP.model;

public class User {
    private String fname;
    private String lname;
    private String phone;
    private String email;
    private String password;
    private int pincode;
    private String h;

    public String getH() {
		return h;
	}
	public void setH(String h) {
		this.h = h;
	}
	// Getters and Setters
    public String getFname() { return fname; }
    public void setFname(String fname) { this.fname = fname; }

    public String getLname() { return lname; }
    public void setLname(String lname) { this.lname = lname; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public int getPincode() { return pincode; }
    public void setPincode(int pincode) { this.pincode = pincode; }

    @Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", phone=" + phone + ", email=" + email + ", password="
				+ password + ", pincode=" + pincode + ", h=" + h + "]";
	}
}
