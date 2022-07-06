package com.BikkedIT.UserManagementApp.Services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkedIT.UserManagementApp.Model.CitiesMasterEntity;
import com.BikkedIT.UserManagementApp.Model.CountryMasterEntity;
import com.BikkedIT.UserManagementApp.Model.StatesMasterEntity;
import com.BikkedIT.UserManagementApp.Model.UserMasterEntity;
import com.BikkedIT.UserManagementApp.Repository.CityRepo;
import com.BikkedIT.UserManagementApp.Repository.CountryRepo;
import com.BikkedIT.UserManagementApp.Repository.StateRepo;
import com.BikkedIT.UserManagementApp.Repository.UserRepo;
import com.BikkedIT.UserManagementApp.binding.LoginForm;
import com.BikkedIT.UserManagementApp.binding.UserForm;

@Service
public class UserServiceImpl implements UserServiceI {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private CityRepo cityRepo;

	@Autowired
	private CountryRepo countryRepo;

	@Autowired
	private StateRepo stateRepo;

	@Override
	public String loginCheck(LoginForm loginForm) {

		UserMasterEntity userCheck = userRepo.findByMailAndPassword(loginForm.getEmail(), loginForm.getPassword());
		if (userCheck != null) {
			if (userCheck.getAccountStatus().equals("Lock"))
				return "Account is lock";

			else {

				return "Login successfully  ";
			}
		} else {

			return "Invalid Creditionals ";
		}
	}

	@Override
	public Map<Integer, String> getCountries() {

		List<CountryMasterEntity> list = countryRepo.findAll();

		Map<Integer, String> countryMap = new HashMap<>();
		list.forEach((country) -> countryMap.put(country.getCountryId(), country.getCountryName()));

		return countryMap;
	}

	@Override
	public Map<Integer, String> getState(Integer countryId) {

		Map<Integer, String> statemap = new HashMap<>();

		List<StatesMasterEntity> countryState = stateRepo.findBycountryId(countryId);
		countryState.forEach(state -> statemap.put(state.getStateId(), state.getStateName()));

		return statemap;
	}

	@Override
	public Map<Integer, String> getCities(Integer stateId) {

		List<CitiesMasterEntity> stateCity = cityRepo.findBystateId(stateId);

		Map<Integer, String> cityMap = new HashMap<>();

		stateCity.forEach(city -> cityMap.put(city.getCityId(), city.getCityName()));

		return cityMap;
	}

	// mail check

	public boolean userUniqueMailCheck(String mail) {
		UserMasterEntity findByMail = userRepo.findByMail(mail);

		if (findByMail != null) {

			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean saveUser(UserForm userForm) {
		
		userForm.setPassword(generaterandomPassword());
		userForm.setAccountStatus("Lock");
		// user form data not save Direct in DB Need to Convert into User Master Entity
		
		UserMasterEntity userMasterEntity=new UserMasterEntity();
		// userFrom data copy into userMasterEntity
		BeanUtils.copyProperties(userForm, userMasterEntity);
        UserMasterEntity userSave = userRepo.save(userMasterEntity);
        
        if(userSave !=null) {
        	// send mail 
        	return true;
        }
		return false;
	}
	private String generaterandomPassword() {
		String randomAlphanumeric = RandomStringUtils.randomAlphanumeric(5);
		return randomAlphanumeric;
	
	}
}
