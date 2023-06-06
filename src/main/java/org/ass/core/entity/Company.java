package org.ass.core.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="company_info")
public class Company implements Serializable{
	
	@Id
	@GenericGenerator(name = "auto_gen", strategy = "increment")
	@GeneratedValue(generator = "auto_gen")
	

	@Column(name = "alt_key")
	private long alt_key;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "company_address")
	private String companyAddress;
	
	@Column(name = "company_type")
	private String companyType;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="company_id")
	private List<Employee> emplList;


	public long getAlt_key() {
		return alt_key;
	}


	public void setAlt_key(long alt_key) {
		this.alt_key = alt_key;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCompanyAddress() {
		return companyAddress;
	}


	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}


	public String getCompanyType() {
		return companyType;
	}


	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}


	public List<Employee> getEmplList() {
		return emplList;
	}


	public void setEmplList(List<Employee> emplList) {
		this.emplList = emplList;
	}	
}
