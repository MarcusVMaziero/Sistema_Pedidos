package com.pedidos.pedidos.dataprovider.deliveryqueue.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DeliveryQueue {

    private Long id;
    private Long idOrder;
    private String deliveryAddress;
}
