package com.pedidos.pedidos.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pedidos.pedidos.core.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderHttp {

    private Long idOrder;

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
