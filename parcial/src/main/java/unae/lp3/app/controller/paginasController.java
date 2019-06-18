package unae.lp3.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class paginasController {
	@RequestMapping (value="/index", method=RequestMethod.GET)
	public String pagina1(Model modelo) {	
		modelo.addAttribute("titulo","HOME" );
		modelo.addAttribute("contenido","HOLA SOY HOME" );
		return "home";
	}
	
	@RequestMapping (value="/empresa", method=RequestMethod.GET)
	public String pagina2(Model modelo) {	
		modelo.addAttribute("titulo","EMPRESA" );
		modelo.addAttribute("contenido","HOLA SOY EMPRESA" );
		return "home";
	}
	
}
