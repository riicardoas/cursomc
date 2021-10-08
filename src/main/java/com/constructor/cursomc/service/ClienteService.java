package com.constructor.cursomc.service;

import java.util.Optional;

import com.constructor.cursomc.domain.Cliente;
import com.constructor.cursomc.repositories.ClienteRepository;

import com.constructor.cursomc.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente find(Integer id) { // BUSCA CLIENTE POR ID
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
        "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
        }
}