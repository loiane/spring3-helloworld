package com.loiane.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Hello World Controller
 * An Example of Spring MVC 3.0 with annotations
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)	
 * http://loiane.com (Portuguese - BR)
 */
@Controller
public class HelloWorldController{
	
	protected final Log logger = LogFactory.getLog(getClass());

	@RequestMapping("/index")
	public ModelAndView helloWorld(){
		
		logger.info("Return View");
		
		return new ModelAndView("index.jsp");
	}
}
