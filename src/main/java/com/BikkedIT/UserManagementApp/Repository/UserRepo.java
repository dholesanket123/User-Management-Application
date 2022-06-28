package com.BikkedIT.UserManagementApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkedIT.UserManagementApp.Model.UserMasterEntity;

public interface UserRepo extends JpaRepository<UserMasterEntity, Integer> {
	
	

}
