package com.BikkedIT.UserManagementApp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkedIT.UserManagementApp.Model.StatesMasterEntity;

public interface StateRepo extends JpaRepository<StatesMasterEntity, Integer> {
	
  public  List<StatesMasterEntity>	findBycountryId(Integer countryId) ;
	
	
	
	

}
