package test.springboot.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ItemModel {
	//Photo ,
	
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private Integer id;
	
	
	String brand,type,gender;
	/*@Column
	int Price,current_discount;
	@Column
	Date discount_duration,ArrivalDate;
	@Column
	Boolean new_arrival;*/
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/*public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getCurrent_discount() {
		return current_discount;
	}
	public void setCurrent_discount(int current_discount) {
		this.current_discount = current_discount;
	}
	public Date getDiscount_duration() {
		return discount_duration;
	}
	public void setDiscount_duration(Date discount_duration) {
		this.discount_duration = discount_duration;
	}
	public Date getArrivalDate() {
		return ArrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		ArrivalDate = arrivalDate;
	}
	public Boolean getNew_arrival() {
		return new_arrival;
	}
	public void setNew_arrival(Boolean new_arrival) {
		this.new_arrival = new_arrival;
	}*/
}
