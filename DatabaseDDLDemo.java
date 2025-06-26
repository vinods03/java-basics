package oops;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseDDLDemo {

	public static void main(String[] args) throws Exception {
		
		Class.forName("org.sqlite.JDBC");		// creating a driver object. this will work only after you have added the JAR file in the project
		
		Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db"); // use the driver object to create a connection object
		
		Statement stm = con.createStatement();
		
//		stm.executeUpdate("create table temp(a integer, b float, c String)");
		
		stm.executeUpdate("drop table temp");
		
		stm.close();
		
		con.close();

	}

}
