package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class JdbcUtils {


	private static Connection conn;
	private PreparedStatement ps;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	private static String username = "root"; 
	private static String password = "123456";

	static String url = "jdbc:mysql://localhost:3306/CC"; 
	
	public static Connection getConn(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("driver fail");
			e.printStackTrace();
			System.out.println(e);
		}
		try {
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("conn is " + conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("connection fail");
			conn = null;
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeAll(Connection conn,PreparedStatement ps,ResultSet rs){
		try {
			if(rs!=null)
				rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(ps!=null)
				ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			
			if(conn!=null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
