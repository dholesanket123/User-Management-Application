package com.BikkedIT.UserManagementApp.binding;

import java.util.Date;

public class UserForm {
	
	private Integer Id;
	
	private String fName;
	
	private String lName;
	
	private String mail;

	private String PhnNo;
	
	private Date DOB;

	private String gender;
	
	private String countryName;
	
	private String stateName;
	
	private String cityName;
	
	private String password;
	
	private String accountStatus;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhnNo() {
		return PhnNo;
	}

	public void setPhnNo(String phnNo) {
		PhnNo = phnNo;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public UserForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

}
