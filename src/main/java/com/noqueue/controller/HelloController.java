package com.noqueue.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	private static final Logger logger = Logger.getLogger(HelloController.class);

	@RequestMapping("/hello")
	public ModelAndView mymethod() {
		logger.debug("Checking the first Log::");
		return new ModelAndView("hellopage", "msg", "Hello First Spring PHD");
	}
}
