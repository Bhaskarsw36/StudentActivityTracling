package com.jspiders.studentsapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class StudentDAOHibernateImpl implements StudentDAO
{

	public StudentsInfoBean authenticate(String regno, String password)
	{
		/*
		 * Hibernate way of Interacting with DB
		 */
		return null;
		
	}//End of authenticate
}//End of Class
