package br.com.restaurantRes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.restaurantRes.entities.Cardapio;

public interface CardapioRepository extends JpaRepository<Cardapio, Long>{
	
	
}
