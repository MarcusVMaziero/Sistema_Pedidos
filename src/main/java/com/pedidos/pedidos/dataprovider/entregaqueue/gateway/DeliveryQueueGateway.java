package com.pedidos.pedidos.dataprovider.entregaqueue.gateway;

import com.pedidos.pedidos.dataprovider.entregaqueue.models.DeliveryQueue;

public interface DeliveryQueueGateway {

    void send(DeliveryQueue deliveryQueue);
}
