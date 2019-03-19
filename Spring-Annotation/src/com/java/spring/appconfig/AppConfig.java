package com.java.spring.appconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.java.spring.driver.DataBaseDriver;
import com.java.spring.driver.MySqlDriver;
import com.java.spring.driver.OracleDriver;

@Configuration
@ComponentScan("com.java.spring")
@PropertySource("file:resources/oracledatabase.properties")
public class AppConfig {
	
	@Autowired
	Environment env;
	
	@Bean
	DataBaseDriver oracleDriver() {
		OracleDriver oraDriver = new OracleDriver();
		oraDriver.setDriver(env.getProperty("db.driver"));
		oraDriver.setUrl(env.getProperty("db.url"));
		oraDriver.setPort(Integer.parseInt(env.getProperty("db.port")));
		oraDriver.setUser(env.getProperty("db.user"));
		oraDriver.setPassword(env.getProperty("db.password"));		
		return oraDriver;
	}
	
	@Bean
	DataBaseDriver mySqlDriver() {
		return new MySqlDriver();
	}
}
