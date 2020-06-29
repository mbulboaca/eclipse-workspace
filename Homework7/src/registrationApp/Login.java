package registrationApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dblogin", "root", "root");

		System.out.println("Enter one of the following commands:");
		System.out.println("1 - Register");
		System.out.println("2 - See the registrated users");
		System.out.println("3 - Exit");
		Scanner scanchoice = new Scanner(System.in);
		
		int choiceentry =0;
		while (choiceentry != 3) {
				System.out.println("Enter \"1\", \"2\", \"3\" ");
				choiceentry = scanchoice.nextInt();


			 if (choiceentry == 1) {
				Scanner s = new Scanner(System.in);

				PreparedStatement stmt = con.prepareStatement("Select username, password from login where username=? and password=?");

				s = new Scanner(System.in);
				stmt.setString(1, s.nextLine());
				s = new Scanner(System.in);
				stmt.setString(2, s.nextLine());

				stmt.executeUpdate();

				break;
			} else if (choiceentry == 2) {
				Statement stmt = con.createStatement();
				

					ResultSet rs = stmt.executeQuery("select * from login");

					while (rs.next()) {
						System.out.println(rs.getString(1) + " " + rs.getString(2));
					}

			
			} else if (choiceentry == 3) {

				break;
			}
		}
		con.close();
		System.out.println("Thank you for your choice");
	}
}
