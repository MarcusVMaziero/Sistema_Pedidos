package com.pedidos.pedidos.dataprovider.delivery;

import com.pedidos.pedidos.dataprovider.delivery.models.DeliveryData;
import com.pedidos.pedidos.dataprovider.delivery.repository.DeliveryRepository;
import com.pedidos.pedidos.dataprovider.deliveryqueue.models.DeliveryQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class DeliveryDataProviderTest {

    @Mock
    private DeliveryRepository deliveryRepository;

    @InjectMocks
    private DeliveryDataProvider deliveryDataProvider;

    @Test
    public void validateSaveDelivery() {
        when(deliveryRepository.save(deliveryDataMock()))
                .thenReturn(deliveryDataMock());

        deliveryDataProvider.deliveryListener(deliveryQueueMock());
        verify(deliveryRepository, times(1)).save(deliveryDataMock());
    }

    private DeliveryData deliveryDataMock() {
        return DeliveryData.builder()
                .idOrder(1L)
                .deliveryAddress("Rua dos Lagos")
                .build();
    }

    private DeliveryQueue deliveryQueueMock() {
        return DeliveryQueue.builder()
                .idOrder(1L)
                .deliveryAddress("Rua dos Lagos")
                .build();
    }

}