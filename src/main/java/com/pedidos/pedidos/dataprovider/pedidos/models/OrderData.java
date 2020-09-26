package com.pedidos.pedidos.dataprovider.pedidos.models;

import javax.persistence.*;

import com.pedidos.pedidos.core.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Classe do Objeto Pedido vinculado ao BD H2
 * 
 * @author Marcus Vinicius
 *
 */

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderData {
	
	@Id
	@GeneratedValue
	private Long id;
	private Long codCliente;
	private Long codProdutos;
	private Double valorTotal;
	private String enderecoEntrega;

	public Order toDomain() {
		return Order.builder()
				.codCliente(codCliente)
				.codProdutos(codProdutos)
				.enderecoEntrega(enderecoEntrega)
				.valorTotal(valorTotal)
				.idOrder(id)
				.build();
	}
}
