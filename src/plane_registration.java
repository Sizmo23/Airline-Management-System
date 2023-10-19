

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class plane_registration extends JFrame
{
	JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6;

    public plane_registration()
    {
        getContentPane().setForeground(Color.BLUE);
        getContentPane().setBackground(Color.WHITE);
        setTitle("INSERT PLANE REGISTRATION: ");
	 
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(778,486);
        getContentPane().setLayout(null);
		
        JLabel Passportno = new JLabel("PLANE NUMBER: ");
        Passportno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Passportno.setBounds(73, 168, 180, 27);
        getContentPane().add(Passportno);
        
        textField = new JTextField();
        textField.setBounds(200, 171, 150, 27);
        getContentPane().add(textField);
		
        JButton Next = new JButton("SAVE");
        Next.setBounds(475, 460, 150, 30);
        Next.setBackground(Color.BLACK);
        Next.setForeground(Color.WHITE);
        getContentPane().add(Next);
		
        JLabel Pnrno = new JLabel("LICENSE NUMBER:");
        Pnrno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Pnrno.setBounds(60, 218, 150, 27);
        getContentPane().add(Pnrno);
		
        textField_1 = new JTextField();
        textField_1.setBounds(200, 218, 150, 27);
        getContentPane().add(textField_1);
        
        JLabel Address = new JLabel("COMPANY NAME: ");
        Address.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Address.setBounds(60, 256, 150, 27);
        getContentPane().add(Address);
		
        textField_2 = new JTextField();
        textField_2.setBounds(200, 256, 150, 27);
        getContentPane().add(textField_2);
        		
        JLabel Nationality = new JLabel("SIZE: ");
        Nationality.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Nationality.setBounds(129, 294, 61, 27);
        getContentPane().add(Nationality);
		
        textField_3 = new JTextField();
        textField_3.setBounds(200, 297, 150, 27);
        getContentPane().add(textField_3);

        JLabel Name = new JLabel("NAME");
        Name.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Name.setBounds(120, 332, 70, 27);
        getContentPane().add(Name);

        textField_4 = new JTextField();
        textField_4.setBounds(200, 335, 150, 27);
        getContentPane().add(textField_4);

        JLabel Gender = new JLabel("TYPE");
        Gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Gender.setBounds(111, 370, 79, 27);
        getContentPane().add(Gender);
	
        JRadioButton NewRadioButton = new JRadioButton("CARGO");
        NewRadioButton.setBackground(Color.WHITE);
        NewRadioButton.setBounds(200, 373, 70, 27);
        getContentPane().add(NewRadioButton);

        JRadioButton Female = new JRadioButton("PASSENGER");
        Female.setBackground(Color.WHITE);
        Female.setBounds(280, 373, 116, 27);
        getContentPane().add(Female);
        
        JLabel Phno = new JLabel("CAPACITY: ");
        Phno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Phno.setBounds(89, 408, 101, 27);
        getContentPane().add(Phno);
		
        textField_5 = new JTextField();
        textField_5.setBounds(200, 411, 150, 27);
        getContentPane().add(textField_5);

        setVisible(true);

        JLabel AddPassengers = new JLabel("ADD PLANE DETAILS");
        AddPassengers.setForeground(Color.BLUE);
        AddPassengers.setFont(new Font("Tahoma", Font.PLAIN, 31));
        AddPassengers.setBounds(420, 24, 442, 35);
        getContentPane().add(AddPassengers);
		

        JLabel Flightcode = new JLabel("HOURS IN FLIGHT: ");
        Flightcode.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Flightcode.setBounds(80, 130, 150, 27);
        getContentPane().add(Flightcode);

        textField_6 = new JTextField();
        textField_6.setBounds(200, 133, 150, 27);
        getContentPane().add(textField_6);

        
        Next.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
            	
            	 String hours = textField_6.getText();
                String planeno = textField.getText();
                String licenseno =  textField_1.getText();
                String companyname = textField_2.getText();
                String name = textField_4.getText();
                String size = textField_6.getText();
               
                String type = null;
                
                if(NewRadioButton.isSelected()){
                    type = "cargo";
                
                }else if(Female.isSelected()){
                    type = "passenger";
                }
                
                try {
                    conn c = new conn();
                    String str = "INSERT INTO plane values( '"+hours+"', '"+planeno+"', '"+licenseno+"','"+companyname+"', '"+size+"', '"+name+"','"+type+"')";
                    
                    c.s.executeUpdate(str);
                    JOptionPane.showMessageDialog(null,"Plane Added");
                    setVisible(false);
                
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
    new plane_registration();
}   
}
