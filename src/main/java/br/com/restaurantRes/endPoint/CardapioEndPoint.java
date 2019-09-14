package br.com.restaurantRes.endPoint;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.restaurantRes.entities.Cardapio;
import br.com.restaurantRes.error.ResourceNotFoundException;
import br.com.restaurantRes.repository.CardapioRepository;

@CrossOrigin
@RestController
@RequestMapping("cardapio")
public class CardapioEndPoint 
{
	@Autowired
	CardapioRepository cardapioRepositoryDao;
	
	@GetMapping
	public ResponseEntity<?> listAll()
	{
		return new ResponseEntity<Iterable<Cardapio>>(cardapioRepositoryDao.findAll(), HttpStatus.OK);
	}
	
	@GetMapping( path = "/{id}")
	public ResponseEntity<?> getOrderById(@PathVariable("id") Long id)
	{
		verifyIfOrderExists(id);				
		Optional<Cardapio> cardapio = cardapioRepositoryDao.findById(id);	
		System.out.println(" Ajustando bug");
		return new ResponseEntity<Object>(cardapio, HttpStatus.OK);
	}
	
	@GetMapping(path="/findbyusername/{userName}")
	public ResponseEntity<?> findUsersByUserName(@PathVariable String userName)
	{
		//return new ResponseEntity<Object>(userDao.findByUserNameIgnoreCaseContaining(userName), HttpStatus.OK);
		return null;
	}
	
	@PostMapping
	@Transactional(rollbackFor = Exception.class)
	public ResponseEntity<?> save(@Valid @RequestBody Cardapio cardapio)
	{
		return new ResponseEntity<Object>(cardapioRepositoryDao.save(cardapio), HttpStatus.CREATED);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id)
	{
		verifyIfOrderExists(id);	
		cardapioRepositoryDao.deleteById(id);
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody Cardapio cardapio)
	{
		verifyIfOrderExists(cardapio.getId());	
		cardapioRepositoryDao.save(cardapio);
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
	}
	
	private void verifyIfOrderExists(Long id)
	{
		if(!cardapioRepositoryDao.findById(id).isPresent())
		{
			throw new ResourceNotFoundException("Order not Found for ID: "+ id);
		}
	}

}
