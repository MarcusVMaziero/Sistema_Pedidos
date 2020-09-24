package com.produtos.produtos.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.produtos.core.PedidoBusiness;
import com.produtos.produtos.dataprovider.models.Pedido;

/**
 * Rotas do sistema referente aos Pedidos
 * 
 * @author Marcus Vinicius
 *
 */
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PedidoController {

	private PedidoBusiness business;
	
	@PostMapping("/v1/pedido")
	public Object criarPedido(@RequestBody Pedido pedido) {
		return this.business.persiste(pedido);
	}
	
	@GetMapping("/v1/pedido")
	public Iterable<Pedido> buscarPedidos() {
		return this.business.buscaTodos();
	}

}