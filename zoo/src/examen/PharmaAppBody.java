package examen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Drugs {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Drugs window = new Drugs();
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
	public Drugs() {
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
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(10, 11, 94, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblDescribtion = new JLabel("Describtion:");
		lblDescribtion.setBounds(10, 36, 94, 14);
		frame.getContentPane().add(lblDescribtion);
		
		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setBounds(10, 61, 46, 14);
		frame.getContentPane().add(lblCountry);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setBounds(10, 86, 94, 14);
		frame.getContentPane().add(lblQuantity);
		
		JLabel lblMedicamentid = new JLabel("Diagnosis:");
		lblMedicamentid.setBounds(10, 111, 94, 14);
		frame.getContentPane().add(lblMedicamentid);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setBounds(10, 136, 46, 14);
		frame.getContentPane().add(lblDate);
		
		JLabel lblPrice = new JLabel("Price: ");
		lblPrice.setBounds(10, 161, 46, 14);
		frame.getContentPane().add(lblPrice);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(104, 83, 46, 20);
		frame.getContentPane().add(spinner);
		
		textField = new JTextField();
		textField.setBounds(104, 8, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(104, 33, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(104, 58, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(104, 108, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(104, 133, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(104, 158, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examen", "root", "root");

					Scanner s = new Scanner(System.in);

					PreparedStatement stmt = con.prepareStatement("insert into examen.drug(name,describtion,country,quantity,diagnosis,date,price) values(?, ?, ?, ?, ?, ?, ?)");					
					
					stmt.setString(1, textField.getText());
					stmt.setString(2, textField_1.getText());
					stmt.setString(3, textField_2.getText());
					stmt.setInt(4, (int) spinner.getValue());
					stmt.setString(5, textField_4.getText());
					stmt.setString(6, textField_5.getText());
					
					
					
					
					stmt.executeUpdate();
					
				} catch (Exception d) {
					// TODO Auto-generated catch block
					d.printStackTrace();
				}
			}
		});
		btnRegister.setBounds(104, 189, 89, 23);
		frame.getContentPane().add(btnRegister);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(104, 223, 89, 23);
		frame.getContentPane().add(btnSearch);
	}
}
