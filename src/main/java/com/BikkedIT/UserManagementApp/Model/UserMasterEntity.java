package com.BikkedIT.UserManagementApp.Model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Id;

@Entity
@Table(name = "USER_DETIALS")
public class UserMasterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Integer Id;
	
	@Column(name = "FIRST_NAME")
	private String fName;
	
	@Column(name = "LAST_NAME")
	private String lName;
	
	@Column(name = "USER_EMAIL_ADD")
	private String mail;
	
	@Column(name = "USER_PHNNO")
	private String PhnNo;
	
	@Column(name = "USER_DOB")
	private Date DOB;
	@Column(name = "GENDER_TYPE")
	private String gender;
	
	@Column(name = "COUNTRY_NAME")
	private String countryName;
	
	@Column(name = "STATE_NAME")
	private String stateName;
	
	@Column(name = "CITY_NAME")
	private String cityName;
	
	@Column(name = "ACCOUNT_STATUS")
	private String accountStatus;
	
	@Column(name = "UPDATE_DATE")
	@CreationTimestamp
	private LocalDate updateDate;
	
	@Column(name = "CREATE_DATE")
	@UpdateTimestamp
	private LocalDate createDate;
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
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public LocalDate getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name = "PASSWORD")
	private String password;
	public UserMasterEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
