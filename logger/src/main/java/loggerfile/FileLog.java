package loggerfile;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class FileLog 
{
   static  Logger logger=Logger.getLogger(FileLog.class);
    
   public void add()
   {
	   try
	   {
		   int a=10,b=20;
		   int c=a+b;
		   logger.info("Addition:"+c);
		   
	   }
	   catch(Exception e)
	   {
		   logger.info(e);
	   }
   }
   
   public void div()
   {
	   try
	   {
		   int a=10,b=20;
		   int d=a/0;
		   logger.info("Divion:"+d);
		   
	   }
	   catch(Exception e)
	   {
		   logger.info(e);
	   }
   }
   
   
   
   public static void main(String[] args)
    {
    	PropertyConfigurator.configure("log.properties");
    	logger.info("This is the log File");
    	System.out.println("Logger Excuted");
    	logger.warn("This is waring msg");
    	logger.error("This is error msg");
    	logger.debug("debug msg");
    	logger.fatal("fatal messge");
    	FileLog f=new FileLog();
    	f.add();
    	f.div();
    	
    }
}
