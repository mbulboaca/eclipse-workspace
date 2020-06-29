package employees;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextArea;

public class EmployeesApp {

	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeesApp window = new EmployeesApp();
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
	public EmployeesApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnViewEmployees = new JButton("View Employees");
		btnViewEmployees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = new DefaultTableModel();
				model.addColumn("Name");	//capul de tabel
				model.addColumn("Age");
				model.addColumn("Salary");
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbemployee","root","root");
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("select * from employee");
					
					while(rs.next()) {
						String name = rs.getString("name");
						int age = rs.getInt("age");
						double salary = rs.getDouble("salary");
						System.out.println(name + " age:" + age + " salary:" + salary);
						
						Object[] row = {name, age, salary};	//creez randuri
						model.addRow(row);	//adaug randul pe model
					}
					
					table.setModel(model);	//setez modelul cu toate randurile pe tabel
				
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnViewEmployees.setBounds(272, 227, 138, 23);
		frame.getContentPane().add(btnViewEmployees);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 11, 389, 201);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Insert Employee", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(21, 260, 389, 179);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 28, 46, 14);
		panel.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(71, 25, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(10, 63, 46, 14);
		panel.add(lblAge);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(18, 15, 65, 1));
		spinner.setBounds(73, 60, 53, 20);
		panel.add(spinner);
		
		JLabel lblSalary = new JLabel("Salary:");
		lblSalary.setBounds(192, 28, 46, 14);
		panel.add(lblSalary);
		
		textField_1 = new JTextField();
		textField_1.setBounds(237, 25, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(73, 92, 306, 43);
		panel.add(textArea);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(10, 97, 46, 14);
		panel.add(lblAddress);
		
		JButton btnInsertEmployee = new JButton("Insert Employee");
		btnInsertEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = textField.getText();
				String salary = textField_1.getText();
				int age = (int) spinner.getValue();
				String address = textArea.getText();
				
				insertEmployee(name, address, age, Double.valueOf(salary));
			}
		});
		btnInsertEmployee.setBounds(253, 146, 126, 23);
		panel.add(btnInsertEmployee);
	}
	
	
	private static void insertEmployee(String name, String address, int age, double salary) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbemployee","root","root");
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("INSERT INTO `employee` (`name`, `age`, `salary`, `address`) VALUES ('" + name + "', "
					+ "'" + age +"', '"+ salary + "', '" + address + "')" );
			
			con.close();
			JOptionPane.showMessageDialog(null, "Insert ok!");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
