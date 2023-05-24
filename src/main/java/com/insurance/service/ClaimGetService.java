package com.insurance.service;

/*
 * Task 147 Build the Restful web service to get claim details
 * @author by swati kothawal
 */
import com.insurance.model.ClaimGetDetails;

public interface ClaimGetService {
	public ClaimGetDetails getClaimDetailsById(Integer Id);
}
