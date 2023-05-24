package com.insurance.repository;

/*
 * Task 169 Design Service to get user with multiple nominee details from system
 * @author by swati kothawal
 */
import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.UserGet;

@Repository
public interface UserGetRepository extends CrudRepository<UserGet, Serializable> {
	public UserGet findById(int id);
}
