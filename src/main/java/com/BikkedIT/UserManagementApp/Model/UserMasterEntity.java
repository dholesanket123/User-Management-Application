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
	@Column(name="ACCOUNT_STATUS")
	private String accountStatus;
	@Column(name = "UPDATE_DATE")
	@CreationTimestamp
	private LocalDate updateDate;
	@Column(name = "CREATE_DATE")
	@UpdateTimestamp
	private LocalDate createDate;
	

}
