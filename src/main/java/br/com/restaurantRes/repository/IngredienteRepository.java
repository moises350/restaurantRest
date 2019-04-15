package br.com.restaurantRes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.restaurantRes.entities.Ingrediente;

public interface IngredienteRepository extends JpaRepository<Ingrediente, Long>{
	
	
}
