package examen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Users {

	JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Users window = new Users();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Users() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 6, 100, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblSuranme = new JLabel("Suranme:");
		lblSuranme.setBounds(10, 31, 100, 14);
		frame.getContentPane().add(lblSuranme);
		
		JLabel lblNewLabel = new JLabel("Password:");
		lblNewLabel.setBounds(10, 56, 100, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(10, 84, 100, 14);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(10, 115, 100, 14);
		frame.getContentPane().add(lblPhone);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 146, 100, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblAdmin = new JLabel("Admin:");
		lblAdmin.setBounds(10, 171, 100, 14);
		frame.getContentPane().add(lblAdmin);
		
		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setBounds(10, 207, 100, 14);
		frame.getContentPane().add(lblCountry);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 0, 134, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(120, 28, 134, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(120, 81, 134, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(120, 112, 134, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(120, 143, 134, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(120, 174, 134, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(120, 204, 134, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examen", "root", "root");

					Scanner s = new Scanner(System.in);

					PreparedStatement stmt = con.prepareStatement("insert into examen.users(name,surname,username,password,adress,phone,email,admin,country) values(?, ?, ?, ?, ?, ?, ?, ?, ?)");					
					
					stmt.setString(1, textField_1.getText());
					stmt.setString(2, textField_2.getText());
					stmt.setString(3, textField_9.getText());
					stmt.setString(4, passwordField.getText());
					stmt.setString(5, textField_4.getText());
					stmt.setString(6, textField_5.getText());
					stmt.setString(7, textField_6.getText());
					stmt.setString(8, textField_7.getText());
					stmt.setString(9, textField_8.getText());
					
					
					stmt.executeUpdate();
					
				} catch (Exception u) {
					// TODO Auto-generated catch block
					u.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(266, 181, 113, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(266, 210, 113, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		textField_9 = new JTextField();
		textField_9.setBounds(120, 230, 134, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(10, 233, 100, 14);
		frame.getContentPane().add(lblUsername);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(120, 53, 134, 20);
		frame.getContentPane().add(passwordField);
	}
}
