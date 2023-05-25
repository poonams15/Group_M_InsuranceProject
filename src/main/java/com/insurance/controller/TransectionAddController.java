package com.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.TransectionAdd;
import com.insurance.service.TransectionAddService;

/*
 * Task 172 Design API to add the transection details for each user after paying the premium
 * @author by swati kothawal
 */
@RestController
public class TransectionAddController {
	@Autowired
	private TransectionAddService transectionAddService;

	@PostMapping("/savetransectiondata")
	public TransectionAdd saveTransectionAdd1(@RequestBody TransectionAdd transectionAdd) {
		TransectionAdd transectionAdd3 = transectionAddService.saveTransectionAdd(transectionAdd);

		return transectionAdd3;

	}
}
