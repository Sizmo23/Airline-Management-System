

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class test1 extends JFrame
{
	private JTextField textField;
	private JTextField textField_1;

    public static void main(String[] args) {
        new test1();
    }
    
    public test1() {
        initialize();
    }
    
    private void initialize() 
    {
	    setTitle("Instant LAN Messenger Server");
		getContentPane().setBackground(new Color(192, 192, 192));
		setBounds(100, 100, 801, 472);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Instant LAN Messenger Client");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(260, 11, 310, 59);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter IP & Port:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(93, 87, 113, 32);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(204, 88, 270, 34);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Not Connected");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(260, 133, 129, 29);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("CONNECT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IP = textField.getText();
				if(IP.equals("127.169.1"))
				{
					lblNewLabel_2.setText("Connected");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(558, 87, 158, 72);
		getContentPane().add(btnNewButton);
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(93, 311, 623, 83);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(93, 170, 623, 111);
		getContentPane().add(panel);
		
		JButton btnSend = new JButton("SEND");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSend.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSend.setBounds(573, 405, 140, 45);
		getContentPane().add(btnSend);
		
		
			
	setSize(860,500);
	setVisible(true);
        setLocation(400,200);
    }
}
