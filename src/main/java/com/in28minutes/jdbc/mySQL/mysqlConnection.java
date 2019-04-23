package com.in28minutes.jdbc.mySQL;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


public class mysqlConnection{

	private String URL = "jdbc:mysql://localhost:3306/todoDbTest";
	private String USER = "rick";
	private String DRIVER = "com.mysql.jdbc.Driver";
	private String PASSWORD = "12Shyamali23@#$";


	public DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl(URL);
		System.out.println(driverManagerDataSource.getUrl());
		driverManagerDataSource.setUsername(USER);
		driverManagerDataSource.setPassword(PASSWORD);
		driverManagerDataSource.setDriverClassName(DRIVER);
		return driverManagerDataSource;
	}
}



