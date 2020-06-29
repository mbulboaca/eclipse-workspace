package examen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class User {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// poti pune throws Exception ca sa nu te doara capu

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examen", "root", "root");

		Scanner s = new Scanner(System.in);

		PreparedStatement stmt = con.prepareStatement("insert into examen.users(name,surname,username,password,adress,phone,email,admin,country) values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
		
		//System.out.println("Introduceti nume!"); ex
		s = new Scanner(System.in);
		stmt.setString(1, s.nextLine());
		//System.out.println("Introduceti surname");ex.2
		s = new Scanner(System.in);
		stmt.setString(2, s.nextLine());
		s = new Scanner(System.in);
		stmt.setString(3, s.nextLine());
		s = new Scanner(System.in);
		stmt.setString(4, s.nextLine());
		s = new Scanner(System.in);
		stmt.setString(5, s.nextLine());
		s = new Scanner(System.in);
		stmt.setString(6, s.nextLine());
		s = new Scanner(System.in);
		stmt.setString(7, s.nextLine());
		s = new Scanner(System.in);
		stmt.setString(8, s.nextLine());
		s = new Scanner(System.in);
		stmt.setString(9, s.nextLine());
		stmt.executeUpdate();

	}
}