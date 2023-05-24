package com.insurance.model;

/*
 * Task 169 Design Service to get user with multiple nominee details from system
 * @author by swati kothawal
 */
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "userget")
public class UserGet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "id", cascade = CascadeType.ALL)
	private List<NomineeGet> nominees = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void setNominees(List<NomineeGet> nominees) {
		this.nominees = nominees;
	}

	public List<NomineeGet> getNominees() {
		return nominees;
	}
}
