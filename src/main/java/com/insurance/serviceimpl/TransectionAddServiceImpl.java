package com.insurance.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.TransectionAdd;
import com.insurance.repository.TransectionAddRepository;
import com.insurance.service.TransectionAddService;

/*
 * Task 172 Design API to add the transection details for each user after paying the premium
 * @author by swati kothawal
 */
@Service
public class TransectionAddServiceImpl implements TransectionAddService {
	@Autowired
	private TransectionAddRepository transectionAddRepository;

	@Override
	public TransectionAdd saveTransectionAdd(TransectionAdd transectionAdd) {
		TransectionAdd transectionAdd2 = transectionAddRepository.save(transectionAdd);
		return transectionAdd2;
	}

}
