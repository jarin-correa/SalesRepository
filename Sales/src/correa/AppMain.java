package correa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AppMain {

	private JFrame frame;
	private JTextField textFieldItem;
	private JTextField textFieldCost;
	private JTextField textFieldQuantity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain window = new AppMain();
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
	public AppMain() {
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
		
		JLabel lblSalesList = new JLabel("Sales List");
		lblSalesList.setBounds(181, 11, 67, 14);
		frame.getContentPane().add(lblSalesList);
		
		JLabel lblItem = new JLabel("Item:");
		lblItem.setBounds(31, 30, 48, 14);
		frame.getContentPane().add(lblItem);
		
		JLabel lblNewLabel = new JLabel("Cost: $");
		lblNewLabel.setBounds(31, 55, 48, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblQuantity = new JLabel("Quantity: ");
		lblQuantity.setBounds(10, 89, 81, 14);
		frame.getContentPane().add(lblQuantity);
		
		textFieldItem = new JTextField();
		textFieldItem.setBounds(67, 28, 293, 17);
		frame.getContentPane().add(textFieldItem);
		textFieldItem.setColumns(10);
		
		textFieldCost = new JTextField();
		textFieldCost.setBounds(67, 55, 293, 20);
		frame.getContentPane().add(textFieldCost);
		textFieldCost.setColumns(10);
		
		textFieldQuantity = new JTextField();
		textFieldQuantity.setBounds(67, 86, 293, 20);
		frame.getContentPane().add(textFieldQuantity);
		textFieldQuantity.setColumns(10);
		
		JButton btnAdd = new JButton("Add Item To List");
		btnAdd.setBounds(137, 117, 133, 23);
		frame.getContentPane().add(btnAdd);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 151, 418, 70);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textAreaList = new JTextArea();
		scrollPane.setViewportView(textAreaList);
		
		JLabel lblListTotal = new JLabel("List Total:");
		lblListTotal.setBounds(31, 232, 59, 14);
		frame.getContentPane().add(lblListTotal);
		
		JTextArea textAreaTotal = new JTextArea();
		textAreaTotal.setBounds(82, 227, 293, 19);
		frame.getContentPane().add(textAreaTotal);
	}
}
