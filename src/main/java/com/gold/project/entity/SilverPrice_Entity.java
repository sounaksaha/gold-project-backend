package com.gold.project.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class SilverPrice_Entity {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
	@Temporal(TemporalType.DATE)
	private Date date;
	private double silverPrice;

	public SilverPrice_Entity() {
		super();
		
	}

	public SilverPrice_Entity(Date date, double silverPrice) {
		super();
		this.date = date;
		this.silverPrice = silverPrice;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getSilverPrice() {
		return silverPrice;
	}

	public void setSilverPrice(double silverPrice) {
		this.silverPrice = silverPrice;
	}

	@Override
	public String toString() {
		return "SilverPrice_Entity [date=" + date + ", silverPrice=" + silverPrice + "]";
	}

}