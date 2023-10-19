

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class test extends JFrame
{
	public static void main(String[] args) {
        new test().setVisible(true);
    }
    
    public test() {
        super("AIRLINE RESERVATION MANAGEMENT SYSTEM");
        getContentPane().setBackground(Color.GRAY);
        initialize();
    }

    
    private void initialize() {
	
        setForeground(Color.CYAN);
        getContentPane().setLayout(null);
	
	JLabel AirlineManagementSystem = new JLabel("Welcome To Pakistan Airline, Dear Manager Your home in the sky");
	getContentPane().add(AirlineManagementSystem);
	AirlineManagementSystem.setForeground(Color.BLUE);
	AirlineManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 42));
	AirlineManagementSystem.setBounds(30, 50, 1243, 55);
	
	JLabel lblNewLabel = new JLabel("What would our dear overlord like to do today?");
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblNewLabel.setBounds(434, 151, 388, 37);
	getContentPane().add(lblNewLabel);
	
	JButton btnNewButton = new JButton("Remove an Employee");
	btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{
			new Employee_Resignation();
		}
	});
	btnNewButton.setBounds(618, 238, 204, 27);
	getContentPane().add(btnNewButton);
	
	JButton btnNewButton_1 = new JButton("Add an Employee");
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{
			new add_employee();
		}
	});
	btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btnNewButton_1.setBounds(427, 238, 164, 27);
	getContentPane().add(btnNewButton_1);
	
	JButton btnNewButton_1_1 = new JButton("Add an Aircraft");
	btnNewButton_1_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{
			new plane_registration();
		}
	});
	btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btnNewButton_1_1.setBounds(427, 299, 164, 27);
	getContentPane().add(btnNewButton_1_1);
	
	JButton btnNewButton_1_2 = new JButton("Remove an Aircraft");
	btnNewButton_1_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{
			new plane_removal();
		}
	});
	btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btnNewButton_1_2.setBounds(627, 299, 164, 27);
	getContentPane().add(btnNewButton_1_2);
		
    setSize(1950,1090);
	setVisible(true);
    }
}
