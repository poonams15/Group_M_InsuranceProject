package com.insurance.controller;

/*
 * Design web service to delete the settlement details.
 * @author by swati kothawal
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.service.SettlementDeleteService;

@RestController
public class SettlementDeleteController {
	@Autowired
	private SettlementDeleteService settlementDeleteService;

	@DeleteMapping("deletesettlement/{id}")
	public String deleteSettlement1(@PathVariable("id") Integer id) {
		settlementDeleteService.deleteSettlement(id);

		return "Record is deleted";

	}

}
