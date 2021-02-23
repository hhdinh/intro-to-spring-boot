package com.tts.mySpringBootProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String companyName;
	private String repFirstName;
	private String repLastName;

	public Client() {
	}

	public Client(String companyName, String repFirstName, String repLastName) {
		this.companyName = companyName;
		this.repFirstName = repFirstName;
		this.repLastName = repLastName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getRepfirstName() {
		return repFirstName;
	}

	public void setRepfirstName(String repFirstName) {
		this.repFirstName = repFirstName;
	}

	public String getRepLastName() {
		return repLastName;
	}

	public void setRepLastName(String repLastName) {
		this.repLastName = repLastName;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", companyName=" + companyName + ", repFirstName=" + repFirstName + ", repLastName="
				+ repLastName + "]";
	}
}
