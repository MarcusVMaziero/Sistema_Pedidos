package com.pedidos.pedidos.dataprovider.delivery.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryData {

    @Id
    @GeneratedValue
    private Long id;
    private Long idOrder;
    private String deliveryAddress;
}
