package com.produtos.produtos.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.produtos.produtos.models.Pedido;
import com.produtos.produtos.repository.PedidoRepository;

@Component
public class PedidoBusiness {

	@Autowired
	private PedidoRepository repository;

	public Object persiste(Pedido pedido) {

		return repository.save(pedido);

	}
}
