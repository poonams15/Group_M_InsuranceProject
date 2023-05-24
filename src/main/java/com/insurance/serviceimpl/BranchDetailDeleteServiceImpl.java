package com.insurance.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.repository.BranchDetailDeleteRepository;
import com.insurance.service.BranchDetailDeleteService;

/*
 * Task 164 Design API to delete branch details from system 
 */

@Service
public class BranchDetailDeleteServiceImpl implements BranchDetailDeleteService {
	@Autowired
	private BranchDetailDeleteRepository branchDetailDeleteRepository;

	@Override
	public void deleteBranchDetailDelete(Integer Id) {
		if (Id != null) {
			branchDetailDeleteRepository.deleteById(Id);
		} else {
			throw new NullPointerException("Given id is null");
		}

	}
}
