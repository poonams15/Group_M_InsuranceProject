package com.insurance.controller;
/*
 * Task 164 Design API to delete branch details from system 
 * @author by swati kothawal
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.service.BranchDetailDeleteService;

@RestController
public class BranchDetailDeleteController {
	@Autowired
	private BranchDetailDeleteService branchDetailDeleteService;

	// design Restful web services to delete the data based on id
	@DeleteMapping("/delete1/{id}")
	public void deleteBranchDetailDelete1ById(@PathVariable("id") Integer id) {
		// calling the method
		branchDetailDeleteService.deleteBranchDetailDelete(id);
	}

}
