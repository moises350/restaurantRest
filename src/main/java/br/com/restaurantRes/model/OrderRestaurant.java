package br.com.restaurantRes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;



@Entity
public class OrderRestaurant extends AbstractEntity
{
	private static final long serialVersionUID = 1L;
	
	
	@NotEmpty
	@Column(name = "ORDER_DESCRIPTION")
	private String orderDescription;
	
	@NotNull
	private double value;

	public String getOrderDescription() {
		return orderDescription;
	}

	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
}
