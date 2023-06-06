package org.ass.core.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="flight_info")
public class Flight implements Serializable{
	
	@Id
	@GenericGenerator(name = "auto_gen", strategy = "increment")
	@GeneratedValue(generator = "auto_gen")
	
	@Column(name = "alt_key")
	private long alt_key;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "num_of_seats")
	private String numOfSeats;
	
	@Column(name = "price")
	private String price;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="flight_id")
	private List<Airhostess> airhostessesList;

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

	public String getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(String numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public List<Airhostess> getAirhostessesList() {
		return airhostessesList;
	}

	public void setAirhostessesList(List<Airhostess> airhostessesList) {
		this.airhostessesList = airhostessesList;
	}

}
