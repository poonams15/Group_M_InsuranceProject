package com.insurance.serviceimpl;

/*
 * Task 167 Design Service to add user with multiple nominee details into system
 * @author by swati kothawal
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.UserAdd1;
import com.insurance.repository.UserAdd1Repository;
import com.insurance.service.UserAdd1Service;

@Service
public class UserAdd1ServiceImpl implements UserAdd1Service {
	@Autowired
	private UserAdd1Repository userAddRepository;

	@Override
	public UserAdd1 saveUserAdd(UserAdd1 userAdd) {
		UserAdd1 userAdd1 = userAddRepository.save(userAdd);

		return userAdd1;
	}

}
