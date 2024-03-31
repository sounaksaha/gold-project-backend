package com.gold.project.entity;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Transaction_Entity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "customer_phone")
	private Customer customer;
	@Column(name = "transaction_datetime")
	private LocalDateTime transactionDateTime;
	private boolean type;
	private boolean  buy_sell;
	private double quantity;
	private double rate;
	
	
	
	
	public Transaction_Entity(Long id, Customer customer, LocalDateTime transactionDateTime, boolean type,
			boolean buy_sell, double quantity, double rate) {
		super();
		this.id = id;
		this.customer = customer;
		this.transactionDateTime = transactionDateTime;
		this.type = type;
		this.buy_sell = buy_sell;
		this.quantity = quantity;
		this.rate = rate;
	}
	
	public Transaction_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	public LocalDateTime getTransactionDateTime() {
		return transactionDateTime;
	}



	public void setTransactionDateTime(LocalDateTime transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}



	public boolean isType() {
		return type;
	}



	public void setType(boolean type) {
		this.type = type;
	}



	public boolean isBuy_sell() {
		return buy_sell;
	}



	public void setBuy_sell(boolean buy_sell) {
		this.buy_sell = buy_sell;
	}



	public double getQuantity() {
		return quantity;
	}



	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}



	public double getRate() {
		return rate;
	}



	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Transaction_Entity [id=" + id + ", customer=" + customer + ", transactionDateTime="
				+ transactionDateTime + ", type=" + type + ", buy_sell=" + buy_sell + ", quantity=" + quantity + ", rate="
				+ rate + "]";
	}

	
}