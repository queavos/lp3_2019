package unae.lp3.refu01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value="/", method=RequestMethod.GET )
	private String homeIndex (Model model) {
		
		model.addAttribute("title", "Pagina Home");
		model.addAttribute("content", "Pagina Contenido Home");
		return "home";
	}
	@RequestMapping(value="/otro", method=RequestMethod.GET )
	private String homeOtro (Model model) {
		
		model.addAttribute("title", "Pagina HoOtrome");
		model.addAttribute("content", "Pagina Contenido HoOtrome");
		return "home";
	}
}
