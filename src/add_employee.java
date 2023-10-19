

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class add_employee extends JFrame 
{
	JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6;

    public add_employee(){
        getContentPane().setForeground(Color.BLUE);
        getContentPane().setBackground(Color.WHITE);
        setTitle("ADD EMPLOYEE DETAILS");
	 
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(778,486);
        getContentPane().setLayout(null);
		
        JLabel Passportno = new JLabel("REFERENCE NUMBER: ");
        Passportno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Passportno.setBounds(10, 168, 180, 27);
        getContentPane().add(Passportno);
        
        textField = new JTextField();
        textField.setBounds(200, 171, 150, 27);
        getContentPane().add(textField);
		
        JButton Next = new JButton("SAVE");
        Next.setBounds(475, 460, 150, 30);
        Next.setBackground(Color.BLACK);
        Next.setForeground(Color.WHITE);
        getContentPane().add(Next);
        
        JLabel Address = new JLabel("ADDRESS");
        Address.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Address.setBounds(60, 256, 150, 27);
        getContentPane().add(Address);
		
        textField_2 = new JTextField();
        textField_2.setBounds(200, 256, 150, 27);
        getContentPane().add(textField_2);
        		
        JLabel Nationality = new JLabel("OCCUPATION");
        Nationality.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Nationality.setBounds(49, 294, 150, 27);
        getContentPane().add(Nationality);
		
        textField_3 = new JTextField();
        textField_3.setBounds(200, 297, 150, 27);
        getContentPane().add(textField_3);

        JLabel Name = new JLabel("NAME");
        Name.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Name.setBounds(60, 332, 150, 27);
        getContentPane().add(Name);

        textField_4 = new JTextField();
        textField_4.setBounds(200, 335, 150, 27);
        getContentPane().add(textField_4);

        JLabel Gender = new JLabel("GENDER");
        Gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Gender.setBounds(60, 370, 150, 27);
        getContentPane().add(Gender);
	
        JRadioButton NewRadioButton = new JRadioButton("MALE");
        NewRadioButton.setBackground(Color.WHITE);
        NewRadioButton.setBounds(200, 373, 70, 27);
        getContentPane().add(NewRadioButton);

        JRadioButton Female = new JRadioButton("FEMALE");
        Female.setBackground(Color.WHITE);
        Female.setBounds(280, 373, 116, 27);
        getContentPane().add(Female);
        
        JLabel Phno = new JLabel("PH NO");
        Phno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Phno.setBounds(60, 408, 150, 27);
        getContentPane().add(Phno);
		
        textField_5 = new JTextField();
        textField_5.setBounds(200, 411, 150, 27);
        getContentPane().add(textField_5);

        setVisible(true);

        JLabel AddPassengers = new JLabel("ADD EMPLOYEE DETAILS");
        AddPassengers.setForeground(Color.BLUE);
        AddPassengers.setFont(new Font("Tahoma", Font.PLAIN, 31));
        AddPassengers.setBounds(420, 24, 442, 35);
        getContentPane().add(AddPassengers);
		

        JLabel Flightcode = new JLabel("EXPERIENCE YEARS: ");
        Flightcode.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Flightcode.setBounds(40, 130, 150, 27);
        getContentPane().add(Flightcode);

        textField_6 = new JTextField();
        textField_6.setBounds(200, 133, 150, 27);
        getContentPane().add(textField_6);
        
        
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/emp.png"));
//        JLabel image = new JLabel(i1);
//        image.setBounds(450,80,280,410);
//        getContentPane().add(image);

        
        Next.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String Experience = textField_6.getText();
                String reference_no = textField.getText();
                String address =  textField_2.getText();
                String Occupation = textField_3.getText();
                String name = textField_4.getText();
               
                String gender = "";
                
                if(NewRadioButton.isSelected())
                {
                    gender = "male";
                
                }else if(Female.isSelected())
                {
                    gender = "female";
                }
                
                try {
                    conn c = new conn();
                    String str = "INSERT INTO employee values( '"+Experience+"','"+address+"', '"+reference_no+"','"+name+"', '"+gender+"', '"+Occupation+"')";
                    
                    c.s.executeUpdate(str);
                    JOptionPane.showMessageDialog(null,"Employee Added");
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
    new add_employee();
}   
}
