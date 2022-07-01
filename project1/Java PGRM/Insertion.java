import java.sql.*;
public class mule {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306//my_fav_mov";
		String uname = "root";
		String pass = "140520";
		String movie_name = "Golden Eye";
            String actor_name = "john";
		String actress_name = "Lisa";
		String director_name = "Drew";
		String query = "insert into my_fav_mov values(?,?,?,?)"
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con = DriverManager.getConnection( "jdbc:mysql//localhost:3306//my_fav_mov ","root","140520");
	PreparedStatement st = con.preparecreateStatement();
	st.SetString(1, movie_name);
      st.SetString(2, actor_name);
	st.SetString(3,actress_name);
	st.SetString(4,director_name);
	int count = st.executeUpdate();
	System.out.println(count); //shows if the database is affected or not
	st.close();
	con.close();
	}

}
