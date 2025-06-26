package oops;


import java.sql.*;
import java.util.*;

public class DatabaseDynamicDemo {

	public static void main(String[] args) throws Exception {
		
		Class.forName("org.sqlite.JDBC");		
		
		Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
		
		PreparedStatement stm = con.prepareStatement("select * from dept where deptno = ?");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dept number: ");
		int dno = sc.nextInt();
		
		stm.setInt(1, dno);
		
		ResultSet rs = stm.executeQuery();
		
		int fetchedDno;
		String fetchedDname;
		
		while (rs.next()) {
			fetchedDno = rs.getInt("deptno");
			fetchedDname = rs.getString("dname");
			System.out.println(fetchedDno + "   " + fetchedDname);
		}
		
		stm.close();
		con.close();

	}

}
