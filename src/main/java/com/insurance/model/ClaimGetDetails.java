package com.insurance.model;

/*
 * task 147 Build the Restful web service to get claim details
 * @author by swati kothawal
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name = "claimgetdetails")
public class ClaimGetDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String claimStatus;
	private int claimAmount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}

	public int getClaimAmount() {
		return claimAmount;
	}

	public void setClaimAmount(int claimAmount) {
		this.claimAmount = claimAmount;
	}

}
