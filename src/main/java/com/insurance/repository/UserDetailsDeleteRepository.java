package com.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.UserDetailsDelete;

/*
 * task 138 Build the Restful API to delete the user details from database
 * @author by swati kothawal
 */
@Repository
public interface UserDetailsDeleteRepository extends CrudRepository<UserDetailsDelete, Serializable> {

}
