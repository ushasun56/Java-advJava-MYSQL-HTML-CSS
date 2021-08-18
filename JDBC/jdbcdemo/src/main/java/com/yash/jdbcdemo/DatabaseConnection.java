package com.yash.jdbcdemo;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 * JDBC Connection with mysql 
 * @author usha.more
 *
 */
public class DatabaseConnection {

	 static   Logger logger=Logger.getAnonymousLogger();
	public static void main(String[] args) throws SQLException 
	{
        
		try {
			Class.forName("com.mysql.jdbc.Driver");       //....... Loading Drivers
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/yashmysql","root","root");	//connection object		
		    logger.info("Database Connected");
		    Statement st=(Statement) con.createStatement(); //create statement
		    ResultSet rs=st.executeQuery("select * from employee"); //create resultset object
		    while(rs.next()) 
		    {
		    	logger.info("employee data is"+rs.getString(1)+""+rs.getString(2)+""+rs.getString(3)+""+rs.getString(4));
		    }
		
		    con.close();
		    st.close();
		    rs.close();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
