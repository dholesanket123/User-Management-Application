package com.BikkedIT.UserManagementApp.Services;



import java.util.Map;

import com.BikkedIT.UserManagementApp.binding.LoginForm;
import com.BikkedIT.UserManagementApp.binding.UserForm;


public interface UserServiceI {
	
	public String loginCheck(LoginForm loginForm);
	
	public Map<Integer, String>  getCountries();
	
	public Map<Integer, String> getState(Integer countryId);
	
	public Map<Integer, String> getCities(Integer stateId);
	// check mail 
	public boolean userUniqueMailCheck(String mail);
	
	public boolean saveUser(UserForm userForm);

}
