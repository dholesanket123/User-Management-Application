package com.BikkedIT.UserManagementApp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkedIT.UserManagementApp.Repository.CityRepo;
import com.BikkedIT.UserManagementApp.Repository.CountryRepo;
import com.BikkedIT.UserManagementApp.Repository.StateRepo;
import com.BikkedIT.UserManagementApp.Repository.UserRepo;
import com.BikkedIT.UserManagementApp.binding.UserForm;


@Service
public class UserServiceImpl  implements UserServiceI{
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private CityRepo cityRepo;
	@Autowired
	private CountryRepo countryRepo;
	@Autowired
	private StateRepo stateRepo;
	
	
	

}
