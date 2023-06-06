package org.ass.core.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="brand_info")
public class Brand implements Serializable {
	
	@Id
	@GenericGenerator(name = "auto_gen", strategy = "increment")
	@GeneratedValue(generator = "auto_gen")
	
	@Column(name="id")
	private long id;
	
	@Column(name="brand")
	private String brand;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "products")
	private List<Product> products;
	
	public Brand(String brand, List<Product> products) {
		super();
		this.brand = brand;
		this.products = products;
	}

	public Brand() {
		// TODO Auto-generated constructor stub
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Brand [brand=" + brand + ", products=" + products + ", getBrand()=" + getBrand() + ", getProducts()="
				+ getProducts() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
