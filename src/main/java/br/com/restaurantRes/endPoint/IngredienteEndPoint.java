package br.com.restaurantRes.endPoint;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.restaurantRes.entities.Ingrediente;
import br.com.restaurantRes.repository.IngredienteRepository;

@RestController
@RequestMapping("ingredientes")
public class IngredienteEndPoint 
{
	@Autowired
	IngredienteRepository ingredientRepositoryDao;
	
	@CrossOrigin
	@GetMapping
	public ResponseEntity<?> listAll()
	{
		return new ResponseEntity<Iterable<Ingrediente>>(ingredientRepositoryDao.findAll(), HttpStatus.OK);
	}
	
	@CrossOrigin
	@PostMapping
	@Transactional(rollbackFor = Exception.class)
	public ResponseEntity<?> save(@Valid @RequestBody Ingrediente ingrediente)
	{
		return new ResponseEntity<Object>(ingredientRepositoryDao.save(ingrediente), HttpStatus.CREATED);
	}

}
