package com.produtos.produtos.dataprovider.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.produtos.dataprovider.models.OrderData;

/**
 * Interface do repositório que herda os dados da JPA para tratativa do BD H2
 * 
 * @author Marcus Vinicius
 *
 */
public interface OrderRepository extends JpaRepository<OrderData, Long> {

}