package prepareStatement;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
 * Demo for the preparstatment and betch insertion.
 * @author usha.more
 *
 */

public class Batch 
{
	static Logger logger=Logger.getAnonymousLogger();
      public static void main(String[] args) throws ClassNotFoundException, SQLException
      {
    	  Class.forName("com.mysql.jdbc.Driver");       //....... Loading Drivers
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/yashmysql","root","root");	//connection object		
		    logger.info("Database Connected");
		    String sql="insert into personinfo(pid,pname,phoneNumber,address) values(?,?,?,?)";
		    
		    PreparedStatement ps=( PreparedStatement) con.prepareStatement(sql);
		    ps.setInt(1, 101);
		    ps.setString(2, "usha");
		    ps.setString(3, "8830718391");
		    ps.setString(4, "pune");
		   // ps.execute();  no need to excute because of addBatch()
		    ps.addBatch();
		    
		    ps.setInt(1, 102);
		    ps.setString(2, "swati");
		    ps.setString(3, "8130718393");
		    ps.setString(4, "mumbai");
		    ps.addBatch();
		    
		    ps.setInt(1, 103);
		    ps.setString(2, "Swapnali");
		    ps.setString(3, "8230718394");
		    ps.setString(4, "solapur");
		    ps.addBatch();
		    
		    ps.setInt(1, 105);
		    ps.setString(2, "smita");
		    ps.setString(3, "8330718395");
		    ps.setString(4, "mumbai");
		    ps.addBatch();
		    
		    ps.setInt(1, 106);
		    ps.setString(2, "Anvit");
		    ps.setString(3, "8430718396");
		    ps.setString(4, "pune");
		    ps.addBatch();
		    
		    ps.executeBatch();
		    
		    
		    logger.info("add data into personinfo table");
      }
	
	
}
