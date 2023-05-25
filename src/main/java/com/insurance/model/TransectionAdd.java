package com.insurance.model;

/*
 * Task 172 Design API to add the transection details for each user after paying the premium
 * @author by swati kothawal
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transectionadd")
public class TransectionAdd {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private int amount;
	private String transectionStatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getTransectionStatus() {
		return transectionStatus;
	}

	public void setTransectionStatus(String transectionStatus) {
		this.transectionStatus = transectionStatus;
	}

}
