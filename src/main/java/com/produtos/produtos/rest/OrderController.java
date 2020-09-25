package com.produtos.produtos.rest;

import com.produtos.produtos.dataprovider.models.OrderData;
import com.produtos.produtos.rest.model.OrderHttp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.produtos.core.OrderUseCase;

import javax.validation.Valid;

/**
 * Rotas do sistema referente aos Pedidos
 * 
 * @author Marcus Vinicius
 *
 */
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class OrderController {

	private OrderUseCase business;
	
	@PostMapping("/v1/pedido")
	public Object createOrder(@RequestBody @Valid OrderHttp pedido) {
		return this.business.create(pedido.toOrder());
	}
	
	@GetMapping("/v1/pedido")
	public Iterable<OrderData> findOrders() {
		return this.business.findOrders();
	}

}
