package com.pedidos.pedidos.dataprovider.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
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
}
