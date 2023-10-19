import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;
//import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;

public class employeelist extends JFrame{
    JLabel ReservationDetails,label,label1;
    private JTextField textField;
    private JTable table;
    private JTable table_1;
    private JScrollPane scrollPane;

    public static void main(String[] args){
        new employeelist();
    }
    
    public employeelist(){
        
        setTitle("employeelist");
	getContentPane().setBackground(Color.WHITE);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	getContentPane().setLayout(null);

	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
	ReservationDetails = new JLabel("EMPLOYEE LIST");
	ReservationDetails.setForeground(Color.BLUE);
	ReservationDetails.setFont(new Font("Tahoma", Font.PLAIN, 31));
	ReservationDetails.setBounds(255, 27, 244, 31);
	getContentPane().add(ReservationDetails);
	
	JLabel lblNewLabel = new JLabel("Reference Number: ");
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblNewLabel.setBounds(139, 87, 167, 31);
	getContentPane().add(lblNewLabel);
	
	textField = new JTextField();
	textField.setBounds(316, 91, 117, 28);
	getContentPane().add(textField);
	textField.setColumns(10);
	
	table = new JTable();
	table.setBounds(553, 208, -352, 124);
	getContentPane().add(table);
	
	scrollPane = new JScrollPane();
	scrollPane.setBounds(25, 208, 790, 294);
	getContentPane().add(scrollPane);
	
	table_1 = new JTable();
	scrollPane.setViewportView(table_1);
	
	JButton btnNewButton = new JButton("SHOW");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{
			String ref = textField.getText();
			
			try
			{
				conn c = new conn();
				if(ref.equals(""))
				{
					String str = "select * from employee";
					ResultSet rs = c.s.executeQuery(str);
	                ResultSetMetaData rsmd = rs.getMetaData();
	                DefaultTableModel model = (DefaultTableModel) table_1.getModel();
	                
	                int cols = rsmd.getColumnCount();
	                String[] colName = new String[cols];
	                for(int i =0;i<cols;i++)
	                {
	              	  colName[i]=rsmd.getColumnName(i+1);
	                }
	                model.setColumnIdentifiers(colName);
	                
	                String exp,address,refer,name,gender,occup,salary;
	                while(rs.next())
	                {
	              	  exp=rs.getString(1);
	              	  address=rs.getString(2);
	              	  refer=rs.getString(3);
	              	  name=rs.getString(4);
	              	  gender=rs.getString(5);
	              	  occup=rs.getString(6);
	              	  salary=rs.getString(7);
	              	  String[] row = {exp,address,refer,name,gender,occup,salary};
	              	  model.addRow(row);
	                }
				}
				else
				{
					String str = "select * from employee where reference_number = '"+ref+"'";
	                
					ResultSet rs = c.s.executeQuery(str);
	                ResultSetMetaData rsmd = rs.getMetaData();
	                DefaultTableModel model = (DefaultTableModel) table_1.getModel();
	                
	                int cols = rsmd.getColumnCount();
	                String[] colName = new String[cols];
	                for(int i =0;i<cols;i++)
	                {
	              	  colName[i]=rsmd.getColumnName(i+1);
	                }
	                model.setColumnIdentifiers(colName);
	                
	                String exp,address,refer,name,gender,occup,salary;
	                while(rs.next())
	                {
	              	  exp=rs.getString(1);
	              	  address=rs.getString(2);
	              	  refer=rs.getString(3);
	              	  name=rs.getString(4);
	              	  gender=rs.getString(5);
	              	  occup=rs.getString(6);
	              	  salary=rs.getString(7);
	              	  String[] row = {exp,address,refer,name,gender,occup,salary};
	              	  model.addRow(row);
	                }
				}
			}
			catch(SQLException e1)
			{
				e1.printStackTrace();
			}
		}
	});
	btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{
			table_1.setModel(new DefaultTableModel());
		}
	});
	btnNewButton.setBounds(226, 164, 101, 24);
	getContentPane().add(btnNewButton);
	
	JButton btnClear = new JButton("CLEAR");
	btnClear.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btnClear.setBounds(360, 164, 101, 24);
	getContentPane().add(btnClear);
		
	setSize(860,600);
        setLocation(400,200);
	setVisible(true);
		
    }
}