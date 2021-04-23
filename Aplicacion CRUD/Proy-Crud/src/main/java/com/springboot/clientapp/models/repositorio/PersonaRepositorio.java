package com.springboot.clientapp.models.repositorio;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.springboot.clientapp.models.entidad.Persona;

@Repository
public interface PersonaRepositorio extends CrudRepository<Persona, Long>{

}
