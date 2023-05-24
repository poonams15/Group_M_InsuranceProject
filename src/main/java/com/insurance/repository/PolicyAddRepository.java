package com.insurance.repository;
/*
 * /*
 * Task 141 Design API to add policy details into database
 * @author by swati kothawal
 */

import org.springframework.data.jpa.repository.JpaRepository;

/*
 * Task 141 Design API to add policy details into database
 * @author by swati
 */

import org.springframework.stereotype.Repository;

import com.insurance.model.PolicyAdd;

@Repository
public interface PolicyAddRepository extends JpaRepository<PolicyAdd, Integer> {

}
