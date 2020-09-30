package com.pedidos.pedidos.dataprovider.orders;

import com.pedidos.pedidos.core.Order;
import com.pedidos.pedidos.dataprovider.deliveryqueue.gateway.DeliveryQueueGateway;
import com.pedidos.pedidos.dataprovider.deliveryqueue.models.DeliveryQueue;
import com.pedidos.pedidos.dataprovider.orders.gateway.OrderGateway;
import com.pedidos.pedidos.dataprovider.orders.models.OrderData;
import com.pedidos.pedidos.dataprovider.orders.repository.OrderRepository;
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
