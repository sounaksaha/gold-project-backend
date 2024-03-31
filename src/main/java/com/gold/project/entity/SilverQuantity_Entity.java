package com.gold.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SilverQuantity_Entity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private double silverQuantity = 0;

	public SilverQuantity_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SilverQuantity_Entity(Long id, double silverQuantity) {
		super();
		this.id = id;
		this.silverQuantity = silverQuantity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getSilverQuantity() {
		return silverQuantity;
	}

	public void setSilverQuantity(double silverQuantity) {
		this.silverQuantity = silverQuantity;
	}

	@Override
	public String toString() {
		return "silverQuantity_Entity [id=" + id + ", silverQuantity=" + silverQuantity + "]";
	}
}
