package com.dani.portada.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Demo {
	@GetMapping("/Demo/Portada")
	public String Portada() {
		return "portada";
	}  
}
