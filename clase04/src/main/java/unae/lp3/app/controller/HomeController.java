package unae.lp3.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HomeController {
	@RequestMapping(value="/home", method=RequestMethod.GET ) 
	public String goHome() 
	{
	return "home/home";	
	}
	@RequestMapping (value="/inicio", method=RequestMethod.GET ) 
	public String goIndex() {
		
		return "home/index";
	}
}
