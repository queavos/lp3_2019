package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.repo.IClienteRepo;

@Controller

public class HomeController {
	@Autowired
	private IClienteRepo rp_cli;
	@GetMapping("/")
	public String homeIndex() 
	{
		return "home";
	}
	@RequestMapping (value="/index", method=RequestMethod.GET)
	public String pagina1(Model modelo) {	
		modelo.addAttribute("titulo","HOME" );
		modelo.addAttribute("contenido","HOLA SOY HOME" );
		return "pages/home";
	}
	
	@RequestMapping (value="/empresa", method=RequestMethod.GET)
	public String pagina2(Model modelo) {	
		modelo.addAttribute("titulo","EMPRESA" );
		modelo.addAttribute("contenido","HOLA SOY EMPRESA" );
		return "pages/home";
	}
	
}
