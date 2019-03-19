package com.java.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.java.spring.jdbc.bean.Student;

public class StudentMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet studRS, int studNo) throws SQLException {
		Student student = new Student();
		student.setStudNo(studRS.getInt("STUD_NO"));
		student.setFirstName(studRS.getString("FIRST_NAME"));
		student.setLastName(studRS.getString("LAST_NAME"));
		student.setPhoneNum(studRS.getInt("PHONE_NUM"));
		return student;
	}	
}
