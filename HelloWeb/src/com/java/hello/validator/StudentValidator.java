package com.java.hello.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.java.hello.form.hndler.Student;

public class StudentValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Student.class.isAssignableFrom(clazz);
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("Hi Inside validate");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "required.name", "Name Field is required");
	}
}
