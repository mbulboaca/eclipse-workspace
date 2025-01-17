package examen;

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
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.LocalTime;
public class Login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 386, 252);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setBounds(43, 38, 83, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(43, 67, 83, 16);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(138, 35, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(138, 65, 116, 19);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpharma","root","root");
					
					PreparedStatement stmt = con.prepareStatement("select * from users where username = ? and password = ? ");
					stmt.setString(1, textField.getText());
					stmt.setString(2, passwordField.getText());
					String username = textField.getText();
					ResultSet rs = stmt.executeQuery();
					if(rs.next()) {
						PharmaApp.main(null);
						
					} else {
						JOptionPane.showMessageDialog(null, "Invalid Login!");
					}
					
					LocalDate date = LocalDate.now();
					LocalTime time = LocalTime.now();
					JOptionPane.showMessageDialog(null, "Login Successful" +" " + time + "  "  + date);
					
					con.close();
				} catch (Exception ex) {
					ex.printStackTrace();
				
				}
				
			}
		});
		btnNewButton.setBounds(213, 130, 97, 25);
		frame.getContentPane().add(btnNewButton);
	}
}
