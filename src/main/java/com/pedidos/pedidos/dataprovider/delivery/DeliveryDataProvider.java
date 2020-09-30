package com.pedidos.pedidos.dataprovider.delivery;

import com.pedidos.pedidos.dataprovider.delivery.models.DeliveryData;
import com.pedidos.pedidos.dataprovider.delivery.repository.DeliveryRepository;
import com.pedidos.pedidos.dataprovider.deliveryqueue.models.DeliveryQueue;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

/**
 * DataProvider responsavel por escutar o rabbitmq na fila de delivery e salvar na base os dados
 *
 * @author Marcus Vinícius
 */
@Service
@RequiredArgsConstructor
public class DeliveryDataProvider {

    private final DeliveryRepository deliveryRepository;

    @RabbitListener(queues = {"${queue.delivery.name}"})
    public void deliveryListener(@Payload DeliveryQueue delivery){
        save(DeliveryData.builder()
                .idOrder(delivery.getIdOrder())
                .deliveryAddress(delivery.getDeliveryAddress())
                .build());
    }

    private void save(DeliveryData deliveryData){
        deliveryRepository.save(deliveryData);
    }
}
