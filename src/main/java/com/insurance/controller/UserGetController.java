package com.insurance.controller;

/*
 * Task 169 Design Service to get user with multiple nominee details from system
 * @author by swati kothawal
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.insurance.model.UserGet;

import com.insurance.service.UserGetService;

@RestController
//@RequestMapping(value = "/userget")
public class UserGetController {
	@Autowired
	private UserGetService userGetService;

	@GetMapping("/getnomineeData/{id}")
	public ResponseEntity<UserGet> getUser1ById(@PathVariable int id) {
		UserGet UserGet1 = userGetService.getUserGetById(id);
		return ResponseEntity.ok().body(UserGet1);

	}
}
