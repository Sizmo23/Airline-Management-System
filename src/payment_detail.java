

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;
//import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;

public class payment_detail extends JFrame{ //Fifth

    JTextField textField;
    JTable table;
    JLabel Sector;
    JLabel label;
    private JButton btnClear;
    private JScrollPane scrollPane;

    public static void main(String[] args) {
        new payment_detail();
    }

    public payment_detail(){
	initialize();
    }

    private void initialize(){
        setTitle("payment_detailS");
	getContentPane().setBackground(Color.WHITE);
	setSize(860,486);
	getContentPane().setLayout(null);
		
	JLabel Fcode = new JLabel("PNR NO");
	Fcode.setFont(new Font("Tahoma", Font.PLAIN, 17));
	Fcode.setBounds(60, 160, 150, 26);
	getContentPane().add(Fcode);
		
	textField = new JTextField();
	textField.setBounds(200, 160, 150, 26);
	getContentPane().add(textField);
        
        scrollPane = new JScrollPane();
        scrollPane.setBounds(45, 284, 766, 256);
        getContentPane().add(scrollPane);
	
        table = new JTable();
        scrollPane.setViewportView(table);
		
	JButton Show = new JButton("SHOW");
	Show.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Show.setBackground(Color.BLACK);
        Show.setForeground(Color.WHITE);
	Show.setBounds(200, 210, 150, 26);
	getContentPane().add(Show);
		
	Sector = new JLabel("PAYMENT DETAILS");
	Sector.setForeground(Color.BLUE);
	Sector.setFont(new Font("Tahoma", Font.PLAIN, 31));
	Sector.setBounds(51, 17, 300, 39);
	getContentPane().add(Sector);
		
	label = new JLabel("");
	//label.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/payment.png")));
	label.setBounds(425, 15, 239, 272);
	getContentPane().add(label);
	
	btnClear = new JButton("CLEAR");
	
	btnClear.setForeground(Color.WHITE);
	btnClear.setFont(new Font("Tahoma", Font.PLAIN, 17));
	btnClear.setBackground(Color.BLACK);
	btnClear.setBounds(45, 210, 150, 26);
	getContentPane().add(btnClear);
	
        setVisible(true);
		
	Show.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
		
                try {
                    String code  = textField.getText();
                    
                    conn c = new conn();
                    if(code.equals(""))
                    {
                    	String str = "select * from payment";
    					
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
    	                
    	                String pnr_no,paid_amt,pay_date,cheque_no,card_no,ph_no;
    	                while(rs.next())
    	                {
    	              	  pnr_no=rs.getString(1);
    	              	  paid_amt=rs.getString(2);
    	              	  pay_date=rs.getString(3);
    	              	  cheque_no=rs.getString(4);
    	              	  card_no=rs.getString(5);
    	              	  ph_no=rs.getString(6);
    	              	  String[] row = {pnr_no,paid_amt,pay_date,cheque_no,card_no,ph_no};
    	              	  model.addRow(row);
    	                }
                    }
                    else
                    {
                    	String str = "select pnr_no,paid_amt,pay_date,cheque_no,card_no,ph_no from payment where pnr_no = '"+code+"'";
    					
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
    	                
    	                String pnr_no,paid_amt,pay_date,cheque_no,card_no,ph_no;
    	                while(rs.next())
    	                {
    	              	  pnr_no=rs.getString(1);
    	              	  paid_amt=rs.getString(2);
    	              	  pay_date=rs.getString(3);
    	              	  cheque_no=rs.getString(4);
    	              	  card_no=rs.getString(5);
    	              	  ph_no=rs.getString(6);
    	              	  String[] row = {pnr_no,paid_amt,pay_date,cheque_no,card_no,ph_no};
    	              	  model.addRow(row);
    	                }
                    }       		
		}catch(SQLException e) {
                    e.printStackTrace();
                }
            }
	});
	
	btnClear = new JButton("CLEAR");
	btnClear.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) 
		{
			table.setModel(new DefaultTableModel());
		}
	});
	btnClear.setForeground(Color.WHITE);
	btnClear.setFont(new Font("Tahoma", Font.PLAIN, 17));
	btnClear.setBackground(Color.BLACK);
	btnClear.setBounds(45, 210, 150, 26);
	getContentPane().add(btnClear);
		
	setSize(960,590);
        setLocation(400,200);
	setVisible(true);

    }
}
