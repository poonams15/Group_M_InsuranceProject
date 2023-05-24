package com.insurance.controller;

/*
 * Task 141 Design API to add policy details into database
 * @author by swati kothawal
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PolicyAdd;

import com.insurance.service.PolicyAddService;

@RestController
//@RequestMapping(value = "/user")
public class PolicyAddController {

	@Autowired
	private PolicyAddService policyAddService;

	@PostMapping("/savePolicyData")
	public ResponseEntity<PolicyAdd> savePolicy(@RequestBody PolicyAdd policyAdd) {

		PolicyAdd policyAdd1 = policyAddService.savePolicy(policyAdd);

		return ResponseEntity.ok().body(policyAdd1);

	}

}
