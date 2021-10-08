package com.constructor.cursomc.repositories;

import com.constructor.cursomc.domain.itemPedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<itemPedido, Integer> {

}