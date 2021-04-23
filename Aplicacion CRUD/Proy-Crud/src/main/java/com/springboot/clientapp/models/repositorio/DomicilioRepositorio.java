package com.springboot.clientapp.models.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.springboot.clientapp.models.entidad.Domicilio;

public interface DomicilioRepositorio extends CrudRepository<Domicilio, Long> {

}
