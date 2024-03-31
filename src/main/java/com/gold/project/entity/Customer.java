package com.gold.project.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Customer {

	@Id
	private String phoneNo;
	private String fullName;
	private String address;
	private String pincode;
	private String gender;
	private int age;
	private String email;

	public Customer(String phoneNo, String fullName, String address, String pincode, String gender, int age,
			String email) {
		super();
		this.phoneNo = phoneNo;
		this.fullName = fullName;
		this.address = address;
		this.pincode = pincode;
		this.gender = gender;
		this.age = age;
		this.email = email;
		
	}

	

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "Customer [ fullName=" + fullName + ", phoneNo=" + phoneNo + ", address=" + address
				+ ", pincode=" + pincode + ", gender=" + gender + ", age=" + age + ", email=" + email + "]";
	}

	

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	// getters and setters
}