package br.com.restaurantRes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import br.com.restaurantRes.model.OrderRestaurant;

public interface OrderRepository extends JpaRepository<OrderRestaurant, Long>{
	
	/**
	 * 
	 * @param email
	 */
	void findByEmail(String email);
	
}
