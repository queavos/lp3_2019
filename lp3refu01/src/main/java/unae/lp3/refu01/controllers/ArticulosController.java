package unae.lp3.refu01.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import unae.lp3.refu01.model.Articulo;
import unae.lp3.refu01.model.Tipo;
import unae.lp3.refu01.repository.ArticulosRepository;
import unae.lp3.refu01.repository.TiposRepository;

@Controller
@RequestMapping(value="/articulos")
public class ArticulosController {
	@Autowired
	public TiposRepository tiposrepo;
	@Autowired
	public ArticulosRepository artirepo;
	
	@RequestMapping(value="/", method= RequestMethod.GET)
	public String index (Model model) {
		List<Tipo> tipos =tiposrepo.findAll();
		List<Articulo> artilista = artirepo.findAll();
		model.addAttribute("lista", artilista);
		model.addAttribute("tipos", tipos);
		return "articulos/index";
	}
	
	// CREAR REGISTRO
	@RequestMapping(value="/new", method= RequestMethod.GET)
	public String nuevo(@ModelAttribute Articulo articulo, Model model) 
	{ 
		List<Tipo> tipos =tiposrepo.findAll();
		model.addAttribute("tipos", tipos);
		return "articulos/new"; 
	}	
	@RequestMapping(value="/create", method= RequestMethod.POST)
	public String crear(Articulo articulo, Model model) 
	{ 
		artirepo.save(articulo);
		return "redirect:/articulos/"; 
	}	
	//EDITAR REGISTROS
	@RequestMapping(value="/edit/{id}", method= RequestMethod.GET)
	public String editar(@ModelAttribute Articulo articulo, Model model, @PathVariable("id") int id) 
	{ 
		Articulo art= new Articulo();
		List<Tipo> tipos =tiposrepo.findAll();
		Optional<Articulo> t= artirepo.findById(id);
		if (t.isPresent())
		{ 
			art=t.get();
		}
		model.addAttribute("tipos", tipos);
		model.addAttribute("articulo", art);
		return "articulos/edit"; 
	}	
	@RequestMapping(value="/update", method= RequestMethod.POST)
	public String modificar(Articulo articulo, Model model) 
	{ 
		artirepo.save(articulo);
		return "redirect:/articulos/"; 
	}
	
	//BORRAR REGISTROS
	@RequestMapping(value="/delete/{id}", method= RequestMethod.GET)
	public String borrar( @PathVariable("id") int id) 
	{ 
		Optional<Articulo> t= artirepo.findById(id);
		if (t.isPresent())
		{
			artirepo.deleteById(id);
		}
		return "redirect:/articulos/"; 
	}	
	
}
