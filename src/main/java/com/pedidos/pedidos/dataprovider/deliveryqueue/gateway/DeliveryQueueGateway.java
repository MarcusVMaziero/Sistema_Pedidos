package com.pedidos.pedidos.dataprovider.deliveryqueue.gateway;

import com.pedidos.pedidos.dataprovider.deliveryqueue.models.DeliveryQueue;

public interface DeliveryQueueGateway {

    void send(DeliveryQueue deliveryQueue);
}
