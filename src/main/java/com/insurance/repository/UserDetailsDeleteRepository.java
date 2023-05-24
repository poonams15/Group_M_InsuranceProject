package com.insurance.repository;

/*
 * task 138 Build the Restful API to delete the user details from database
 * @author by swati kothawal
 */
import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.UserDetailsDelete;

@Repository
public interface UserDetailsDeleteRepository extends CrudRepository<UserDetailsDelete, Serializable> {

}
