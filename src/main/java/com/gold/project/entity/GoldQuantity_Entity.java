package com.gold.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GoldQuantity_Entity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private double goldQuantity = 0;

	public GoldQuantity_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoldQuantity_Entity(Long id, double goldQuantity) {
		super();
		this.id = id;
		this.goldQuantity = goldQuantity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getGoldQuantity() {
		return goldQuantity;
	}

	public void setGoldQuantity(double goldQuantity) {
		this.goldQuantity = goldQuantity;
	}

	@Override
	public String toString() {
		return "GoldQuantity_Entity [id=" + id + ", goldQuantity=" + goldQuantity + "]";
	}
}
