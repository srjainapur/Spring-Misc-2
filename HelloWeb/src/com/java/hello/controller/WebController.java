package com.java.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index() {
		System.out.println("Inside Index :");
		return "index";
	}
	
	@RequestMapping(value="/redirect", method=RequestMethod.GET)
	public String redirect() {
		System.out.println("Inside redirect: redirecting to finalPage");
		return "redirect:finalPage";
	}
	
	@RequestMapping(value="/finalPage", method=RequestMethod.GET)
	public String finalPage() {
		System.out.println("Inside finalPage");
		return "final";
	}
}
