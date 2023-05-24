package com.insurance.service;

/*
 * Task 158 Design API to add policy schedule details into database.
 * @author by swati kothawal
 */
import com.insurance.model.PolicyScheduleAdd;

public interface PolicyScheduleAddService {
	public PolicyScheduleAdd savePolicySchedule(PolicyScheduleAdd policyScheduleAdd);
}
