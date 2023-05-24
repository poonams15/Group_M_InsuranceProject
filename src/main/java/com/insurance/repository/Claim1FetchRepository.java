package com.insurance.repository;

/*
 * Task 150 Build the Restful web service to fetch user with multiple claim details
 *  @author by swati kothawal
 */
import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Claim1Fetch;

@Repository
public interface Claim1FetchRepository extends CrudRepository<Claim1Fetch, Serializable> {
	public Claim1Fetch findById(Integer Id);
}
