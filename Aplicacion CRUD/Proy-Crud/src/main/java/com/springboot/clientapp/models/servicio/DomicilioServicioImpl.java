package com.springboot.clientapp.models.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.clientapp.models.entidad.Domicilio;
import com.springboot.clientapp.models.repositorio.DomicilioRepositorio;

@Service
public class DomicilioServicioImpl implements InterfazDomicilioServicio {
	
	@Autowired
	private DomicilioRepositorio domicilioRepositorio;
	
	@Override
	public List<Domicilio> listaDomicilio() {
		// TODO Auto-generated method stub
		return (List<Domicilio>) domicilioRepositorio).findAll();
	}

}
