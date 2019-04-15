package br.com.restaurantRes.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


@Entity
public class PedidoIngrediente extends AbstractEntity
{
	private static final long serialVersionUID = 1L;
	
	@NotNull
	@Column(name = "ID_CARDAPIO")
	private long idCardapio;
	
	@Column(name = "ID_INGREDIENTE")
	private long idIngrediente;

	public long getIdCardapio() {
		return idCardapio;
	}

	public void setIdCardapio(long idCardapio) {
		this.idCardapio = idCardapio;
	}

	public long getIdIngrediente() {
		return idIngrediente;
	}

	public void setIdIngrediente(long idIngrediente) {
		this.idIngrediente = idIngrediente;
	}
	
	
	
}
