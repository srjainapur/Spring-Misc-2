package com.java.spring.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.java.spring.bean.Student;

public class StudentValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return Student.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("Inside Validate");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "required.name", "Field name is required.");
	}
}
