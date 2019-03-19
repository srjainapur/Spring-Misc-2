package com.java.hello.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.hello.form.hndler.Student;

@Controller
public class StudentController {
	
	@Autowired
	@Qualifier("studentValidator")
	private Validator validator;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}
	
	@RequestMapping(value="/student", method=RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student", "command", new Student());
	}
	
	@ModelAttribute("student")
	public Student createStudentModel() {
		return new Student();
	}
	
	@RequestMapping(value="/addStudent", method=RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb") @Validated Student student, BindingResult bindingResult, 
		ModelMap model) {
		
		System.out.println("Has errors " + bindingResult.hasErrors());
		if(bindingResult.hasErrors()) {
			return "student";
		}
		
		model.addAttribute("id", student.getId());
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("userName", student.getUserName());
		model.addAttribute("password", student.getPassword());
		model.addAttribute("address", student.getAddress());
		model.addAttribute("receivePaper", student.isReceivePaper());
		model.addAttribute("frameWorks", student.getFavoriteFrameworks());
		model.addAttribute("gender", student.getGender());
		model.addAttribute("favNumber", student.getFavoriteNumber());
		model.addAttribute("country", student.getCountry());
		model.addAttribute("skills", student.getSkills());
		return "result";
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
	public List<String> getFavoriteNumberList() {
		List<String> numberList = new ArrayList<String>();
		numberList.add("10");
		numberList.add("20");
		numberList.add("30");
		numberList.add("40");
		numberList.add("50");
		return numberList;
	}
	
	@ModelAttribute("countryList")
	public Map<String, String> getCountryList() {
		Map<String, String> countryList = new HashMap<String, String>();
		countryList.put("US", "United States");
		countryList.put("IN", "India");
		countryList.put("UK", "United Kingdom");
		countryList.put("AU", "Austrlia");
		countryList.put("NZ", "New Zeland");
		return countryList;
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
