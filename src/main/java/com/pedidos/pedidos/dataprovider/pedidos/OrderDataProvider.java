package com.pedidos.pedidos.dataprovider.pedidos;

import com.pedidos.pedidos.core.Order;
import com.pedidos.pedidos.dataprovider.pedidos.gateway.OrderGateway;
import com.pedidos.pedidos.dataprovider.pedidos.models.OrderData;
import com.pedidos.pedidos.dataprovider.pedidos.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class OrderDataProvider implements OrderGateway {
    private final OrderRepository repository;

    @Override
    public Order create(Order order) {
        return repository.save(order.toOrderData()).toDomain();
    }

    @Override
    public List<Order> findOrders() {
        return repository.findAll().stream().map(OrderData::toDomain).collect(Collectors.toList());
    }
}
