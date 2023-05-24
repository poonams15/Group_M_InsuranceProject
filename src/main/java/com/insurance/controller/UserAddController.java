package com.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.NomineeAdd;
import com.insurance.model.UserAdd;
import com.insurance.service.NomineeAddService;
import com.insurance.service.UserAddService;

/*
 * Task 167 Design Service to add user with multiple nominee details into system
 * @author by swati kothawal
 */

@RestController

public class UserAddController {
	@Autowired
	private UserAddService userAddService;
	@Autowired
	private NomineeAddService nomineeAddservice;

	@PostMapping("/saveNomineeData")
	public UserAdd saveUserAdd(@RequestBody UserAdd userAdd) {

		UserAdd userAdd1 = userAddService.saveUserAdd(userAdd);
		List<NomineeAdd> nominee2 = userAdd.getNominees();
		for (NomineeAdd nomineee : nominee2) {
			nomineee.setUserAddId(userAdd.getId());
			nomineeAddservice.saveNomineeAdd(nomineee);
		}
		return userAdd1;

	}

}
