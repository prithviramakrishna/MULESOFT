import java.sql.*;
public class mule {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306//my_fav_mov";
		String uname = "root";
		String pass = "140520";
		String query = "SELECT movie_name FROM mulesoft.my_fav_mov;";
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con = DriverManager.getConnection( "jdbc:mysql//localhost:3306//my_fav_mov ","root","140520");
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(query);
	
	String ud = "";
	while(rs.next()) {
		ud = rs.getString(1);
		System.out.println(ud);
	}
	st.close();
	con.close();
	}

}
