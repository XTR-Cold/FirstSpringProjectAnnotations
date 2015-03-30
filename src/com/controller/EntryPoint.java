package com.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class EntryPoint {
	
	@RequestMapping("/welcome.jsp")
	public ModelAndView helloWorld() {
		
		ModelAndView mv = new ModelAndView("ApplicationEntryPoint.jsp");
		mv.addObject("entryPointMessage","This is the main entrance to the application");
		return mv;
		
	}

	
	
}
