package com.insurance.model;

/*
 * Task 167 Design Service to add user with multiple nominee details into system
 * @author by swati kothawal
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nomineeadd1")
public class NomineeAdd {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;

	private int useraddid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserAddId() {
		return useraddid;
	}

	public void setUserAddId(int userAddId) {
		this.useraddid = userAddId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
