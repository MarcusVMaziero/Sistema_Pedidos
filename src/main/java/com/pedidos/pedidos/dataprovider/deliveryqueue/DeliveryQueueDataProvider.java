package com.pedidos.pedidos.dataprovider.deliveryqueue;

import com.pedidos.pedidos.dataprovider.deliveryqueue.gateway.DeliveryQueueGateway;
import com.pedidos.pedidos.dataprovider.deliveryqueue.models.DeliveryQueue;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

/**
 * DataProvider responsavel por enviar os dados de entrega para o rabbitmq - foi criado separado para tornar genérico no futuro
 *
 * @author Marcus Vinícius
 */
@Service
@RequiredArgsConstructor
public class DeliveryQueueDataProvider implements DeliveryQueueGateway {

    private final RabbitTemplate rabbitTemplate;
    private final Queue queue;

    @Override
    public void send(DeliveryQueue deliveryQueue) {
        rabbitTemplate.convertAndSend(this.queue.getName(), deliveryQueue);
    }
}
