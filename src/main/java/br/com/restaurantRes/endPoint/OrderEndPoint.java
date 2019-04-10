package br.com.restaurantRes.endPoint;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.restaurantRes.error.ResourceNotFoundException;
import br.com.restaurantRes.model.OrderRestaurant;
import br.com.restaurantRes.repository.OrderRepository;

@RestController
@RequestMapping("orders")
public class OrderEndPoint 
{
	@Autowired
	OrderRepository orderRepositoryDao;
	
	@GetMapping
	public ResponseEntity<?> listAll()
	{
		
		return new ResponseEntity<Iterable<OrderRestaurant>>(orderRepositoryDao.findAll(), HttpStatus.OK);
	}
	
	@GetMapping( path = "/{id}")
	public ResponseEntity<?> getOrderById(@PathVariable("id") Long id)
	{
		verifyIfOrderExists(id);				
		Optional<OrderRestaurant> order = orderRepositoryDao.findById(id);	
		return new ResponseEntity<Object>(order, HttpStatus.OK);
	}
	
	@GetMapping(path="/findbyusername/{userName}")
	public ResponseEntity<?> findUsersByUserName(@PathVariable String userName)
	{
		//return new ResponseEntity<Object>(userDao.findByUserNameIgnoreCaseContaining(userName), HttpStatus.OK);
		return null;
	}
	
	@PostMapping
	@Transactional(rollbackFor = Exception.class)
	public ResponseEntity<?> save(@Valid @RequestBody OrderRestaurant order)
	{
		return new ResponseEntity<Object>(orderRepositoryDao.save(order), HttpStatus.CREATED);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id)
	{
		verifyIfOrderExists(id);	
		orderRepositoryDao.deleteById(id);
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody OrderRestaurant order)
	{
		verifyIfOrderExists(order.getId());	
		orderRepositoryDao.save(order);
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
	}
	
	private void verifyIfOrderExists(Long id)
	{
		if(!orderRepositoryDao.findById(id).isPresent())
		{
			throw new ResourceNotFoundException("Order not Found for ID: "+ id);
		}
	}

}
