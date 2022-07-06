package com.BikkedIT.UserManagementApp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkedIT.UserManagementApp.Model.CitiesMasterEntity;

public interface CityRepo  extends JpaRepository<CitiesMasterEntity, Integer>{
	
	public List<CitiesMasterEntity> findBystateId(Integer stateId);

}
