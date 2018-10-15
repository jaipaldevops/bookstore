/**
 * 
 */
package com.springboot.bookstore.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author suman
 *
 */
@Entity
@Table(name = "BOOKS")
public class Books {

	@Id
	private Long id;
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	private String details;
	private Double price;
	private String image;

	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", details=" + details + ", price=" + price + ", image=" + image
				+ "]";
	}

}
