package com.pedidos.pedidos.dataprovider.orders;

import com.pedidos.pedidos.core.Order;
import com.pedidos.pedidos.dataprovider.delivery.models.DeliveryData;
import com.pedidos.pedidos.dataprovider.delivery.repository.DeliveryRepository;
import com.pedidos.pedidos.dataprovider.deliveryqueue.gateway.DeliveryQueueGateway;
import com.pedidos.pedidos.dataprovider.deliveryqueue.models.DeliveryQueue;
import com.pedidos.pedidos.dataprovider.orders.models.OrderData;
import com.pedidos.pedidos.dataprovider.orders.repository.OrderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class OrderDataProviderTest {

    @Mock
    private OrderRepository orderRepository;

    @Mock
    private DeliveryQueueGateway deliveryQueueGateway;

    @InjectMocks
    private OrderDataProvider orderDataProvider;

    @Test
    public void testCreateOrdersCallDeliveryQueue() {
        when(orderRepository.save(orderMock().toOrderData()))
                .thenReturn(orderMock().toOrderData());

        DeliveryQueue deliveryQueueMock = DeliveryQueue.builder()
                .idOrder(1L)
                .deliveryAddress("Rua Souza Naves, 300")
                .build();

        orderDataProvider.create(orderMock());
        verify(orderRepository, times(1)).save(orderMock().toOrderData());
        verify(deliveryQueueGateway, times(1)).send(deliveryQueueMock);
    }

    @Test
    public void testFindAllOrders() {
        List<OrderData> orderDataList = new ArrayList<>();
        orderDataList.add(orderMock().toOrderData());
        when(orderRepository.findAll())
                .thenReturn(orderDataList);

        List<Order> response = orderDataProvider.findOrders();
        verify(orderRepository, times(1)).findAll();
        assertEquals(1, response.size());
    }

    private Order orderMock() {
        List<Long> productsCode = new ArrayList<>();
        productsCode.add(50L);
        return Order.builder()
                .idOrder(1L)
                .codeCustomer(1572169L)
                .codeProducts(productsCode)
                .deliveryAddress("Rua Souza Naves, 300")
                .totalAmount(286.20)
                .build();
    }

}