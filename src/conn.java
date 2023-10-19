
import java.sql.*;  

public class conn
{
    Connection c;
    Statement s;
    
    public conn()
    {  
        try
        {  
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///airline","root","1234");
            s = c.createStatement();
            if(c == null)
            {
            	System.out.println("JDBC Connection not established.");
            }
            else
            {
            	System.out.println("Established");
            }

        }
        catch(Exception e)
        { 
            System.out.println(e);
        }  
    }
}  