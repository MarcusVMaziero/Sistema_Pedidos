package com.pedidos.pedidos.core;

import com.pedidos.pedidos.dataprovider.pedidos.models.OrderData;
import com.pedidos.pedidos.rest.model.OrderHttp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    private Long idOrder;
    private Long codCliente;
    private Long codProdutos;
    private Double valorTotal;
    private String enderecoEntrega;

    public OrderData toOrderData() {
        return OrderData.builder()
                .codCliente(codCliente)
                .codProdutos(codProdutos)
                .enderecoEntrega(enderecoEntrega)
                .valorTotal(valorTotal)
                .build();
    }

    public OrderHttp toOrderHttp() {
        return OrderHttp.builder()
                .idOrder(idOrder)
                .codCliente(codCliente)
                .codProdutos(codProdutos)
                .enderecoEntrega(enderecoEntrega)
                .valorTotal(valorTotal)
                .build();
    }
}
