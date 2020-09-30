package com.pedidos.pedidos.dataprovider.pedidos;

import com.pedidos.pedidos.core.Order;
import com.pedidos.pedidos.dataprovider.entregaqueue.gateway.DeliveryQueueGateway;
import com.pedidos.pedidos.dataprovider.entregaqueue.models.DeliveryQueue;
import com.pedidos.pedidos.dataprovider.pedidos.gateway.OrderGateway;
import com.pedidos.pedidos.dataprovider.pedidos.models.OrderData;
import com.pedidos.pedidos.dataprovider.pedidos.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderDataProvider implements OrderGateway {

    private final OrderRepository repository;
    private final DeliveryQueueGateway deliveryQueueGateway;

    @Override
    public Order create(Order order) {
        deliveryQueueGateway.send(DeliveryQueue.builder()
                .idOrder(order.getIdOrder())
                .deliveryAddress(order.getDeliveryAddress())
                .build());
        return repository.save(order.toOrderData()).toDomain();
    }

    @Override
    public List<Order> findOrders() {
        return repository.findAll().stream().map(OrderData::toDomain).collect(Collectors.toList());
    }
}
