package com.insurance.serviceimpl;

/*
 * Task 167 Design Service to add user with multiple nominee details into system
 * @author by swati kothawal
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.UserAdd;
import com.insurance.repository.UserAddRepository;
import com.insurance.service.UserAddService;

@Service
public class UserAddServiceImpl implements UserAddService {
	@Autowired
	private UserAddRepository userAddRepository;

	@Override
	public UserAdd saveUserAdd(UserAdd userAdd) {
		UserAdd userAdd1 = userAddRepository.save(userAdd);

		return userAdd1;
	}

}
