package com.pedidos.pedidos.dataprovider.repository;

import com.pedidos.pedidos.dataprovider.models.OrderData;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Classe de teste para validar se esta persistindo na base de Dados
 * 
 * @author Marcus Vinicius
 *
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class OrderDataRepositoryTest {

	@Autowired
	private OrderRepository repository;

	@Test
	public void persistePedido() {
		OrderData orderData = mockPedido();

		repository.save(orderData);

		Assertions.assertThat(orderData.getId()).isNotNull();
		Assertions.assertThat(orderData.getCodCliente()).isEqualTo(1L);
		Assertions.assertThat(orderData.getCodProdutos()).isEqualTo(1L);
		Assertions.assertThat(orderData.getEnderecoEntrega()).isEqualTo("teste");
		Assertions.assertThat(orderData.getValorTotal()).isEqualTo(100D);
	}

	private OrderData mockPedido() {
		OrderData p = new OrderData();

		p.setCodCliente(1L);
		p.setCodProdutos(1L);
		p.setEnderecoEntrega("teste");
		p.setValorTotal(100D);

		return p;
	}
}
