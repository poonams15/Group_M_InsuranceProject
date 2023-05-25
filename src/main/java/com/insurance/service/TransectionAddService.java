package com.insurance.service;

import com.insurance.model.TransectionAdd;

/*
 * Task 172 Design API to add the transection details for each user after paying the premium
 * @author by swati kothawal
 */

public interface TransectionAddService {
	public TransectionAdd saveTransectionAdd(TransectionAdd transectionAdd);
}
