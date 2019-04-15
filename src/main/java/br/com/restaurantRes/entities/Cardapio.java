package br.com.restaurantRes.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;


@Entity
public class Cardapio extends AbstractEntity
{
	private static final long serialVersionUID = 1L;
	
	@NotNull
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@NotNull
	@Column(name = "NOME")
	private String nome;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
