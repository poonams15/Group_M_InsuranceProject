package com.insurance.serviceimpl;

/*
 * Task 147 Build the Restful web service to get claim details
 * @author by swati kothawal
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.ClaimGetDetails;
import com.insurance.repository.ClaimGetRepository;
import com.insurance.service.ClaimGetService;

@Service
public class ClaimGetServiceImpl implements ClaimGetService {
	@Autowired
	private ClaimGetRepository claimRepository;

	@Override
	public ClaimGetDetails getClaimDetailsById(Integer Id) {
		ClaimGetDetails claimDetails = claimRepository.findById(Id);
		return claimDetails;
	}
}
