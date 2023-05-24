package com.insurance.serviceimpl;

/*
 * task 138 Build the Restful API to delete the user details from database
 * @author by swati kothawal
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.repository.UserDetailsDeleteRepository;
import com.insurance.service.UserDeleteService;

@Service
public class UserDeleteServiceImpl implements UserDeleteService {
//inject the repository service
	@Autowired
	private UserDetailsDeleteRepository userDetailsRepository;

	@Override
	public void deleteUserDetails(Integer Id) {

		if (Id != null) {
			userDetailsRepository.deleteById(Id);
		} else {
			throw new NullPointerException("Given id is null");
		}

	}

}
