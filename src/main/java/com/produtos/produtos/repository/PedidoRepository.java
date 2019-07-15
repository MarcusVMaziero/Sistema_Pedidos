package com.produtos.produtos.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.produtos.produtos.models.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
