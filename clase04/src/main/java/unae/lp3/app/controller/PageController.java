package unae.lp3.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	@RequestMapping(value="/paginas")
	public String  goIndex()
	{
		return "pages/index";		
	}
	@RequestMapping(value="/saludo/{nombre}")
	public String  goSaludo(@PathVariable("nombre") String nombre, Model modelo )
	{
		//System.out.println(nombre);
		modelo.addAttribute("name",nombre);
		return "pages/saludo";		
	}
}
