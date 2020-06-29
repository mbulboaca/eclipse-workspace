package employees;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class EmployeeApp {

	private JFrame frmTema;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeApp window = new EmployeeApp();
					window.frmTema.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EmployeeApp() {
		initialize();
	}

	
	
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTema = new JFrame();
		frmTema.setTitle("Tema8");
		frmTema.setBackground(Color.CYAN);
		frmTema.setBounds(100, 100, 735, 513);
		frmTema.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTema.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Employee", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(30, 34, 658, 193);
		frmTema.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Filter by name:");
		lblNewLabel.setBounds(12, 28, 87, 16);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(111, 25, 138, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DefaultTableModel model = new DefaultTableModel();
				model.addColumn("First Name");	//capul de tabel
				model.addColumn("Last Name");
				model.addColumn("Hire Date");
				model.addColumn("Salary");
				model.addColumn("Departament");
				model.addColumn("Job Title");
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT employee.first_name, employee.last_name, employee.hire_date,"
							+ "employee.salary, departament.depname, jobtitle_name from departament "
							+ "join employee on departament.idd = employee.idemp join jobtitle on jobtitle.idj = employee.idemp");
					
					while(rs.next()) {
						String fname = rs.getString("first_name");
						String lname = rs.getString("last_name");
						String hiredate=rs.getString("hire_date"); //yyyy-mm-dd
						double salary = rs.getDouble("salary");
						String dep = rs.getString("depname");
						String job = rs.getString("jobtitle_name");
						System.out.println(fname + lname  + hiredate + salary + dep + job);
						
						Object[] row = {fname, lname, hiredate, salary, dep, job};	//creez randuri
						model.addRow(row);	//adaug randul pe model
					}
					
					table.setModel(model);	//setez modelul cu toate randurile pe tabel
				
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setBounds(533, 24, 97, 25);
		panel.add(btnNewButton);
		
		table = new JTable();
		table.setBounds(22, 57, 624, 112);
		panel.add(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Edit Employees", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(30, 240, 658, 196);
		frmTema.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Departament");
		lblNewLabel_1.setBounds(12, 26, 74, 16);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("First Name");
		lblNewLabel_1_1.setBounds(12, 55, 85, 16);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Last Name");
		lblNewLabel_1_2.setBounds(400, 55, 85, 16);
		panel_1.add(lblNewLabel_1_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setBounds(109, 23, 147, 22);
		panel_1.add(comboBox);
		
		JTextPane textPanef = new JTextPane();
		textPanef.setBounds(109, 49, 147, 22);
		panel_1.add(textPanef);
		
		JTextPane textPaneh = new JTextPane();
		textPaneh.setBounds(109, 82, 147, 22);
		panel_1.add(textPaneh);
		
		JTextPane textPanel = new JTextPane();
		textPanel.setBounds(487, 49, 147, 22);
		panel_1.add(textPanel);
		
		JTextPane textPanes = new JTextPane();
		textPanes.setBounds(487, 84, 147, 22);
		panel_1.add(textPanes);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Hire Date");
		lblNewLabel_1_2_1.setBounds(12, 84, 85, 16);
		panel_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Salary");
		lblNewLabel_1_2_1_1.setBounds(400, 84, 85, 16);
		panel_1.add(lblNewLabel_1_2_1_1);
		
		JButton btnNewButton_1 = new JButton("Insert");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						String fname = textPanef.getText();
						String lname = textPanel.getText();
						String hiredate = textPaneh.getText();
						String salary = textPanes.getText();
						
						insertEmployee(fname, lname, hiredate, Double.valueOf(salary));
			}
		});
		btnNewButton_1.setBounds(549, 119, 97, 25);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Job Title");
		lblNewLabel_1_3.setBounds(401, 26, 74, 16);
		panel_1.add(lblNewLabel_1_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(487, 20, 147, 22);
		panel_1.add(comboBox_1);
		
		
	}
	private static void insertEmployee(String fname, String lname, String hiredate, double salary) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("INSERT INTO `employee` (`first_name`, `last_name`, `hire_date`, `salary`) VALUES ('" + fname + "', "
					+ "'" + lname +"', '"+ hiredate + "', '" + salary + "')" );
			
			con.close();
			JOptionPane.showMessageDialog(null, "Insert ok!");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}



