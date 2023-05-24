package com.insurance.controller;

/*
 *Task 147 Build the Restful web service to get claim details
 *@author by swati kothawal
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.ClaimGetDetails;
import com.insurance.service.ClaimGetService;

@RestController
public class ClaimGetDetailsController {
	// inject the claimgetdetails service here
	@Autowired
	private ClaimGetService claimGetService;

	@GetMapping("/get/{id}")
	public ResponseEntity<ClaimGetDetails> getClaimGetDetailsById(@PathVariable("id") Integer id) {
		ClaimGetDetails claimGetDetail1 = claimGetService.getClaimDetailsById(id);
		return ResponseEntity.ok().body(claimGetDetail1);
	}
}
