package com.produtos.produtos.dataprovider.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.produtos.dataprovider.models.Pedido;

/**
 * Interface do repositório que herda os dados da JPA para tratativa do BD H2
 * 
 * @author Marcus Vinicius
 *
 */
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
