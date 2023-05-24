package com.insurance.controller;

/*
 * Task 158 Design API to add policy schedule details into database.
 * @author by swati kothawal
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.model.PolicyScheduleAdd;
import com.insurance.service.PolicyScheduleAddService;

@RestController
public class PolicyScheduleAddController {
	@Autowired
	private PolicyScheduleAddService policyScheduleService;

	@PostMapping("/policyScheduledata")
	public PolicyScheduleAdd savePolicySchedule(@RequestBody PolicyScheduleAdd policySchedule) {
		PolicyScheduleAdd policySchedule1 = policyScheduleService.savePolicySchedule(policySchedule);
		return policySchedule1;
	}
}
