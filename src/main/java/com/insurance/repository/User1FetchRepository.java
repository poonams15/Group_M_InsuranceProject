package com.insurance.repository;

/*
 *Task 150  Build the Restful web service to fetch user with multiple claim details
 @author by swati kothawal
 */
import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.User1Fetch;

@Repository
public interface User1FetchRepository extends CrudRepository<User1Fetch, Serializable> {
	public User1Fetch findById(Integer Id);
}
