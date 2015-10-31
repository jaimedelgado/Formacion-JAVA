package com.jdlsoft.springmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jdlsoft.springmvc.model.Cliente;
import com.jdlsoft.springmvc.services.IClienteDAO;

@Controller
public class SpringController {
	@Autowired
	private IClienteDAO clienteDAO; //Spring ya se encarga de inyectar la dependencia (implementacion)
	
	@RequestMapping("/hola")
	public ModelAndView helloWorld(){
		Cliente cliente = new Cliente();
		cliente.setId(250);
		cliente.setNombre("Pep�n");
		cliente.setApellido1("G�lvez");
		cliente.setApellido2("Ridruejo");
		
		ModelAndView mv = new ModelAndView("pagina1", "cliente", cliente);
		mv.addObject("dni", "65165145K");
		
		return mv;
	}
	@RequestMapping("/hola2")
	public ModelAndView demoParametros(
			@RequestParam(value = "name", defaultValue = "Guest") String name,
			@RequestParam(value = "nhijos", required = false) Integer numeroHijos){
		System.out.println("El nombre es: " + name + " y tiene " + numeroHijos + " hijos");
		ModelAndView mv = new ModelAndView("pagina2");
		return mv;
	}
	@RequestMapping("/hola3")
	public String otroMas(){
		return "pagina3";
	}
	@RequestMapping("/hola4")
	@ResponseBody
	public String otroMas2(){
		return "En un lugar de la mancha..";
	}
	
	@RequestMapping("/hola5")
	@ResponseBody
	public String otroMas3(){
		return "<p>Esto parece <b> que funciona </b></p>";
	}
	@RequestMapping("/hola10")
	@ResponseBody
	public String metodo10(
			@RequestParam(value = "parametro1") String name,
			@RequestParam(value = "parametro2") String apellido1,
			@RequestParam(value = "parametro3") String apellido2,
			@RequestParam(value = "parametro4") String ciudad){
		
		return name + " " + apellido1 + " " + apellido2 + " " + ciudad;
		
	}
	@RequestMapping("cliente")
	public ModelAndView getCliente(){
		Cliente cliente = clienteDAO.getClienteById(675);
		ModelAndView mv = new ModelAndView("cliente", "cliente", cliente);
		return mv;
	}
}
