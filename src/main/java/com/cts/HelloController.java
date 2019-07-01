package com.cts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView mymethod(){
		
	String.format("%< is equals to %d", 2); //Noncompliant; the argument index '<' refers to the previous format specifier but there isn't one 
 

		return new ModelAndView("hellopage","msg","Hello First Spring");
	}
}
