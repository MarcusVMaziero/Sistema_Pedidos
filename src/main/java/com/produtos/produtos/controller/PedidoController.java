package com.produtos.produtos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.produtos.business.PedidoBusiness;
import com.produtos.produtos.models.Pedido;

/**
 * Classe onde é tratada as rotas do sistema referente aos Pedidos
 * 
 * @author Marcus Vinicius
 *
 */
@RestController
@RequestMapping("/api")
public class PedidoController {

	@Autowired
	private PedidoBusiness business;
	
	@PostMapping("/v1/pedido")
	public Object criarPedido(@RequestBody Pedido pedido) {
		return this.business.persiste(pedido);
	}

}
