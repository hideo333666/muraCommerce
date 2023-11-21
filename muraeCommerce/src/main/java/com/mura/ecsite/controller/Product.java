package com.mura.ecsite.controller;

public class Product {
	private Long id;
	
	private String name;
	
	private Double price;
	
	private String description;
	
	public Product() {
	}

	public Product(Long id, String name, Double price, String description) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String gedName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public void getDescription() {
		this.description = description;
	}
	
	public String toString() {
		return "Product{" +
				"id=" + id +
				", name='" + name + '\'' +
				", price=" + price +
				", description='" + description + '\'' +
				'}';
	}
}