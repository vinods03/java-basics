package oops;

import java.sql.*;

public class DatabaseDemo {

	public static void main(String[] args) throws Exception {
		
		Class.forName("org.sqlite.JDBC");		// creating a driver object. this will work only after you have added the JAR file in the project
		
		Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db"); // use the driver object to create a connection object
		
		Statement stm = con.createStatement();
		
		ResultSet rs = stm.executeQuery("select * from dept");
		
		int dno;
		String dname;
		
		while (rs.next()) {
			dno = rs.getInt("deptno");
			dname = rs.getString("dname");
			System.out.println(dno + "   " + dname);
		}
		
		stm.close();
		con.close();

	}

}
