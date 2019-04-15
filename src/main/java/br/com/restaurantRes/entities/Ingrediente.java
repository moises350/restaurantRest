package br.com.restaurantRes.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


@Entity
public class Ingrediente extends AbstractEntity
{
	private static final long serialVersionUID = 1L;
	
	@NotNull
	@Column(name = "DESCRICAO")
	private String description;
	
	@NotNull
	@Column(name = "VALUE")
	private double value;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
}
