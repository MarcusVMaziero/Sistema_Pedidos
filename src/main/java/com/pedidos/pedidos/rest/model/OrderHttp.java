package com.pedidos.pedidos.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pedidos.pedidos.core.Order;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class OrderHttp {

    @NotNull
    @JsonProperty("codigo_cliente")
    private Long codCliente;

    @NotNull
    @JsonProperty("codigo_produtos")
    private Long codProdutos;

    @NotNull
    @JsonProperty("valor_total")
    private Double valorTotal;

    @NotNull
    @JsonProperty("endereco_entrega")
    private String enderecoEntrega;

    public Order toOrder() {
        return Order.builder()
                .codCliente(this.codCliente)
                .codProdutos(this.codProdutos)
                .enderecoEntrega(this.enderecoEntrega)
                .valorTotal(this.valorTotal)
                .build();
    }
}
