package com.jspiders.studentsapp.dao;

public class StudentDAOFactory 
{
	//Private Constructor
	private StudentDAOFactory(){}
	
	private static String dbInteractionLogic = "jdbc";
	
	public static StudentDAO getDAOInstance()
	{
		StudentDAO ref = null;
		
		if(dbInteractionLogic.equals("jdbc")){
			ref = new StudentDAOJDBCImpl();
		}else if(dbInteractionLogic.equals("hibernate")){
			ref = new StudentDAOHibernateImpl();
		}else if(dbInteractionLogic.equals("springjdbc")){
			ref = new StudentDAOHibernateImpl();
		}
		
		return ref;
		
	}//End of getDAOInstance
	
}//End of Class
