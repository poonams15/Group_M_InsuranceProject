package com.insurance.controller;

/*
 * task 138 Build the Restful API to delete the user details from database
 * @author by swati kothawal
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.service.UserDeleteService;

@RestController
public class UserDeleteController {
//inject the UserService here
	@Autowired
	private UserDeleteService userService;

	// design Restful web services to delete the data based on id
	@DeleteMapping("/delete/{id}")
	public void deleteUserDetailsById(@PathVariable("id") Integer id) {
//calling the method 
		userService.deleteUserDetails(id);
	}

}
