package com.produtos.produtos.business;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.produtos.produtos.models.Pedido;
import com.produtos.produtos.repository.PedidoRepository;

@Component
@RequiredArgsConstructor
public class PedidoBusiness {
	private PedidoRepository repository;

	public Object persiste(Pedido pedido) {
		return repository.save(pedido);
	}
	
	public Iterable<Pedido> buscaTodos(){
		return repository.findAll();
	}
}
