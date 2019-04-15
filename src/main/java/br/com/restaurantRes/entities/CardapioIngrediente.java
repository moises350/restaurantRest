package br.com.restaurantRes.entities;

import javax.persistence.Entity;

@Entity
public class CardapioIngrediente extends AbstractEntity
{
	private static final long serialVersionUID = 1L;
	
	private long idIngrediente;
	private long idPedido;
	public long getIdIngrediente() {
		return idIngrediente;
	}
	public void setIdIngrediente(long idIngrediente) {
		this.idIngrediente = idIngrediente;
	}
	public long getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
	}
	
	
	
}
