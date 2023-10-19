

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JButton;

public class show extends JFrame
{
	public show(){
        getContentPane().setForeground(Color.BLUE);
        getContentPane().setBackground(Color.GRAY);
        setTitle("ADD CUSTOMER DETAILS");
	 
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(778,486);
        getContentPane().setLayout(null);

        setVisible(true);

        JLabel AddPassengers = new JLabel("WELCOME TO PAKISTAN AIRLINES");
        AddPassengers.setForeground(Color.BLUE);
        AddPassengers.setFont(new Font("Tahoma", Font.PLAIN, 31));
        AddPassengers.setBounds(251, 34, 513, 35);
        getContentPane().add(AddPassengers);
        
        
        //ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/emp.png"));
        
        JLabel lblNewLabel = new JLabel("PROCEED TO LOGIN");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
        lblNewLabel.setBounds(398, 163, 210, 44);
        getContentPane().add(lblNewLabel);
        
        JButton btnNewButton = new JButton("LOGIN PAGE");
        btnNewButton.setBounds(430, 262, 110, 23);
		
        btnNewButton.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e)
        	{
        		new login();
        	}
        });
        getContentPane().add(btnNewButton);
        
        setSize(900,600);
        setVisible(true);
        setLocation(400,200);
        
        
}
    
public static void main(String[] args){
    new show();
}
}
