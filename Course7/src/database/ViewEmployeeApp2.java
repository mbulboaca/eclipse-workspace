package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;

public class ViewEmployeeApp2 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert your name, address, age, salary:");
		String name = sc.nextLine();
		String address = sc.nextLine();
		int age = sc.nextInt();
		sc = new Scanner(System.in);
		double salary = sc.nextDouble();
		
		insertEmployee(name, address, age, salary);
		System.out.println("Insert OK!");
	}

	private static void insertEmployee(String name, String address, int age, double salary) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbemployee","root","root");
		Statement stmt = con.createStatement();
		
		stmt.executeUpdate("INSERT INTO `employee` (`name`, `age`, `salary`, `address`) VALUES ('" + name + "', "
				+ "'" + age +"', '"+ salary + "', '" + address + "')" );
		
		con.close();
	}
	
	private static void deleteEmployee(int idEmployee) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbemployee","root","root");
		Statement stmt = con.createStatement();
		
		stmt.executeUpdate("delete from employee where idemployee = " + idEmployee + ";");
		con.close();
	}

}
