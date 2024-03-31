package com.gold.project.entity;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class GoldPrice_Entity {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
	@Temporal(TemporalType.DATE)
	private Date date;
	private double goldPrice;

	public GoldPrice_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoldPrice_Entity(Date date, double goldPrice) {
		super();
		this.date = date;
		this.goldPrice = goldPrice;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getGoldPrice() {
		return goldPrice;
	}

	public void setGoldPrice(double goldPrice) {
		this.goldPrice = goldPrice;
	}

	@Override
	public String toString() {
		return "GoldPrice_Entity [date=" + date + ", goldPrice=" + goldPrice + "]";
	}

}