package tema82;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;

public class Tema82 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tema82 window = new Tema82();
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
	public Tema82() {
		initialize();
	}
	  public static Connection getConnection(){
		     
	        Connection con = null;
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            con = DriverManager.getConnection("jdbc:mysql://localhost/tema81", "root", "root");
	        } catch (Exception ex) {
	            System.out.println(ex.getMessage());
	        }
	        
	        return con;
	  }

	    
	    


    
    

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNume = new JLabel("Nume:");
		lblNume.setBounds(10, 11, 91, 14);
		frame.getContentPane().add(lblNume);
		
		JLabel lblPrenume = new JLabel("Prenume:");
		lblPrenume.setBounds(10, 32, 91, 14);
		frame.getContentPane().add(lblPrenume);
		
		JLabel lblSex = new JLabel("Sex:");
		lblSex.setBounds(10, 55, 91, 14);
		frame.getContentPane().add(lblSex);
		
		JLabel lblOcupatie = new JLabel("Ocupatie:");
		lblOcupatie.setBounds(10, 80, 91, 14);
		frame.getContentPane().add(lblOcupatie);
		
		JLabel lblVarsta = new JLabel("Varsta");
		lblVarsta.setBounds(10, 105, 91, 14);
		frame.getContentPane().add(lblVarsta);
		
		JLabel lblDepartament = new JLabel("Departament:");
		lblDepartament.setBounds(10, 130, 91, 14);
		frame.getContentPane().add(lblDepartament);
		
		JLabel lblNewLabel = new JLabel("Hire Date:");
		lblNewLabel.setBounds(10, 155, 91, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(111, 8, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(111, 29, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(111, 77, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(111, 102, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(111, 127, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(111, 152, 86, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 String nume = textField.getText();
			        String prenume = textField_1.getText();
			        String ocupatie = textField_2.getText();
			        String varsta = textField_3.getText();
			        String Departament = textField_4.getText();
			        String HireDate = textField_5.getText();
			        String sex = textField_6.getText();
			        
			                
			        if(nume.equals(""))
			        {
			            JOptionPane.showMessageDialog(null, "Add A Username");
			        }
			        
			        else if(prenume.equals(""))
			        {
			            JOptionPane.showMessageDialog(null, "Add A Password");
			        }
			    
			        
			        
			        else if(checkUsername(nume))
			        {
			            JOptionPane.showMessageDialog(null, "This Username Already Exist");
			        }
			        
			        else{
			        
			        if(HireDate != null)
			        {
			            /*SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
			          bdate = dateformat.format(HireDate.getText();*/
			        }
			            
			        PreparedStatement ps;
			        String query = "INSERT INTO `tema81`(`nume`, `prenume`, `ocupatie`, `varsta`, `HireDate`, `sex`) VALUES (?,?,?,?,?,?)";
			        
			        try {
			            ps = getConnection().prepareStatement(query);
			            
			            ps.setString(1, nume);
			            ps.setString(2, prenume);
			            ps.setString(3, ocupatie);
			            ps.setString(4, varsta);
			            ps.setString(6, sex);
			            
			            if(HireDate != null)
			            {
			             ps.setString(5, HireDate);
			            }else{
			                ps.setNull(5, 0);
			            }
			         
			            
			            if(ps.executeUpdate() > 0)
			            {
			                JOptionPane.showMessageDialog(null, "New User Add");
			            }
			            
			        } catch (SQLException ex) {
			            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
			        }
			        }
			    }

			private boolean checkUsername(String nume) {
				// TODO Auto-generated method stub
				return false;
			}                                                 


		});
		btnNewButton.setBounds(108, 183, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(108, 217, 89, 23);
		frame.getContentPane().add(btnSearch);
		
		JList list = new JList();
		list.setBounds(230, 236, 180, -225);
		frame.getContentPane().add(list);
		
		textField_6 = new JTextField();
		textField_6.setBounds(111, 52, 86, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
	
		}
}
