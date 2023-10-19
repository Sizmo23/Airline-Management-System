

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class userframe extends JFrame implements ActionListener
{

	public static void main(String[] args) {
        new userframe().setVisible(true);
    }
    
    public userframe() {
        super("AIRLINE RESERVATION MANAGEMENT SYSTEM");
        getContentPane().setBackground(Color.GRAY);
        initialize();
    }

    
    private void initialize() {
	
        setForeground(Color.CYAN);
        getContentPane().setLayout(null);
	
	JLabel AirlineManagementSystem = new JLabel("Welcome To Pakistan Airline, Dear User Your Home in the sky");
	getContentPane().add(AirlineManagementSystem);
	AirlineManagementSystem.setForeground(Color.BLUE);
	AirlineManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 42));
	AirlineManagementSystem.setBounds(30, 50, 1243, 55);
	
	JLabel lblNewLabel = new JLabel("What would our dear little minion like to do today?");
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
	lblNewLabel.setBounds(372, 151, 538, 37);
	getContentPane().add(lblNewLabel);
	
	JButton btnNewButton = new JButton("Flight Info");
	btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{
			new flightinfo();
		}
	});
	btnNewButton.setBounds(625, 381, 204, 27);
	getContentPane().add(btnNewButton);
	
	JButton btnBookATicket = new JButton("Book A Ticket");
	btnBookATicket.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{
			new bookingticket();
		}
	});
	btnBookATicket.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btnBookATicket.setBounds(624, 326, 164, 27);
	getContentPane().add(btnBookATicket);
	
	JButton btnNewButton_1_1 = new JButton("Payment Details");
	btnNewButton_1_1.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			new payment_detail();
		}
	});
	btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btnNewButton_1_1.setBounds(410, 326, 164, 27);
	getContentPane().add(btnNewButton_1_1);
	
	JButton btnNewButton_1_2 = new JButton("Journey Details");
	btnNewButton_1_2.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) 
		{
			new journey_details();
		}
	});
	btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btnNewButton_1_2.setBounds(410, 381, 164, 27);
	getContentPane().add(btnNewButton_1_2);
	
	JButton btnNewButton_1_2_1 = new JButton("Feed Back");
	btnNewButton_1_2_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{
			new Feedback();
		}
	});
	btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btnNewButton_1_2_1.setBounds(515, 442, 164, 27);
	getContentPane().add(btnNewButton_1_2_1);
	
	JButton btnNewButton_1_1_1 = new JButton("Add Customer");
	btnNewButton_1_1_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{
			new add_customer();
		}
	});
	btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btnNewButton_1_1_1.setBounds(410, 278, 164, 27);
	getContentPane().add(btnNewButton_1_1_1);
	
	JButton btnNewButton_1_1_1_1 = new JButton("Cancel Ticket");
	btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{
			new cancel();
		}
	});
	btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btnNewButton_1_1_1_1.setBounds(625, 278, 164, 27);
	getContentPane().add(btnNewButton_1_1_1_1);
		
		
        setSize(1950,1090);
	setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
