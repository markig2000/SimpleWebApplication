package com.cts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView mymethod(){
		 System.out.println(String.format("The value of my integer is %d", "Hello World"));  // Noncompliant; an 'int' is expected rather than a String)
		return new ModelAndView("hellopage","msg","Hello First Spring");
	}
}
