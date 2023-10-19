

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class bookingticket extends JFrame 
{
	JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6;

    public bookingticket(){
        getContentPane().setForeground(Color.BLUE);
        getContentPane().setBackground(Color.WHITE);
        setTitle("ADD EMPLOYEE DETAILS");
	 
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(778,486);
        getContentPane().setLayout(null);
		
        JLabel Passportno = new JLabel("CUSTOMER NAME");
        Passportno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Passportno.setBounds(10, 168, 180, 27);
        getContentPane().add(Passportno);
        
        textField = new JTextField();
        textField.setBounds(200, 171, 150, 27);
        getContentPane().add(textField);
		
        JButton Next = new JButton("SAVE");
        Next.setBounds(367, 478, 150, 30);
        Next.setBackground(Color.BLACK);
        Next.setForeground(Color.WHITE);
        getContentPane().add(Next);
		
        JLabel Pnrno = new JLabel("SOURCE ");
        Pnrno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Pnrno.setBounds(73, 215, 87, 27);
        getContentPane().add(Pnrno);
		
        textField_1 = new JTextField();
        textField_1.setBounds(200, 218, 150, 27);
        getContentPane().add(textField_1);
        
        JLabel Address = new JLabel("DESTINATION");
        Address.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Address.setBounds(60, 256, 150, 27);
        getContentPane().add(Address);
		
        textField_2 = new JTextField();
        textField_2.setBounds(200, 256, 150, 27);
        getContentPane().add(textField_2);
        		
        JLabel Nationality = new JLabel("DEPARTURE TIME");
        Nationality.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Nationality.setBounds(49, 294, 150, 27);
        getContentPane().add(Nationality);
		
        textField_3 = new JTextField();
        textField_3.setBounds(200, 297, 150, 27);
        getContentPane().add(textField_3);

   

        JLabel Gender = new JLabel("SEAT");
        Gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Gender.setBounds(10, 370, 63, 27);
        getContentPane().add(Gender);
	
        JRadioButton NewRadioButton = new JRadioButton("FIRST CLASS");
        NewRadioButton.setBackground(Color.WHITE);
        NewRadioButton.setBounds(73, 373, 110, 27);
        getContentPane().add(NewRadioButton);

        JRadioButton Female = new JRadioButton("BUSINESS");
        Female.setBackground(Color.WHITE);
        Female.setBounds(177, 373, 98, 27);
        getContentPane().add(Female);
        
        JRadioButton rdbtnEconomy = new JRadioButton("ECONOMY");
        rdbtnEconomy.setBackground(Color.WHITE);
        rdbtnEconomy.setBounds(268, 373, 92, 27);
        getContentPane().add(rdbtnEconomy);
        
        JLabel Phno = new JLabel("PAYMENT INFORMATION");
        Phno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Phno.setBounds(10, 408, 200, 27);
        getContentPane().add(Phno);
		
        textField_5 = new JTextField();
        textField_5.setBounds(210, 407, 150, 27);
        getContentPane().add(textField_5);

        setVisible(true);

        JLabel AddPassengers = new JLabel("BOOKING TICKET");
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
            public void actionPerformed(ActionEvent e){
                String cus_num = textField_6.getText();
                String cus_name = textField.getText();
                String source =  textField_1.getText();
                String destination = textField_2.getText();
                String departure = textField_3.getText();
                String payment = textField_5.getText();
               
                String seat = null;
                
                if(NewRadioButton.isSelected()){
                    seat = "First Class";
                
                }else if(Female.isSelected()){
                    seat = "Business";
                }
                else if(rdbtnEconomy.isSelected())
                {
                	seat = "economy";
                }
                
                try {
                    conn c = new conn();
                    String str = "INSERT INTO ticket values( '"+cus_num+"', '"+cus_name+"', '"+source+"','"+destination+"', '"+departure+"', '"+seat+"','"+payment+"')";
                    
                    c.s.executeUpdate(str);
                    JOptionPane.showMessageDialog(null,"Ticket Booked");
                    setVisible(false);
                
                } catch (Exception e1) {
                    e1.printStackTrace();
    	    }
	}
        });
		
        setSize(900,600);
        setVisible(true);
        setLocation(400,200);
}
    
public static void main(String[] args){
    new bookingticket();
}
}
