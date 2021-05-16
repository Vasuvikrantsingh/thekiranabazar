package com.kirana.myKiranaapp.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="inventory")
public class Information {
	private String item;
	private String description;
	private String dateBrought;
	private int stock;
	
	
	// define constructors
	
	public Information() {
		
	}
	
	public Information(String item, String description, String dateBrought, int stock) {
		this.item = item;
		this.description = description;
		this.dateBrought = dateBrought;
		this.stock = stock;
	}
	
	
	// define getter/setter

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDateBrought() {
		return dateBrought;
	}

	public void setDateBrought(String dateBrought) {
		this.dateBrought = dateBrought;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	
	
	// define tostring
	
	@Override
	public String toString() {
		return "Information [item=" + item + ", description=" + description + ", dateBrought=" + dateBrought
				+ ", stock=" + stock + "]";
	}
	
	

	
	
	

	
	
	
	
	
	
	

}
