package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewEmployeeApp {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbemployee", "root","root");
		
		Statement stmt = con.createStatement();
		ResultSet rs =  stmt.executeQuery("select * from employee"); 
		
		
		
		while(rs.next()) {
			String name = rs.getString("name"); 
			int age = rs.getInt("age"); 
			double salary = rs.getDouble("salary");
			System.out.println(name + " age: " + age + " salary: " + salary);
		}
	}

}
