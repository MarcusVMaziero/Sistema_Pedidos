package com.produtos.produtos.dataprovider.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Classe do Objeto Pedido vinculado ao BD H2
 * 
 * @author Marcus Vinicius
 *
 */

@Entity
@Data
public class Pedido {
	
	@Id
	@GeneratedValue
	private Long id;
	
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
}
