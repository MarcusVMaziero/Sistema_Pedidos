package com.produtos.produtos.core;

import com.produtos.produtos.dataprovider.models.OrderData;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class Order {

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
}
