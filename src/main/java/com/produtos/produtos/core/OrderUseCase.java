package com.produtos.produtos.core;

import com.produtos.produtos.dataprovider.models.OrderData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import com.produtos.produtos.dataprovider.repository.OrderRepository;

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
