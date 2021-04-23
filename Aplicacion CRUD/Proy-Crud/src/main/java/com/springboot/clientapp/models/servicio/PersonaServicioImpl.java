package com.springboot.clientapp.models.servicio;
import java.util.List;

import org.springboot.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.clientapp.models.entidad.Persona;
import com.springboot.clientapp.models.repositorio.PersonaRepositorio;
import com.springboot.clientapp.models.repositorio.PersonaRepository;

public class PersonaServicioImpl implements InterfazPersonaServicio {

	@Autowired
	private PersonaRepositorio personaRep;
	
	@Override
	public List<Persona> listarTodos() {
		
		return (List<Persona>) personaRep.FindAll();
	}
	
	@Override
	public void guardar(Persona persona) {
		personaRep.save(persona);
	}
	
	@Override
	public Persona buscarPorId(Long id) {
		
		return personaRep.findById(id).orElse();
	}
	
	@Override
	public void eliminar(Long id) {
		personaRep.deleteById(id);
	}

}
