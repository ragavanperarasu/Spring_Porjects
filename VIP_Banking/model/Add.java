package com.VIP.VIP.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class Add {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private String fname;
	private String lname;
	private String phone;
	private String email;
	private String password;
	private String pincode;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}



	@Override
	public String toString() {
		return "Add [fname=" + fname + ", lname=" + lname + ", phone=" + phone + ", email=" + email + ", password="
				+ password + ", pincode=" + pincode + "]";
	}
	
}
