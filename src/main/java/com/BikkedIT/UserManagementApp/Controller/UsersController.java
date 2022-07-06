package com.BikkedIT.UserManagementApp.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.BikkedIT.UserManagementApp.Services.UserServiceI;
import com.BikkedIT.UserManagementApp.binding.LoginForm;
import com.BikkedIT.UserManagementApp.binding.UserForm;

@RestController
public class UsersController {

	@Autowired
	private UserServiceI userServiceI;

	@RequestMapping(value = "/login", produces = "Application/json")
	public ResponseEntity<String> loginUser(@RequestBody LoginForm loginForm) {

		String loginCheck = userServiceI.loginCheck(loginForm);

		return new ResponseEntity<String>(loginCheck, HttpStatus.OK);

	}

	// get country Data Using Get Method
	@GetMapping("/getCountry")
	public ResponseEntity<Map<Integer, String>> getCountryData() {
		Map<Integer, String> countries = userServiceI.getCountries();

		return new ResponseEntity<>(countries, HttpStatus.OK);
	}

	// Get State Data using GET Method
	@GetMapping("/getState/{cid}")
	public ResponseEntity<Map<Integer, String>> getStateData(@PathVariable Integer cid) {

		Map<Integer, String> stateData = userServiceI.getState(cid);

		return new ResponseEntity<>(stateData, HttpStatus.OK);

	}
	// Get cities Data Using GET Method

	@GetMapping("/getCities/{sid}")
	public ResponseEntity<Map<Integer, String>> getCitiesData(@PathVariable Integer sid) {
		Map<Integer, String> cities = userServiceI.getCities(sid);
		return new ResponseEntity<>(cities, HttpStatus.OK);
	}

	// Check mail using GetMethod

	@GetMapping("/mailCheck/Mail")
	public ResponseEntity<String> uniqMailCheck(@PathVariable String Mail) {

		boolean mailCheck = userServiceI.userUniqueMailCheck(Mail);
		if (mailCheck == true) {
			String msg = "Your mail id is Correct ";
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} else {
			String msg = "Sign in to your Google Account with another email address";
			return new ResponseEntity<>(msg, HttpStatus.OK);
		}
	}

	// SaveUser Data
	@PostMapping("/saveUser")
	public ResponseEntity<String> userSave(@RequestBody UserForm userForm) {

		boolean saveUser = userServiceI.saveUser(userForm);

		if (saveUser == true) {

			String msg = "User Save Successfully !!!";
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		} else {
			String msg = "User Not Save Successfully !!!";
			return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);
		}

	}

}
