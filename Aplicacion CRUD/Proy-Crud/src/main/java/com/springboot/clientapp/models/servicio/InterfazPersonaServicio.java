package com.springboot.clientapp.models.servicio;

import java.util.List;

import com.springboot.clientapp.models.entidad.Cliente;
import com.springboot.clientapp.models.entidad.Persona;
public interface InterfazPersonaServicio {
	
	public List<Persona> listarTodos();
	public void guardar (Persona persona);
	public Persona buscarPorId(Long id);
	public void eliminar(Long id);
}
