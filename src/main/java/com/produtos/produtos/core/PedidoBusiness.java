package com.produtos.produtos.core;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import com.produtos.produtos.dataprovider.models.Pedido;
import com.produtos.produtos.dataprovider.repository.PedidoRepository;

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
