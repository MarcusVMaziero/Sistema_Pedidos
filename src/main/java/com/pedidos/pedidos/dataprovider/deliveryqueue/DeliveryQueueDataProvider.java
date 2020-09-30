package com.pedidos.pedidos.dataprovider.deliveryqueue;

import com.pedidos.pedidos.dataprovider.deliveryqueue.gateway.DeliveryQueueGateway;
import com.pedidos.pedidos.dataprovider.deliveryqueue.models.DeliveryQueue;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeliveryQueueDataProvider implements DeliveryQueueGateway {

    private static final String HEADER_PROPERTY_ID = "id";

    private final RabbitTemplate rabbitTemplate;
    private final Queue queue;

    @Override
    public void send(DeliveryQueue deliveryQueue) {
        rabbitTemplate.convertAndSend(this.queue.getName(), deliveryQueue, messagePostProcessor -> {
            messagePostProcessor.getMessageProperties().setHeader(HEADER_PROPERTY_ID, deliveryQueue.getId());
            return messagePostProcessor;
        });
    }
}
