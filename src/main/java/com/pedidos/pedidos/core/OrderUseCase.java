package com.pedidos.pedidos.core;

import com.pedidos.pedidos.dataprovider.models.OrderData;
import com.pedidos.pedidos.dataprovider.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderUseCase {

	private OrderRepository repository;

	public Object create(Order order) {
		return repository.save(order.toOrderData());
	}
	
	public Iterable<OrderData> findOrders(){
		return repository.findAll();
	}
}
