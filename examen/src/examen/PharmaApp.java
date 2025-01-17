package examen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class PharmaApp {

	private JFrame frame;
	private JTable table;

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
		frame.setBounds(100, 100, 621, 512);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Pharma Sell", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(12, 28, 579, 195);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Product");
		lblNewLabel_1.setBounds(12, 29, 72, 25);
		panel.add(lblNewLabel_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(76, 29, 143, 25);
		panel.add(textPane);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DefaultTableModel model = new DefaultTableModel();
				model.addColumn("name");
				model.addColumn("description");
				model.addColumn("diagnosis");
				model.addColumn("price");
				
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbpharma","root","root");
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("SELECT * from drug");
					
					while(rs.next()) {
						String name = rs.getString("name");
						String des = rs.getString("description");
						String di=rs.getString("diagnosis"); 
						double price = rs.getDouble("price");
					
						System.out.println(name + des  + di + price );
						
						Object[] row = {name, des, di, price, };	
						model.addRow(row);	
					}
					
					table.setModel(model);
				
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				
				
			}
		});
			
		btnNewButton.setBounds(328, 29, 97, 30);
		panel.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 77, 413, 87);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("Checkout");
		btnNewButton_1.setBounds(471, 139, 97, 25);
		panel.add(btnNewButton_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(524, 35, 43, 25);
		panel.add(spinner);
		
		JLabel lblNewLabel = new JLabel("Quantity:");
		lblNewLabel.setBounds(469, 38, 56, 16);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("Add to cart");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnNewButton_2.setBounds(471, 101, 97, 25);
		panel.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Users", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(12, 236, 579, 192);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
	}
}
