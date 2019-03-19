package com.java.spring.controller;

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

import com.java.spring.bean.Student;

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
	
	@RequestMapping(value="/validateStd", method=RequestMethod.GET)
	public ModelAndView validateStd() {
		return new ModelAndView("validateStudent", "command", new Student());
	}
	
	@RequestMapping(value="/addStudent", method=RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb") Student student, ModelMap model) {
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getStdNo());

		return "result";
	}
	
	@ModelAttribute("student")
	public Student createStudentModel() {
		return new Student();
	}
	
	@RequestMapping(value="/validateStudent", method=RequestMethod.POST)
	public String validateStudent(@ModelAttribute("SpringWeb") @Validated Student student, BindingResult bindingRes,
			ModelMap model) {
		System.out.println("Has Error ? " + bindingRes.hasErrors());
		if(bindingRes.hasErrors()){
			model.addAttribute("command", new Student());
			return "validateStudent";
		}
		
		model.addAttribute("name", student.getName());
		model.addAttribute("age", student.getAge());
		model.addAttribute("id", student.getStdNo());
		model.addAttribute("student", new Student());
		return "result";
	}
}
