package com.yash.jdbcdemo;
/**
 * 
 * Create class car for JDBC and Mysql Connection
 */

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Car
{
	 static   Logger logger=Logger.getAnonymousLogger();
	 static final String QUERY = "SELECT RegNo,OwnerName,Type,Engine FROM car";
		public static void main(String[] args) throws SQLException, ClassNotFoundException 
		{
	        
			
				Class.forName("com.mysql.jdbc.Driver");       //....... Loading Drivers
				Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/yashmysql","root","root");	//connection object		
			    logger.info("Database Connected");
			    Statement st=(Statement) con.createStatement(); //create statement
			   
			    
			    
			    /**
			     * Update Record from car
			     */
			    
			    /*String sql = "update  car " +
	            "set ownerName ='usha' where RegNo in(103,104) ";
	         st.executeUpdate(sql);
	         ResultSet rs = st.executeQuery(QUERY);
	         while(rs.next()) 
			    {
			    	logger.info("RegNo: " + rs.getInt("RegNo"));
			    	logger.info(",Ownername: " + rs.getString("Ownername"));
			    	logger.info(",Type: " + rs.getString("Type"));
			    	logger.info(",Engine: " + rs.getString("Engine"));
			    	
			    }*/
			    
			    /**
			     * Delete Record from car Table
			     */
			    
			    
			    
			    /*String sql = "delete from  car " +
			            "where RegNo =106 ";
			         st.executeUpdate(sql);
			         ResultSet rs = st.executeQuery(QUERY);
			         while(rs.next()) 
					    {
					    	logger.info("RegNo: " + rs.getInt("RegNo"));
					    	logger.info(",Ownername: " + rs.getString("Ownername"));
					    	logger.info(",Type: " + rs.getString("Type"));
					    	logger.info(",Engine: " + rs.getString("Engine"));
					    	
					    }*/
					    
			    
			    
			    /**
			     * join two table car and dealer
			     */
			    /*ResultSet rs = st.executeQuery("SELECT *FROM "+ "car"+ " inner JOIN "+ "Dealer");
			    logger.info("Join created successfully.......................");
			    while(rs.next()) 
			    {
			    	logger.info("RegNo: " + rs.getInt("RegNo"));
			    	logger.info(",Ownername: " + rs.getString("Ownername"));
			    	logger.info(",Type: " + rs.getString("Type"));
			    	logger.info(",Engine: " + rs.getString("Engine"));

			    	logger.info("DealerRegNo: " + rs.getInt("DealerRegNo"));
			    	logger.info(",ShopName: " + rs.getString("ShopName"));
			    	logger.info(",OwnerName: " + rs.getString("OwnerName"));
			    	logger.info(",Product: " + rs.getString("Product"));
			    	
			    	
			    }
			    rs.close();*/
			    
			    
			    /**
			     * select statement for display the all records on console
			     */
			    
			  /*  ResultSet rs = st.executeQuery(QUERY);
			    while(rs.next()) 
			    {
			    	logger.info("RegNo: " + rs.getInt("RegNo"));
			    	logger.info(",Ownername: " + rs.getString("Ownername"));
			    	logger.info(",Type: " + rs.getString("Type"));
			    	logger.info(",Engine: " + rs.getString("Engine"));
			    	
			    }*/
			    
			    
			    
			    
			     /**
			      * crated class car 
			      */
			    
			    /* String sql = "CREATE TABLE Car " +             // create Table car
		                   "(RegNo INTEGER not NULL, " +
		                   " OwnerName VARCHAR(255), " + 
		                   " Type VARCHAR(255), " + 
		                   " Engine VARCHAR(255) , " + 
		                   " PRIMARY KEY ( RegNo ))";
		                    st.executeUpdate(sql); */ 
			 
			
			    /**
			     * insert records into car Table
			     */
			   /* logger.info("insert records into table car");
			    String sql =  "INSERT INTO Car VALUES (102, 'Swati', 'Maruthi', '1996 steel metal part for bodywork')";
			    st.executeUpdate(sql);
			     sql =  "INSERT INTO Car VALUES (103, 'Smita', 'Hundai', '1997 automaker car fetures')";
			     st.executeUpdate(sql);
			     sql =  "INSERT INTO Car VALUES (104, 'Swapnali', 'Maruthi', '1998 rebotic car fetures')";
			     st.executeUpdate(sql);
			     sql =  "INSERT INTO Car VALUES (105, 'Anvit', 'Hundai', '1999 Electronic  car fetures')";
			     st.executeUpdate(sql);
			     sql =  "INSERT INTO Car VALUES (106, 'Nikita', 'Hundai', '2000 CNG car fetures')";
			     st.executeUpdate(sql);
			    logger.info("record inserted");*/
			    
			   

			
			
		}

	}


