package examen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class diagnosis {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// poti pune throws Exception ca sa nu te doara capu

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examen", "root", "root");

		Scanner s = new Scanner(System.in);

		PreparedStatement stmt = con.prepareStatement("insert into examen.diagnosis(name,description) values(?, ?)");
		
		s = new Scanner(System.in);
		stmt.setString(1, s.nextLine());
		s = new Scanner(System.in);
		stmt.setString(2, s.nextLine());
		;
		stmt.executeUpdate();

	}
}