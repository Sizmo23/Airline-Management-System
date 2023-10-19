

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Feedback extends JFrame
{
	JTextField textField,textField_5,textField_6;

    public Feedback(){
        getContentPane().setForeground(Color.BLUE);
        getContentPane().setBackground(Color.WHITE);
        setTitle("ADD FEEDBACK DETAILS");
	 
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(778,486);
        getContentPane().setLayout(null);
		
        JLabel Passportno = new JLabel("CUSTOMER NAME");
        Passportno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Passportno.setBounds(10, 183, 180, 27);
        getContentPane().add(Passportno);
        
        textField = new JTextField();
        textField.setBounds(200, 186, 150, 27);
        getContentPane().add(textField);
		
        JButton Next = new JButton("SAVE");
        Next.setBounds(367, 478, 150, 30);
        Next.setBackground(Color.BLACK);
        Next.setForeground(Color.WHITE);
        getContentPane().add(Next);
        
        JLabel Phno = new JLabel("FEEDBACK DETAILS");
        Phno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Phno.setBounds(10, 237, 200, 27);
        getContentPane().add(Phno);
		
        textField_5 = new JTextField();
        textField_5.setBounds(200, 240, 150, 27);
        getContentPane().add(textField_5);

        setVisible(true);

        JLabel AddPassengers = new JLabel("FEEDBACK");
        AddPassengers.setForeground(Color.BLUE);
        AddPassengers.setFont(new Font("Tahoma", Font.PLAIN, 31));
        AddPassengers.setBounds(401, 34, 288, 35);
        getContentPane().add(AddPassengers);
		

        JLabel Flightcode = new JLabel("CUSTOMER NUMBER");
        Flightcode.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Flightcode.setBounds(10, 130, 180, 27);
        getContentPane().add(Flightcode);

        textField_6 = new JTextField();
        textField_6.setBounds(200, 133, 150, 27);
        getContentPane().add(textField_6);
        

        
        Next.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) 
            {
                String customer_num = textField_6.getText();
                String feedback_details =  textField_5.getText();
                String name = textField.getText();
                
                try {
                    conn c = new conn();
                    String str = "INSERT INTO feedback (cust_name, ticketno, feedback_details) values( '"+name+"', '"+customer_num+"', '"+feedback_details+"')";
                    
                    c.s.executeUpdate(str);
                    JOptionPane.showMessageDialog(null,"Feedback Recorded");
                    setVisible(true);
                
                } catch (Exception e) {
                    e.printStackTrace();
    	    }
	}
        });
		
        setSize(900,600);
        setVisible(true);
        setLocation(400,200);
		
}
    
public static void main(String[] args){
    new Feedback();
}
}
