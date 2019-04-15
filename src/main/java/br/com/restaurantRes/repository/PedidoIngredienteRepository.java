package br.com.restaurantRes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.restaurantRes.entities.PedidoIngrediente;

public interface PedidoIngredienteRepository extends JpaRepository<PedidoIngrediente, Long>{
	
	
}
