package wordcount;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class WordCountApp {

	private JFrame frmWordCountApp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordCountApp window = new WordCountApp();
					window.frmWordCountApp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WordCountApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWordCountApp = new JFrame();
		frmWordCountApp.setTitle("Word Count App");
		frmWordCountApp.setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		frmWordCountApp.setBounds(100, 100, 450, 300);
		frmWordCountApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWordCountApp.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Characters:");
		lblNewLabel.setBounds(36, 0, 100, 16);
		frmWordCountApp.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(83, 56, 233, 127);
		frmWordCountApp.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textArea.getText();
				int noOfCharacters = text.length(); 
				String[] words = text.split(" ");
				int noOfWords = words.length;
				
				lblNewLabel.setText("Characters: " + noOfCharacters);
				
			}
		});
		btnNewButton.setBounds(39, 215, 97, 25);
		frmWordCountApp.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(46, 29, 56, 16);
		frmWordCountApp.getContentPane().add(lblNewLabel_1);
	}
}
