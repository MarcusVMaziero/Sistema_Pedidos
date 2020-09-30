package com.pedidos.pedidos.core;

import com.pedidos.pedidos.dataprovider.orders.gateway.OrderGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@RequiredArgsConstructor
@Component
public class OrderUseCase {

	private final OrderGateway orderGateway;

	public Order create(Order order) {
		return orderGateway.create(order);
	}
	
	public List<Order> findOrders(){
		return orderGateway.findOrders();
	}
}
