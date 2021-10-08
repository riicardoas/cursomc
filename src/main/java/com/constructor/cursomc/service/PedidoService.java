package com.constructor.cursomc.service;

import java.util.Optional;

import com.constructor.cursomc.domain.Pedido;
import com.constructor.cursomc.repositories.PedidoRepository;

import com.constructor.cursomc.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido find(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
        "Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
        }
}