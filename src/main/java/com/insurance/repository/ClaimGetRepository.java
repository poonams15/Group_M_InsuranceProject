package com.insurance.repository;

/*
 * Task 147 Build the Restful web service to get claim details
 * @author by swati kothawal
 */
import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.ClaimGetDetails;

@Repository
public interface ClaimGetRepository extends CrudRepository<ClaimGetDetails, Serializable> {
	public ClaimGetDetails findById(Integer Id);

}
