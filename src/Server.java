

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Server extends JFrame
{
	private JTextField textField;
	private JTextField textField_1;

    public static void main(String[] args) {
        new Server();
    }
    
    public Server() {
        initialize();
    }
    
    private void initialize() 
    {
	    setTitle("Instant LAN Messenger Server");
		getContentPane().setBackground(new Color(192, 192, 192));
		setBounds(100, 100, 801, 472);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Instant LAN Messenger Server");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(196, 36, 310, 59);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Port Number:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(22, 112, 102, 32);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(134, 106, 102, 34);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Start Listening");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(274, 106, 119, 36);
		getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(473, 274, -406, -102);
		getContentPane().add(scrollPane);
		
		textField_1 = new JTextField();
		textField_1.setBounds(62, 311, 404, 83);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(93, 177, 324, 98);
		getContentPane().add(panel);
			
	setSize(860,500);
	setVisible(true);
        setLocation(400,200);
    }
}
