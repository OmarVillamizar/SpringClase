package com.example.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.servicios.DocenteServicio;

public class DocenteController {
	DocenteServicio dc = new DocenteServicio();
	@GetMapping({"/status"})
	public String pruebaServicio(){
	return "Ok";
	}	
	
	@GetMapping
	public String listarDocentes() {
		return "Ok GET";
	}
	
	@GetMapping({"/{documento}"})
	public String getDocente(@PathVariable String documento) {
		String result = dc.consultarDocente(documento);
		return "OK GET" + documento;
	}
	
	@PostMapping
	public String crearDocente() {
		return "OK Post";
	}
}
