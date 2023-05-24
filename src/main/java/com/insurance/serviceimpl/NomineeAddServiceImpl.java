package com.insurance.serviceimpl;

/*
 * Task 167 Design Service to add user with multiple nominee details into system
 * @author by swati kothawal
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.NomineeAdd;
import com.insurance.repository.NomineeAddRepository;
import com.insurance.service.NomineeAddService;

@Service
public class NomineeAddServiceImpl implements NomineeAddService {

	@Autowired
	private NomineeAddRepository nomineeAddRepository;

	@Override
	public NomineeAdd saveNomineeAdd(NomineeAdd nomineeAdd) {
		NomineeAdd nomineeAdd1 = nomineeAddRepository.save(nomineeAdd);
		return nomineeAdd1;
	}

}
