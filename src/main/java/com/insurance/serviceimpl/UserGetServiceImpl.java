package com.insurance.serviceimpl;

/*
 * Task 169 Design Service to get user with multiple nominee details from system
 * @author by swati kothawal
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.UserGet;
import com.insurance.repository.UserGetRepository;
import com.insurance.service.UserGetService;

@Service
public class UserGetServiceImpl implements UserGetService {
	@Autowired
	private UserGetRepository userGetRepository;

	@Override
	public UserGet getUserGetById(int id) {
		UserGet userGet1 = userGetRepository.findById(id);
		return userGet1;
	}

}
