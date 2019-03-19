package com.java.spring.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.spring.bean.User;

@Controller
public class UserController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView user() {
		return new ModelAndView("login", "command", new User());
	}
	
	@RequestMapping(value="/addUser", method=RequestMethod.POST)
	public String addUser(@ModelAttribute("SpringWeb") User user, ModelMap model) {
		model.addAttribute("username", user.getUserName());
		model.addAttribute("password", user.getPassword());
		model.addAttribute("address", user.getAddress());
		model.addAttribute("recievePaper", user.isRecievePaper());
		model.addAttribute("favoriteFrameworks", user.getFavoriteFrameworks());
		model.addAttribute("gender", user.getGender());
		System.out.println("favoriteNumber " + user.getFavoriteNumber());
		model.addAttribute("favoriteNumber", user.getFavoriteNumber());
		model.addAttribute("country", user.getCountry());
		model.addAttribute("skills", user.getSkills());
		return "user";
	}
	
	@ModelAttribute("webFrameworkList")
	public List<String> getWebFrameworkList() {
		List<String> webFrameworkList = new ArrayList<String>();
		webFrameworkList.add("Spring MVC");
		webFrameworkList.add("Struts 1");
		webFrameworkList.add("Struts 2");
		webFrameworkList.add("Apache Wicket");
		return webFrameworkList;
	}
	
	@ModelAttribute("numberList")
	public List<String> getFavourateNumber() {
		List<String> favNumberList = new ArrayList<String>();
		favNumberList.add("10");
		favNumberList.add("20");
		favNumberList.add("30");
		favNumberList.add("40");
		favNumberList.add("50");
		
		return favNumberList;
	}
	
	@ModelAttribute("countryList")
	public Map<String, String> getCountryList() {
		Map<String, String> ctryList = new HashMap<String, String>();
		ctryList.put("IN", "India");
		ctryList.put("US", "America");
		ctryList.put("UK", "England");
		
		return ctryList;
	}
	
	@ModelAttribute("skillsList")
	public Map<String, String> getSkillsList() {
		Map<String, String> skillList = new HashMap<String, String>();
		skillList.put("Hibernate", "Hibernate");
		skillList.put("Spring", "Spring");
		skillList.put("Apache Wicket", "Apache Wicket");
		skillList.put("Struts", "Struts");
		return skillList;
	}
}
