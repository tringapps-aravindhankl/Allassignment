package assignment.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Logger;

public class Database {
	String url;
	String username;
	String password;
	Connection con;
	Logger log=Logger.getLogger("hi");
	static Database firstobject=null;
	
	private Database(String url,String username,String password) {
		this.url=url;
		this.username=username;
		this.password=password;
	}
	
	public static Database s1(String url,String username,String password){
		if(firstobject==null) {
		firstobject=new Database(url,username,password);
		}
		return firstobject;
	}
	public void connect() 
	{
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");  //forName file loader
		con=DriverManager.getConnection(url,username,password);
		log.info("Connection Successfully");
		}
		catch(Exception e){
			log.info("error");
		}
	}
	public void close() {
		try {
		con.close();
		log.info("Connection Closed");
		}
		catch(Exception e){
			log.info("error");
		}
	}
	public void exit() {
		log.info("Exit");
	}
}
