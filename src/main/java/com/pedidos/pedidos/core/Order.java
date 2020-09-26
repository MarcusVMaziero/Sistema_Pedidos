package com.pedidos.pedidos.core;

import com.pedidos.pedidos.dataprovider.pedidos.models.OrderData;
import com.pedidos.pedidos.rest.model.OrderHttp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    private Long idOrder;
    private Long codeCustomer;
    private List<Long> codeProducts;
    private Double totalAmount;
    private String deliveryAddress;

    public OrderData toOrderData() {
        return OrderData.builder()
                .codeCustomer(codeCustomer)
                .codeProducts(codeProducts)
                .deliveryAddress(deliveryAddress)
                .totalAmount(totalAmount)
                .build();
    }

    public OrderHttp toOrderHttp() {
        return OrderHttp.builder()
                .idOrder(idOrder)
                .codeCustomer(codeCustomer)
                .codeProducts(codeProducts)
                .deliveryAddress(deliveryAddress)
                .totalAmount(totalAmount)
                .build();
    }
}
