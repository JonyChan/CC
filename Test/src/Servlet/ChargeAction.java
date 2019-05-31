package Servlet;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Utils.JdbcUtils;
import entity.app;

public class ChargeAction extends HttpServlet{

	public void service(HttpServletRequest hsr, HttpServletResponse hsrr) throws ServletException, IOException {
		
		HttpSession session = hsr.getSession();
		String name = (String) session.getAttribute("abc");
		session.setAttribute("abc", name);
		System.out.println(name);
		String appna = hsr.getParameter("appname");
		System.out.println(appna);
		Connection conn = null;
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;
		ResultSet rs1 = null;
		ResultSet rs2 = null;
		//BalanceChange b = null;
		int ba = 0;
		String provider = null;
try {
			
			conn=JdbcUtils.getConn();
			Statement stmt = conn.createStatement();  
	          ResultSet rs = stmt.executeQuery("select money from user where name = '"+ name + "'");  
	          
	          
	          while (rs.next()) {  
	             ba = rs.getInt("money") - 5;  
	         
	          }  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
try {
	
	conn=JdbcUtils.getConn();
	Statement stmt = conn.createStatement();  
//    ResultSet rs = stmt.executeQuery("update user set money='" + ba + "' where name='" + name + "'");  
    stmt.executeUpdate("update user set money='" + ba + "' where name='" + name + "'");  
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

try {
	
	conn=JdbcUtils.getConn();
	Statement stmt = conn.createStatement();  
      ResultSet rs = stmt.executeQuery("select money from user where name = 'admin' ");  
      
      
      while (rs.next()) {  
         ba = rs.getInt("money") + 2;  
     
      }  
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try {

conn=JdbcUtils.getConn();
Statement stmt = conn.createStatement();  
//ResultSet rs = stmt.executeQuery("update user set money='" + ba + "' where name='" + appna + "'");  
stmt.executeUpdate("update user set money='" + ba + "' where name='admin'");  
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

try {
	
	conn=JdbcUtils.getConn();
	Statement stmt = conn.createStatement();  
      ResultSet rs = stmt.executeQuery("select provider from app where appname = '"+ appna +" ' ");  
      
      
      while (rs.next()) {  
         provider = rs.getString("provider") ;  
     
      }  
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try {

conn=JdbcUtils.getConn();
Statement stmt = conn.createStatement();  
//ResultSet rs = stmt.executeQuery("update user set money='" + ba + "' where name='" + name + "'");  
ResultSet rs = stmt.executeQuery("select money from user where name = '"+ provider +"' ");  

while (rs.next()) {  
    ba = rs.getInt("money") + 3;  

 }  

} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}


try {

conn=JdbcUtils.getConn();
Statement stmt = conn.createStatement();  
//ResultSet rs = stmt.executeQuery("update user set money='" + ba + "' where name='" + appna + "'");  
stmt.executeUpdate("update user set money='" + ba + "' where name = '"+ provider +"' ");  
} catch (SQLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}


	hsrr.sendRedirect("http://143.167.9.205:8080/"+appna+"/index.jsp?userName="+name);
//	hsr.getRequestDispatcher(appna+"/app").forward(hsr, hsrr);

	}

}
