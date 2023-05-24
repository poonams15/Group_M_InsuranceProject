package com.insurance.repository;

/*
 * Task 158 Design API to add policy schedule details into database.
 * @author by swati kothawal
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.PolicyScheduleAdd;

@Repository
public interface PolicyScheduleAddRepository extends JpaRepository<PolicyScheduleAdd, Integer> {

}
