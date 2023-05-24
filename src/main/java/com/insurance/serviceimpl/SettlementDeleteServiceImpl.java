package com.insurance.serviceimpl;

/*
 * Design web service to delete the settlement details.
 * @author by swati kothawal
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.repository.SettlementDeleteRepository;
import com.insurance.service.SettlementDeleteService;

@Service
public class SettlementDeleteServiceImpl implements SettlementDeleteService {
	@Autowired
	private SettlementDeleteRepository settlementDeleteRepository;

	@Override
	public String deleteSettlement(int id) {
		settlementDeleteRepository.deleteById(id);
		return "Record is deleted";
	}

}