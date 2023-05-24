package com.insurance.model;

/*
 *Task 150  Build the Restful web service to fetch user with multiple claim details
 *  @author by swati kothawal
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "claim2")
public class Claim1Fetch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private int claimId;
	private int userId;
	private String claimStatus;
	private int claimAmount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClaimId() {
		return claimId;
	}

	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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
