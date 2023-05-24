package com.insurance.serviceimpl;

/*
 * Task 141 Design API to add policy details into database
 * @author by swati kothawal
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.PolicyAdd;
import com.insurance.repository.PolicyAddRepository;
import com.insurance.service.PolicyAddService;

@Service
public class PolicyAddServiceImpl implements PolicyAddService {
	@Autowired
	private PolicyAddRepository policyRepository;

	@Override
	public PolicyAdd savePolicy(PolicyAdd policyAdd) {
		PolicyAdd policy1 = policyRepository.save(policyAdd);
		return policy1;
	}

}
