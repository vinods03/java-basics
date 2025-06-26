package oops;

import java.sql.*;
import java.util.*;

public class DatabaseDynamicUpdatesDemo {

	public static void main(String[] args) throws Exception {
		
		Class.forName("org.sqlite.JDBC");		
		
		Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
		
		PreparedStatement stm = con.prepareStatement("insert into dept values(?,?)");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dept data: ");
		int dno = sc.nextInt();
		String dname = sc.next();
		
		stm.setInt(1, dno);
		stm.setString(2, dname);
		
		stm.executeUpdate();
		
		stm.close();
		con.close();

	}

}
