package com.insurance.repository;
/*
 * Task 164 Design API to delete branch details from system 
 * @author by swati kothawal
 */

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.BranchDetailDelete;

@Repository
public interface BranchDetailDeleteRepository extends CrudRepository<BranchDetailDelete, Integer> {

}
