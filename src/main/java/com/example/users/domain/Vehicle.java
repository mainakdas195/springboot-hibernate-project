package com.example.users.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle" , schema="public")
public class Vehicle implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="vehicle_id")
	private Long id;
	
	@Column(name="vehicle_maker")
	private String maker;
	
	@Column(name="vehicle_model")
	private String model;
	
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
