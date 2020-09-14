package correa;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AppMain {

	public JFrame frame;
	public JTextField textFieldItem;
	public JScrollPane scrollPane_1;
	public JTextField textFieldCost;
	public JTextField textFieldQuantity;
	public JTextArea textAreaList;
	public JLabel lblQuantity;
	public JLabel lblListTotal; 
	public JButton btnAdd;
	public JLabel lblNewLabel;
	public JLabel lblItem;
	public JLabel lblSalesList;
	public String str = "";
	public SalesSlip slip;
	public JTextArea textAreaTotal;

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
		createEvents();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblSalesList = new JLabel("Sales List");
		lblSalesList.setBounds(181, 11, 67, 14);
		frame.getContentPane().add(lblSalesList);

		lblItem = new JLabel("Item:");
		lblItem.setBounds(31, 30, 48, 14);
		frame.getContentPane().add(lblItem);

		lblNewLabel = new JLabel("Cost: $");
		lblNewLabel.setBounds(9, 58, 48, 14);
		frame.getContentPane().add(lblNewLabel);

		 lblQuantity = new JLabel("Quantity: ");
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

		btnAdd = new JButton("Add Item To List");
		btnAdd.setBounds(137, 117, 133, 23);
		frame.getContentPane().add(btnAdd);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 151, 418, 70);
		frame.getContentPane().add(scrollPane);

		textAreaList = new JTextArea();
		scrollPane.setViewportView(textAreaList);

		lblListTotal = new JLabel("List Total:");
		lblListTotal.setBounds(9, 232, 59, 14);
		frame.getContentPane().add(lblListTotal);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(66, 232, 346, 22);
		frame.getContentPane().add(scrollPane_1);

		textAreaTotal = new JTextArea();
		scrollPane_1.setViewportView(textAreaTotal);

		slip = new SalesSlip();
	}

	public void createEvents() {
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buildOutput();
			}
		});

	}

	public void buildOutput() {
		slip.addCart(textFieldItem.getText(), textFieldCost.getText(), textFieldQuantity.getText());
		//slip.display();
		textAreaList.setText(slip.display());
		textAreaList.setLineWrap(true);
		textAreaList.setWrapStyleWord(true);
		textAreaTotal.setText(slip.totalSale());

	}
}
