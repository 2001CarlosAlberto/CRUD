package com.springboot.clientapp.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PControlador {

	@GetMapping("/index")
	public String index() {
		return "home";
	}
}
