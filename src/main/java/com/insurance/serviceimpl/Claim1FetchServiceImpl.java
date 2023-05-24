package com.insurance.serviceimpl;

/*
 * Task 150 Build the Restful web service to fetch user with multiple claim details
 @author by swati kothawal
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Claim1Fetch;
import com.insurance.repository.Claim1FetchRepository;
import com.insurance.service.Claim1FetchService;

@Service
public class Claim1FetchServiceImpl implements Claim1FetchService {
	@Autowired
	private Claim1FetchRepository claim1FetchRepository;

	@Override
	public Claim1Fetch getClaim1FetchById(Integer Id) {
		Claim1Fetch claim = claim1FetchRepository.findById(Id);
		return claim;
	}

}
