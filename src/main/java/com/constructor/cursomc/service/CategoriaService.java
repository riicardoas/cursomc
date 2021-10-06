package com.constructor.cursomc.service;

import java.util.Optional;

import com.constructor.cursomc.domain.Categoria;
import com.constructor.cursomc.repositories.CategoriaRepository;

import com.constructor.cursomc.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
        "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
        }
}