package com.BikkedIT.UserManagementApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkedIT.UserManagementApp.Model.CountryMasterEntity;

public interface CountryRepo extends JpaRepository<CountryMasterEntity, Integer> {

}
