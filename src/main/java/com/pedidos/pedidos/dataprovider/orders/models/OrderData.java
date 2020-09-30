package com.pedidos.pedidos.dataprovider.orders.models;

import javax.persistence.*;

import com.pedidos.pedidos.core.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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
	private Long codeCustomer;
	@ElementCollection(targetClass=Long.class)
	private List<Long> codeProducts;
	private Double totalAmount;
	private String deliveryAddress;

	public Order toDomain() {
		return Order.builder()
				.codeCustomer(codeCustomer)
				.codeProducts(codeProducts)
				.deliveryAddress(deliveryAddress)
				.totalAmount(totalAmount)
				.idOrder(id)
				.build();
	}
}
