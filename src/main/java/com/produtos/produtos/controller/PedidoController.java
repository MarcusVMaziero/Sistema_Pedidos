package com.produtos.produtos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.produtos.models.Pedido;
import com.produtos.produtos.repository.PedidoRepository;

@RestController
@RequestMapping("/api")
public class PedidoController {

	@Autowired
	private PedidoRepository repository;

	@PostMapping("/v1/pedido")
	public Pedido criarPedido(@RequestBody Pedido pedido) {
		return repository.save(pedido);
	}

}
