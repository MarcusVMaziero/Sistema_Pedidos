package com.produtos.produtos.dataprovider.repository;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.produtos.produtos.dataprovider.models.Pedido;

/**
 * Classe de teste para validar se esta persistindo na base de Dados
 * 
 * @author Marcus Vinicius
 *
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class PedidoRepositoryTest {

	@Autowired
	private PedidoRepository repository;

	@Test
	public void persistePedido() {
		Pedido pedido = mockPedido();

		repository.save(pedido);

		Assertions.assertThat(pedido.getId()).isNotNull();
		Assertions.assertThat(pedido.getCodCliente()).isEqualTo(1L);
		Assertions.assertThat(pedido.getCodProdutos()).isEqualTo(1L);
		Assertions.assertThat(pedido.getEnderecoEntrega()).isEqualTo("teste");
		Assertions.assertThat(pedido.getValorTotal()).isEqualTo(100D);
	}

	private Pedido mockPedido() {
		Pedido p = new Pedido();

		p.setCodCliente(1L);
		p.setCodProdutos(1L);
		p.setEnderecoEntrega("teste");
		p.setValorTotal(100D);

		return p;
	}
}
