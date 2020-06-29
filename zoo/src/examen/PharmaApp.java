package examen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class PharmaApp {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PharmaApp window = new PharmaApp();
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
	public PharmaApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 204));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome to BigPharma App");
		lblWelcome.setFont(new Font("Rockwell", Font.BOLD, 17));
		lblWelcome.setBounds(95, 11, 290, 80);
		frame.getContentPane().add(lblWelcome);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel.setBounds(78, 102, 91, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblPassword.setBounds(78, 142, 91, 14);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(175, 108, 128, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(175, 140, 128, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnRegister = new JButton("Login");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examen", "root", "root");

					Scanner s = new Scanner(System.in);

					Statement stmt = con.createStatement();	
					ResultSet rs = stmt.executeQuery("select * from examen.users");
					
					while(rs.next()) {
						if (rs.getString("username").equals(textField.getText()) || rs.getString("password").equals(textField_1.getText()) ) {
							EventQueue.invokeLater(new Runnable() {
								public void run() {
									try {
										PharamaAppBody window = new PharamaAppBody();
										window.frame.setVisible(true);
									} catch (Exception e) {
										e.printStackTrace();
									}
								}
							});
						}
					}
					
					
					
					
					
					
				} catch (Exception u) {
					// TODO Auto-generated catch block
					u.printStackTrace();
				
			}
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegister.setForeground(new Color(0, 153, 0));
		btnRegister.setBounds(214, 171, 89, 23);
		frame.getContentPane().add(btnRegister);
		
		JButton btnRegister_1 = new JButton("Register");
		btnRegister_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		});
		btnRegister_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRegister_1.setForeground(new Color(0, 51, 255));
		btnRegister_1.setBounds(214, 205, 89, 23);
		frame.getContentPane().add(btnRegister_1);
	}

}
