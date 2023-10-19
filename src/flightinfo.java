import java.awt.EventQueue;

import javax.swing.JFrame;

//import net.proteanit.sql.DbUtils;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;
import javax.swing.table.*;

public class flightinfo extends JFrame
{
  private JTextField textField;
  private JTable table;
  
  public static void main(String[] args){		 
	new flightinfo().setVisible(true);    
  }
  
  public flightinfo(){
      
      getContentPane().setBackground(Color.WHITE);
      getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(860,523);
	getContentPane().setLayout(null);
	setVisible(true);
		
	JLabel Fcode = new JLabel("FLIGHT CODE");
	Fcode.setFont(new Font("Tahoma", Font.PLAIN, 17));
      Fcode.setBounds(10, 151, 200, 30);
	getContentPane().add(Fcode);
	
		
	JLabel FlightDetails = new JLabel("FLIGHT INFORMATION");
	FlightDetails.setFont(new Font("Tahoma", Font.PLAIN, 31));
	FlightDetails.setForeground(new Color(100, 149, 237));
	FlightDetails.setBounds(50, 20, 570, 35);
	getContentPane().add(FlightDetails);
		
	textField = new JTextField();
      textField.setBounds(134, 154, 103, 30);
	getContentPane().add(textField);
		
	JButton btnShow = new JButton("SHOW");
	btnShow.setFont(new Font("Tahoma", Font.PLAIN, 20));

      btnShow.setBounds(21, 243, 120, 30);
	getContentPane().add(btnShow);
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(298, 66, 576, 419);
	getContentPane().add(scrollPane);
	
	table = new JTable();
	scrollPane.setViewportView(table);
      
      btnShow.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent ae) {
          	  
              String code = textField.getText();
              
              try {
                  conn c = new conn();
                  String str = "select f_code,f_name,src,dst,capacity,class_code,class_name from flight ,sector where f_code = '"+code+"'";
                  
                  ResultSet rs = c.s.executeQuery(str);
                  ResultSetMetaData rsmd = rs.getMetaData();
                  DefaultTableModel model = (DefaultTableModel) table.getModel();
                  
                  int cols = rsmd.getColumnCount();
                  String[] colName = new String[cols];
                  for(int i =0;i<cols;i++)
                  {
                	  colName[i]=rsmd.getColumnName(i+1);
                  }
                  model.setColumnIdentifiers(colName);
                  
                  String f_code,f_name,src,dst,capacity,class_code,class_name;
                  
                  while(rs.next())
                  {
                	  f_code=rs.getString(1);
                	  f_name=rs.getString(2);
                	  src=rs.getString(3);
                	  dst=rs.getString(4);
                	  capacity=rs.getString(5);
                	  class_code=rs.getString(6);
                	  class_name=rs.getString(7);
                	  String[] row = {f_code,f_name,src,dst,capacity,class_code,class_name};
                	  model.addRow(row);
                  }
                  
              }catch(SQLException e){
                  e.printStackTrace();
              }
          }
      });
      
      JButton btnClear = new JButton("CLEAR");
  	btnClear.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) 
          {
          	table.setModel(new DefaultTableModel());
          }
         });
  	btnClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
  	btnClear.setBounds(168, 243, 120, 30);
  	getContentPane().add(btnClear);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
  	setSize(900,650);
        setVisible(true);
        setLocation(400,200);
		
  }
}