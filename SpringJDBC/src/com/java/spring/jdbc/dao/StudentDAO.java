package com.java.spring.jdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import com.java.spring.jdbc.bean.Student;

public interface StudentDAO {

	/**
	 * This is the method to be used to initialize database resources ie.
	 * connection.
	 */
	public void setDataSource(DataSource ds);
	
	/**
	 * This is the method to be used to create a record in the Student table.
	 */
	public void create(int studNo, String firstName, String lastName, int phoneNum);
	
	/**
	 * This is the method to be used to list down a record from the Student
	 * table corresponding to a passed student id.
	 */
	public Student getStudent(int studNo);
	
	/**
	 * This is the method to be used to list down all the records from the
	 * Student table.
	 */
	public List<Student> getStudents();
	
	/**
	 * This is the method to be used to delete a record from the Student table
	 * corresponding to a passed student id.
	 */
	public void delete(int stdNo);

	/**
	 * This is the method to be used to update a record into the Student table.
	 */
	public void update(int stdNo, int phoneNum);
}
