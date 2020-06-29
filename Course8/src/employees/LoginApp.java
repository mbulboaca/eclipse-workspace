package employees;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class LoginApp {

	private JFrame frame;
	private JTextField textFieldUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginApp window = new LoginApp();
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
	public LoginApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 286, 199);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(22, 35, 86, 14);
		frame.getContentPane().add(lblUsername);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(118, 32, 140, 20);
		frame.getContentPane().add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(22, 67, 64, 14);
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(118, 64, 140, 17);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbemployee","root","root");
					
					PreparedStatement stmt = con.prepareStatement("select * from users where username = ? and password = ? ");
					stmt.setString(1, textFieldUsername.getText());
					stmt.setString(2, passwordField.getText());
					
					ResultSet rs = stmt.executeQuery();
					if(rs.next()) {
						EmployeesApp.main(null);
					} else {
						JOptionPane.showMessageDialog(null, "Invalid Login!");
					}
				
					con.close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				
			}
		});
		btnLogin.setBounds(96, 114, 89, 23);
		frame.getContentPane().add(btnLogin);
	}

}
