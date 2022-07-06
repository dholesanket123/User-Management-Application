package com.BikkedIT.UserManagementApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkedIT.UserManagementApp.Model.UserMasterEntity;

public interface UserRepo extends JpaRepository<UserMasterEntity, Integer> {
	
	
	public UserMasterEntity findByMailAndPassword(String mail,String password);
	
	 public UserMasterEntity findByMail(String mail);

}
