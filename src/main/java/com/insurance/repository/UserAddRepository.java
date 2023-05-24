package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.UserAdd;

/*
 * Task 167 Design Service to add user with multiple nominee details into system
 * @author by swati kothawal
 */

@Repository
public interface UserAddRepository extends JpaRepository<UserAdd, Integer> {

}
