package com.pedidos.pedidos.rest;

import com.pedidos.pedidos.core.Order;
import com.pedidos.pedidos.core.OrderUseCase;
import com.pedidos.pedidos.dataprovider.pedidos.models.OrderData;
import com.pedidos.pedidos.rest.model.OrderHttp;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

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

	private final OrderUseCase business;
	
	@PostMapping("/v1/pedido")
	public OrderHttp createOrder(@RequestBody @Valid OrderHttp pedido) {
		return this.business.create(pedido.toOrder()).toOrderHttp();
	}
	
	@GetMapping("/v1/pedido")
	public List<OrderHttp> findOrders() {
		return this.business.findOrders().stream().map(Order::toOrderHttp).collect(Collectors.toList());
	}

}
