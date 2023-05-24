package com.insurance.service;
/*
 * /*
 * Task 141 Design API to add policy details into database
 * @author by swati kothawal
 */

import com.insurance.model.PolicyAdd;

public interface PolicyAddService {
	public PolicyAdd savePolicy(PolicyAdd policyAdd);
}
