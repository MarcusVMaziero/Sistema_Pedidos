package com.pedidos.pedidos.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pedidos.pedidos.core.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderHttp {

    @JsonProperty("id_pedido")
    private Long idOrder;

    @NotNull
    @JsonProperty("codigo_cliente")
    private Long codeCustomer;

    @NotNull
    @JsonProperty("codigo_produtos")
    private List<Long> codeProducts;

    @NotNull
    @JsonProperty("valor_total")
    private Double totalAmount;

    @NotNull
    @JsonProperty("endereco_entrega")
    private String deliveryAddress;

    public Order toOrder() {
        return Order.builder()
                .idOrder(idOrder)
                .codeCustomer(codeCustomer)
                .codeProducts(codeProducts)
                .deliveryAddress(deliveryAddress)
                .totalAmount(totalAmount)
                .build();
    }
}
