package com.insurance.model;

/*
 * Task 158 Design API to add policy schedule details into database.
 * @author by swati kothawal
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "policyscheduleAdd")
public class PolicyScheduleAdd {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String planName;
	private String primiumAmount;
	private String policyName;
	private String userName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPrimiumAmount() {
		return primiumAmount;
	}

	public void setPrimiumAmount(String primiumAmount) {
		this.primiumAmount = primiumAmount;
	}

}
