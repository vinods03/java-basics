package oops;

import java.sql.*;

public class DatabaseUpdatesDemo {

	public static void main(String[] args) throws Exception {
		
		Class.forName("org.sqlite.JDBC");		// creating a driver object. this will work only after you have added the JAR file in the project
		
		Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db"); // use the driver object to create a connection object
		
		Statement stm = con.createStatement();
		
		stm.executeUpdate("insert into dept values(15, 'CIVIL')");
		
		stm.executeUpdate("update dept set dname = 'CHEM' where deptno = 50");
		
		stm.executeUpdate("delete from dept where deptno >= 50");
		
		stm.close();
		
		con.close();

	}

}
