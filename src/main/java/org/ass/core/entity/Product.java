package org.ass.core.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="product_info")
public class Product implements Serializable{
	
	@Column(name="product_name")
	private String productName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="brand_product")
	private List<Brand> brands;

	public Product(String productName, List<Brand> brands) {
		super();
		this.productName = productName;
		this.brands = brands;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<Brand> getBrands() {
		return brands;
	}

	public void setBrands(List<Brand> brands) {
		this.brands = brands;
	}

}
