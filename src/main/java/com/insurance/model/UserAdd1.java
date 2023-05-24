package com.insurance.model;

/*
 * Task 167 Design Service to add user with multiple nominee details into system
 * @author by swati kothawal
 */
import java.util.List;
/*
 * Task 167 Design Service to add user with multiple nominee details into system
 * @author by swati kothawal
 */
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "useradd1")
public class UserAdd1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;

	@OneToMany(mappedBy = "useraddid")
	private List<NomineeAdd> nominees;

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

	public List<NomineeAdd> getNominees() {
		return nominees;
	}

	public void setNominees(List<NomineeAdd> nominees) {
		this.nominees = nominees;
	}

}
