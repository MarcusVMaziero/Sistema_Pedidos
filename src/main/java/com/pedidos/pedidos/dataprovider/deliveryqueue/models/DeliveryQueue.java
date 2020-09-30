package com.pedidos.pedidos.dataprovider.deliveryqueue.models;

import lombok.Builder;
import lombok.Data;

/**
 * Objeto que representa a fila de entregas para ser enviado ao rabbitmq
 *
 * @author Marcus Vinícius
 */
@Data
@Builder
public class DeliveryQueue {
    private Long idOrder;
    private String deliveryAddress;
}
