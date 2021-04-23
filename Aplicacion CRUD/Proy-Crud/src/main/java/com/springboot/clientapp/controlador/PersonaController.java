package com.springboot.clientapp.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.clientapp.models.entidad.Domicilio;
import com.springboot.clientapp.models.entidad.Persona;
import com.springboot.clientapp.models.servicio.IDomicilioService;
import com.springboot.clientapp.models.servicio.IPersonaService;
import com.springboot.clientapp.models.servicio.InterfazDomicilioServicio;
import com.springboot.clientapp.models.servicio.InterfazPersonaServicio;

@Controller
@RequestMapping("/views/personas")
public class PersonaController {
	
	@Autowired
	private InterfazPersonaServicio personaServicio;
	
	@Autowired
	private InterfazDomicilioServicio domicilioServicio;
	
	@GetMapping("/")
	public String listarPersonas(Model model) {
		
		List<Persona> listadoPersonas = personaServicio.listarTodos();
		
		model.addAttribute("titulo", "Lista de personas");
		model.addAttribute("personas", listadoPersonas);
		return "/views/personas/listar";
	}
	
	@GetMapping("/create")
	public String crear(Model model) {
		
		Persona persona = new Persona();
		
		List<Domicilio> listDomicilio =  domicilioServicio.listaDomicilio();
		
		model.addAttribute("titulo", "Formulario: nueva persona");	
		model.addAttribute("persona", persona);
		model.addAttribute("domicilio", listDomicilio);
		return "/views/personas/frmCrear";
	}
	
	@PostMapping("/save")
	public String guardar(@ModelAttribute Persona persona ) {
		
		personaServicio.guardar(persona);
		System.out.print("Cliente guardado exitosamente");
		return "redirect:/views/personas/";
	}
	
	@GetMapping("/edit/{id}")
	public String editar(@PathVariable("dni") Long dni, Model model) {
		
		Persona persona = new personaServicio.buscarPorId(dni);
		
		List<Domicilio> listDomicilio =  domicilioServicio.listaDomicilio();
		
		model.addAttribute("titulo", "Formulario: editar persona");	
		model.addAttribute("persona", persona);
		model.addAttribute("domicilio", listDomicilio);
		return "/views/personas/frmCrear";
	}
	
	@GetMapping("/delete/{id}")
	public String eliminar(@PathVariable("DNI") Long dni) {
		
		personaServicio.eliminar(dni);
		
		System.out.println("Registro eliminado exitosamente");
		return "redirect:/views/personas/";
	}
}
