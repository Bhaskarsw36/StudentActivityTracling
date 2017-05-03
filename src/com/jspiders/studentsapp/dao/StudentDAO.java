package com.jspiders.studentsapp.dao;

public interface StudentDAO 
{
	StudentsInfoBean authenticate(String regno, String password);
	
}//End of StudentDAO interface
