package br.com.restaurantRes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.restaurantRes.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
	
	
}
