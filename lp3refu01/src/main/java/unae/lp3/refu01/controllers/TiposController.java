package unae.lp3.refu01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/tipos")
public class TiposController {
	
	@RequestMapping(value="/index", method= RequestMethod.GET)
	public String index () { 
		return "";
	}
	
}
