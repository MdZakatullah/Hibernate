package org.ass.core.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="captain_info")

public class Captain implements Serializable{

	@Id
	@GenericGenerator(name = "auto_gen", strategy = "increment")
	@GeneratedValue(generator = "auto_gen")
	
	@Column(name = "alt_key")
	private long alt_key;
	
	@Column(name = "captain_name")
	private String captainName;
	
	@Column(name = "age")
	private String age;
	
	@Column(name = "email")
	private String email;

	
	public long getAlt_key() {
		return alt_key;
	}

	public void setAlt_key(long alt_key) {
		this.alt_key = alt_key;
	}

	public String getCaptainName() {
		return captainName;
	}

	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Captain [alt_key=" + alt_key + ", captainName=" + captainName + ", age=" + age + ", email=" + email
				+ "]";
	}
	
	
	
	
}
