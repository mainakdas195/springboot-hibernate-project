package com.example.users.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bonus",schema="public")
public class Bonus implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id()
	//@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "worker_ref_id")
    private Long id;
	
	@Column(name = "bonus_amount")
	private int amount;
	
	@Column(name = "bonus_date")
	private Date date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
