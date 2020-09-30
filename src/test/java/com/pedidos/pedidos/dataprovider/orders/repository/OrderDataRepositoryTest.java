package com.pedidos.pedidos.dataprovider.orders.repository;

import com.pedidos.pedidos.dataprovider.orders.models.OrderData;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

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
		Assertions.assertThat(orderData.getCodeCustomer()).isEqualTo(1L);
		Assertions.assertThat(orderData.getCodeProducts()).isEqualTo(1L);
		Assertions.assertThat(orderData.getDeliveryAddress()).isEqualTo("teste");
		Assertions.assertThat(orderData.getTotalAmount()).isEqualTo(100D);
	}

	private OrderData mockPedido() {
		OrderData p = new OrderData();

		List<Long> products = new ArrayList<Long>();
		products.add(1L);
		p.setCodeCustomer(1L);
		p.setCodeProducts(products);
		p.setDeliveryAddress("teste");
		p.setTotalAmount(100D);

		return p;
	}
}
