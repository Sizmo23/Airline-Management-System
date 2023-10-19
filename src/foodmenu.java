

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class foodmenu extends JFrame
{
	private JTextField name,num,size,quan;

    public static void main(String[] args) {
        new foodmenu();
    }
    
    public foodmenu() {
        initialize();
    }
    
    private void initialize() 
    {
	    setTitle("PLANE EXCISION");
		getContentPane().setBackground(Color.GRAY);
		setBounds(100, 100, 801, 472);
		getContentPane().setLayout(null);
			
		JLabel Cancellation = new JLabel("SELECT MENU");
		Cancellation.setFont(new Font("Tahoma", Font.PLAIN, 31));
		Cancellation.setBounds(336, 23, 271, 38);
		getContentPane().add(Cancellation);
			
		
//	        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/cancel.png"));
//	        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
//	        ImageIcon i3 = new ImageIcon(i2);
//	        JLabel NewLabel = new JLabel(i3);
//		NewLabel.setBounds(470, 100, 250, 250);
//		add(NewLabel);
		
	JLabel PassengerNo = new JLabel("FOOD NAME");
	PassengerNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
	PassengerNo.setBounds(60, 89, 150, 50);
	getContentPane().add(PassengerNo);
		
	JLabel CancellationNo = new JLabel("FOOD NO");
	CancellationNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
	CancellationNo.setBounds(60, 150, 150, 27);
	getContentPane().add(CancellationNo);
		
	JLabel CancellationDate = new JLabel("PORTION SIZE");
	CancellationDate.setFont(new Font("Tahoma", Font.PLAIN, 17));
	CancellationDate.setBounds(60, 200, 180, 27);
	getContentPane().add(CancellationDate);
		
	JLabel Ticketid = new JLabel("QUANTITY");
	Ticketid.setFont(new Font("Tahoma", Font.PLAIN, 17));
	Ticketid.setBounds(49, 247, 177, 27);
	getContentPane().add(Ticketid);
		
	JLabel Flightcode = new JLabel("SELECT PREFERENCES: ");
	Flightcode.setFont(new Font("Tahoma", Font.PLAIN, 17));
	Flightcode.setBounds(26, 297, 200, 27);
	getContentPane().add(Flightcode);
		
	JButton Cancel = new JButton("SELECT");
	Cancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        Cancel.setBackground(Color.WHITE);
        Cancel.setForeground(Color.BLACK);
	Cancel.setBounds(412, 391, 150, 30);
	getContentPane().add(Cancel);
		
	name = new JTextField();
	name.setBounds(250, 100, 150, 27);
	getContentPane().add(name);
	
        num = new JTextField();
	num.setBounds(250, 150, 150, 27);
	getContentPane().add(num);
		
	size = new JTextField();
	size.setBounds(250, 200, 150, 27);
	getContentPane().add(size);
	
        quan = new JTextField();
	quan.setBounds(250, 250, 150, 27);
	getContentPane().add(quan);
	
	JCheckBox chckbxNewCheckBox = new JCheckBox("Diabetic");
	chckbxNewCheckBox.setBounds(250, 302, 84, 23);
	getContentPane().add(chckbxNewCheckBox);
	
	JCheckBox chckbxVegan = new JCheckBox("Vegan");
	chckbxVegan.setBounds(336, 302, 67, 23);
	getContentPane().add(chckbxVegan);
	
	JCheckBox chckbxMuslim = new JCheckBox("Halal");
	chckbxMuslim.setBounds(412, 302, 67, 23);
	getContentPane().add(chckbxMuslim);
	
        Cancel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
		
        String passenger_no = name.getText();
		String cancellation_no = num.getText();
		String cancellation_date = size.getText();
		String ticket_id = quan.getText();
		String pref = "";
		
		if(chckbxNewCheckBox.isSelected())
		{
			pref+="Diabetic";
		}
		if(chckbxVegan.isSelected())
		{
			pref+="Vegan";
		}
		if(chckbxMuslim.isSelected())
		{
			pref+="Halal";
		}
				
		try{	
                    conn c = new conn();
                    String str = "INSERT INTO foodmenu values('"+cancellation_no+"', '"+passenger_no+"', '"+cancellation_date+"', '"+ticket_id+"', '"+pref+"')";
		
                    c.s.executeUpdate(str);
                    JOptionPane.showMessageDialog(null,"Food Item Inserted");
                    setVisible(true);
						
		}catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
			
	setSize(860,500);
	setVisible(true);
        setLocation(400,200);
    }
}
