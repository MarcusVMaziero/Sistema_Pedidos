package com.pedidos.pedidos.dataprovider.delivery.repository;

import com.pedidos.pedidos.dataprovider.delivery.models.DeliveryData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<DeliveryData, Long> {
}
