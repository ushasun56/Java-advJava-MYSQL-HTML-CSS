package com.yash.jdbcdemo;
/**
 * 
 * Create Class Dealer fro JDBC and mysql Creation
 */

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Dealer 
{
	 static   Logger logger=Logger.getAnonymousLogger();
	 static final String QUERY = "SELECT DealerRegNo, ShopName, OwnerName, Product FROM Dealer";
		public static void main(String[] args) throws SQLException 
		{
	        
			try {
				Class.forName("com.mysql.jdbc.Driver");       //....... Loading Drivers
				Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/yashmysql","root","root");	//connection object		
			    logger.info("Database Connected");
			    Statement st=(Statement) con.createStatement(); //create statement
			     
			    
			    ResultSet rs = st.executeQuery(QUERY);
			    while(rs.next()) 
			    {
			    	logger.info("DealerRegNo: " + rs.getInt("DealerRegNo"));
			    	logger.info(",ShopName: " + rs.getString("ShopName"));
			    	logger.info(",OwnerName: " + rs.getString("OwnerName"));
			    	logger.info(",Product: " + rs.getString("Product"));

			    	logger.info("RegNo: " + rs.getInt("RegNo"));
			    	logger.info(",Ownername: " + rs.getString("Ownername"));
			    	logger.info(",Type: " + rs.getString("Type"));
			    	logger.info(",Engine: " + rs.getString("Engine"));
			    }
			    /**
			      * Create Table Dealer with foreign key reference table car 
			      */
			    
			    /* String sql = "CREATE TABLE Dealer " +            
		                   "(DealerRegNo INTEGER not NULL, " +
		                   " ShopName VARCHAR(255), " + 
		                   " OwnerName VARCHAR(255), " + 
		                   " product varchar(210), " + 
		                    " FOREIGN KEY ( DealerRegNo )"+
			               "   REFERENCES Car ( RegNo ))";  
			    logger.info(" Delear class created");
			    st.executeUpdate(sql); */
			    
			    /**
			     * Inserted Value into Table Dealer
			     */
			    
			   /* logger.info("insert records into table Dealer");
			    String sql =  "INSERT INTO dealer VALUES (101, 'star maruthi', 'smita', '1  car  car have well manufutures')";
			    st.executeUpdate(sql);
			    sql =  "INSERT INTO dealer VALUES (102, 'super Hundai', 'Swapnali', '2 car automatic car')";
			     st.executeUpdate(sql);
			     sql =  "INSERT INTO dealer VALUES (103, 'royel maruthi', 'Soham', '3 car cng car maker')";
			     st.executeUpdate(sql);
			     sql =  "INSERT INTO dealer VALUES (104, 'royel Hundai', 'Anvit', '4  car Electronic  car fetures')";
			     st.executeUpdate(sql);
			     sql =  "INSERT INTO dealer VALUES (105, 'super Hundai', 'nikita', '5 car CNG car fetures')";
			     st.executeUpdate(sql);
			    logger.info("inserted records");*/
                
			
			} 
			
			
			catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			
		}

	}



		

		
