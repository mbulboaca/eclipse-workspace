package examen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Recipe {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// poti pune throws Exception ca sa nu te doara capu

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examen", "root", "root");

		Scanner s = new Scanner(System.in);

		PreparedStatement stmt = con.prepareStatement("insert into examen.recipe(recipe_no,compensantion,price,quantity,medicament_id,date) values(?, ?, ?, ?, ?, ?)");
		
		s = new Scanner(System.in);
		stmt.setInt(1, s.nextInt());
		s = new Scanner(System.in);
		stmt.setInt(2, s.nextInt());
		s = new Scanner(System.in);
		stmt.setInt(3, s.nextInt());
		s = new Scanner(System.in);
		stmt.setInt(4, s.nextInt());
		s = new Scanner(System.in);
		stmt.setInt(5, s.nextInt());
		s = new Scanner(System.in);
		stmt.setString(6, s.nextLine());
		
		
		stmt.executeUpdate();

	}
}