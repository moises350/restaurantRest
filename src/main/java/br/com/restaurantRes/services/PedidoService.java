package br.com.restaurantRes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.restaurantRes.entities.Pedido;
import br.com.restaurantRes.entities.PedidoIngrediente;
import br.com.restaurantRes.repository.PedidoIngredienteRepository;
import br.com.restaurantRes.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	PedidoRepository pedidoRepository;
	
	@Autowired
	PedidoIngredienteRepository pedidoIngredienteRepository;
	
	public Pedido inserir(Pedido pedido)
	{
		return pedidoRepository.save(pedido);
	}
	
	public PedidoIngrediente inserirPedidoIngrediente(PedidoIngrediente pedidoIngrediente)
	{
		return pedidoIngredienteRepository.save(pedidoIngrediente);
	}
	
	public Pedido inserirPedidoFinal(Pedido pedido, PedidoIngrediente pedidoIngrediente)
	{
		
		return null;
	}
}
