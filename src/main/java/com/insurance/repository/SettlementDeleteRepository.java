package com.insurance.repository;

/*
 * Design web service to delete the settlement details.
 * @author by swati kothawal
 */
import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.SettlementDelete;

@Repository
public interface SettlementDeleteRepository extends CrudRepository<SettlementDelete, Serializable> {

}
