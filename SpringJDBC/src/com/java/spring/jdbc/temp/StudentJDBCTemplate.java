package com.java.spring.jdbc.temp;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.java.spring.jdbc.bean.Student;
import com.java.spring.jdbc.dao.StudentDAO;
import com.java.spring.jdbc.dao.StudentMapper;

public class StudentJDBCTemplate implements StudentDAO{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * 
	 */
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	/**
	 * 
	 */
	public void create(int studNo, String firstName, String lastName, int phoneNum) {
		String insertSQL = "INSERT INTO STUDENT(STUD_NO, FIRST_NAME, LAST_NAME, PHONE_NUM) VALUES(?, ?, ?, ?)";
		jdbcTemplate.update(insertSQL, studNo, firstName, lastName, phoneNum);
		System.out.println("Created Record Name = " + firstName + " Student No = " + studNo);
	    return;
	}

	public Student getStudent(int studNo) {
		String selectSQL = "SELECT * FROM STUDENT WHERE STUD_NO = ?";
		Student student = jdbcTemplate.queryForObject(selectSQL, new Object[]{studNo}, new StudentMapper());
		return student;
	}

	public List<Student> getStudents() {
		String selectSQL = "SELECT * FROM STUDENT";
		List<Student> studentList = jdbcTemplate.query(selectSQL, new StudentMapper());
		return studentList;
	}

	public void delete(int stdNo) {
		String deleteSQL = "DELETE FROM STUDENT WHERE STUD_NO = ?";
		int status = jdbcTemplate.update(deleteSQL, stdNo);	
		System.out.println("Deleted successfully Status " + status);
	}

	@Override
	public void update(int stdNo, int phoneNum) {
		String updateSQL = "UPDATE STUDENT SET PHONE_NUM=? WHERE STUD_NO = ?";
		int status = jdbcTemplate.update(updateSQL, phoneNum, stdNo);
		System.out.println(" Student :" + stdNo + " Phone number is updated");
	}
}
