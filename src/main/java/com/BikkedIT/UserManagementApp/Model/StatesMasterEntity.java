package com.BikkedIT.UserManagementApp.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STATE_DETAILS")
public class StatesMasterEntity {
     @Id
     @Column(name=" STATE_ID")
	private Integer stateId;
	@Column(name="STATE_NAME")
	private String stateName;
	@Column(name="COUNTRY_ID")
	private Integer countryId;
	public Integer getStateId() {
		return stateId;
	}
	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	public StatesMasterEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
