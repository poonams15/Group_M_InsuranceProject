package com.insurance.serviceimpl;

/*
 * Task 158 Design API to add policy schedule details into database.
 * @author by swati
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.PolicyScheduleAdd;
import com.insurance.repository.PolicyScheduleAddRepository;
import com.insurance.service.PolicyScheduleAddService;

@Service
public class PolicyScheduleAddServiceImpl implements PolicyScheduleAddService {
	@Autowired
	private PolicyScheduleAddRepository policyScheduleRepository;

	@Override
	public PolicyScheduleAdd savePolicySchedule(PolicyScheduleAdd policyScheduleAdd) {
		PolicyScheduleAdd policySchedule1 = policyScheduleRepository.save(policyScheduleAdd);
		return policySchedule1;
	}

}
