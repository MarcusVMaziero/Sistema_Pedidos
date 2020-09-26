package com.pedidos.pedidos.core;

import com.pedidos.pedidos.dataprovider.pedidos.gateway.OrderGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class OrderUseCase {

	private OrderGateway orderGateway;

	public Order create(Order order) {
		return orderGateway.create(order);
	}
	
	public List<Order> findOrders(){
		return orderGateway.findOrders();
	}
}
