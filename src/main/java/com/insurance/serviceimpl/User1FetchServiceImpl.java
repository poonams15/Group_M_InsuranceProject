package com.insurance.serviceimpl;

/*
 * Task 150 Build the Restful web service to fetch user with multiple claim details
 @author by swati kothawal
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.User1Fetch;
import com.insurance.repository.User1FetchRepository;
import com.insurance.service.User1FetchService;

@Service
public class User1FetchServiceImpl implements User1FetchService {
	@Autowired
	private User1FetchRepository user1Repository;

	@Override
	public User1Fetch getUser1ById(Integer Id) {
		User1Fetch user = user1Repository.findById(Id);
		return user;
	}

}
