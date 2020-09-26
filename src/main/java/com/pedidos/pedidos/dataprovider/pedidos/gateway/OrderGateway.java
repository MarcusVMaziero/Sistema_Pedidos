package com.pedidos.pedidos.dataprovider.pedidos.gateway;

import com.pedidos.pedidos.core.Order;

import java.util.List;

/**
 * Interface representa contrato de comunicação com Camada de BD
 *
 * @author Marcus Vinícius
 */
public interface OrderGateway {

    public Order create(Order order);

    public List<Order> findOrders();
}
