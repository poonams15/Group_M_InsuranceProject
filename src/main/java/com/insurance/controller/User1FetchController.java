package com.insurance.controller;

/*
 * Task 150 Build the Restful web service to fetch user with multiple claim details
 * @author by swati kothawal
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.User1Fetch;
import com.insurance.service.User1FetchService;

@RestController
public class User1FetchController {
	// inject the user1service here
	@Autowired
	private User1FetchService user1Service;

	@GetMapping("/getUser/{id}")
	public ResponseEntity<User1Fetch> getUserById(@PathVariable("id") Integer Id) {
		User1Fetch user2 = user1Service.getUser1ById(Id);
		return ResponseEntity.ok().body(user2);
	}
}
