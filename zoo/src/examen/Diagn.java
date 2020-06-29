package examen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Diagn {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 * 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diagn window = new Diagn();
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
	public Diagn() {

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

		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(10, 11, 74, 25);
		frame.getContentPane().add(lblId);

		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 39, 74, 14);
		frame.getContentPane().add(lblName);

		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setBounds(10, 64, 74, 14);
		frame.getContentPane().add(lblDescription);

		textField = new JTextField();
		textField.setBounds(94, 13, 250, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(94, 36, 250, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(94, 61, 250, 30);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examen", "root", "root");

					Scanner s = new Scanner(System.in);

					PreparedStatement stmt = con.prepareStatement("insert into examen.diagnosis(name,description) values(?, ?)");
					
					stmt.setString(1, textField_1.getText());
					stmt.setString(2, textField_2.getText());
					stmt.executeUpdate();
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
			}
		});
		btnAdd.setBounds(335, 209, 89, 23);
		frame.getContentPane().add(btnAdd);

		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(236, 209, 89, 23);
		frame.getContentPane().add(btnSearch);
	}
}
