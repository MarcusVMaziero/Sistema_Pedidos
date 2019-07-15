package com.produtos.produtos.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@JsonProperty("codigo_cliente")
	private Long codCliente;
	
	@JsonProperty("codigo_produtos")
	private Long codProdutos;
	
	@JsonProperty("valor_total")
	private Double valorTotal;
	
	@JsonProperty("endereco_entrega")
	private String enderecoEntrega;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(Long codCliente) {
		this.codCliente = codCliente;
	}

	public Long getCodProdutos() {
		return codProdutos;
	}

	public void setCodProdutos(Long codProdutos) {
		this.codProdutos = codProdutos;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	
	

}
