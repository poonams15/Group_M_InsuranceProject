package com.insurance.repository;

/*
 * Task 172 Design API to add the transection details for each user after paying the premium
 * @author by swati kothawal
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.TransectionAdd;

@Repository
public interface TransectionAddRepository extends JpaRepository<TransectionAdd, Integer> {

}
