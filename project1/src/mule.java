import java.sql.*;
public class mule {
	public static void main(String[] args) {
	 try
	    {  
	        Class.forName("com.mysql.cj.jdbc.Driver");  
	        Connection con=DriverManager.getConnection(  
	        "jdbc:mysql://localhost:3306/mulesoft","root","140520");  

	        Statement stmt=con.createStatement();  
	        ResultSet rs=stmt.executeQuery("select * from my_fav_mov");  
	        while(rs.next())  
	        System.out.println(rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+ rs.getString(4)+ " : "+rs.getString(5) );
	        con.close();
	    }

	    catch(Exception e)
	    {
	        System.out.println(e);
	    }

}  

}
