import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;
//import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;

public class journey_details extends JFrame{  //Forth

    JTable table;
    JLabel ReservationDetails,Source,Destination,label,label1;
    JButton Show;
    private JScrollPane scrollPane;
    private JButton btnClear;

    public static void main(String[] args){
        new journey_details();
    }
    
    public journey_details(){
        
        setTitle("journey_details");
        getContentPane().setBackground(Color.WHITE);	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	getContentPane().setLayout(null);
		
	Source = new JLabel("SOURCE");
	Source.setFont(new Font("Tahoma", Font.PLAIN, 19));
	Source.setBounds(60, 100, 150, 27);
	getContentPane().add(Source);
	
        Destination = new JLabel("DESTINATION");
	Destination.setFont(new Font("Tahoma", Font.PLAIN, 19));
	Destination.setBounds(350, 100, 150, 27);
	getContentPane().add(Destination);
		
	
		
	Show = new JButton("SHOW");
	Show.setBounds(680, 100, 100, 30);
	getContentPane().add(Show);

	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
	ReservationDetails = new JLabel("JOURNEY DETAILS");
	ReservationDetails.setForeground(Color.BLUE);
	ReservationDetails.setFont(new Font("Tahoma", Font.PLAIN, 31));
	ReservationDetails.setBounds(280, 27, 359, 31);
	getContentPane().add(ReservationDetails);
        
	String[] items1 =  {"Pakistan", "China", "Russia", "United States","Chad","Saudi Arabia", "South Africa", "Niger"};
	JComboBox comboBox = new JComboBox(items1);
	comboBox.setBounds(150, 100, 150, 27);
	getContentPane().add(comboBox);
		
		
	String[] items2 =  {"Pakistan", "China", "Russia", "United States","Chad","Saudi Arabia", "Niger"};
	JComboBox comboBox_1 = new JComboBox(items2);
	comboBox_1.setBounds(500, 100, 150, 27);
	getContentPane().add(comboBox_1);
        
        scrollPane = new JScrollPane();
        scrollPane.setBounds(38, 175, 770, 352);
        getContentPane().add(scrollPane);
        
        table = new JTable();
        scrollPane.setViewportView(table);
        
        btnClear = new JButton("CLEAR");
        btnClear.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		table.setModel(new DefaultTableModel());
        	}
        });
        btnClear.setBounds(315, 134, 100, 30);
        getContentPane().add(btnClear);
	
		
		
	Show.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
		try{
                    String src  = (String) comboBox.getSelectedItem();
                    String dst  = (String) comboBox_1.getSelectedItem();
                    
                    conn c = new conn();
                    
                    String str = "select pnr_no,ticket_id,f_code,jny_date,jny_time,src,dst from reservation where src = '"+src+"' and dst = '"+dst+"'";
                    ResultSet rs=c.s.executeQuery(str);
                    
                    ResultSetMetaData rsmd = rs.getMetaData();
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    
                    int cols = rsmd.getColumnCount();
                    String[] colName = new String[cols];
                    for(int i =0;i<cols;i++)
                    {
                  	  colName[i]=rsmd.getColumnName(i+1);
                    }
                    model.setColumnIdentifiers(colName);
                    
                    String pnr_no,ticket_id,f_code,jny_date,jny_time,src1,dst1;
                    
                    while(rs.next())
                    {
                  	  pnr_no=rs.getString(1);
                  	  ticket_id=rs.getString(2);
                  	  f_code=rs.getString(3);
                  	  jny_date=rs.getString(4);
                  	  jny_time=rs.getString(5);
                  	  src1=rs.getString(6);
                  	  dst1=rs.getString(7);
                  	  String[] row = {pnr_no,ticket_id,f_code,jny_date,jny_time,src1,dst1};
                  	  model.addRow(row);
                    }			
                    
					
		}catch(Exception e){}
            }
	});
		
	setSize(860,600);
        setLocation(400,200);
	setVisible(true);
		
    }
}