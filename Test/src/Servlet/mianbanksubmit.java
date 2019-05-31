package Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Service.CDKService;
import Service.NameCheckService;
import Service.Imp.CDKServiceImp;
import Service.Imp.NameCheckServiceImp;
import Utils.JdbcUtils;

public class mianbanksubmit extends HttpServlet{

		 protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			 
			    String username = req.getParameter("name");
			    String cdk = req.getParameter("cdk");
			    int ba = 0;
				//String password = req.getParameter("xyz");
				
				CDKService us = new CDKServiceImp();
				NameCheckService ns = new NameCheckServiceImp();
				boolean cdkcomparing = us.CDKComparing(cdk);
				boolean namecomparing = ns.NameCheck(username);

				if(cdkcomparing && namecomparing) {
					//HttpSession session = req.getSession();
					//session.setAttribute("cde", cdk);//
					req.getRequestDispatcher("/jsp/bank/sucessremind.jsp").forward(req, res);
					
					
					
					try {  
				          Connection connect = JdbcUtils.getConn();  
				             
				      
				          System.out.println("Success connect Mysql server!");  
				          Statement stmt = connect.createStatement();  
				          ResultSet rs = stmt.executeQuery("select money from user where name = '"+ username + "'");  
				          
				          
				          while (rs.next()) {  
				             ba = rs.getInt("money") + 100;  
				         
				          }  
				        }  
				        catch (Exception e) {  
				          System.out.print("get data error!");  
				          
				          
				          e.printStackTrace();  
				        }  
					
				        try {  
				          Connection connect = JdbcUtils.getConn(); 
				               
				          String sql1 = "update user set money='" + ba + "' where name='" + username + "'";
				          PreparedStatement pstmt1;                                                       
				          pstmt1 = (PreparedStatement) connect.prepareStatement(sql1);
				          int i =pstmt1.executeUpdate();
							if(i>0){
								req.getSession().setAttribute("mo", ba);
								System.out.println("update sucess");
							}

				          pstmt1.close();
				          connect.close();
				          System.out.println("Success connect Mysql server!!!"); 
				          
				        }  
				        catch (Exception e) {  
				          System.out.print("get data error!");  
				          
				          
				          e.printStackTrace();  
				        }
				        
				        
				        
				        int i = 0;  
				        String sql2 = "delete from cdklist where cdk='" + cdk + "'";
				        PreparedStatement pstmt;
				        try {
				        	Connection conn = JdbcUtils.getConn();
				            pstmt = (PreparedStatement) conn.prepareStatement(sql2);
				            i = pstmt.executeUpdate();
				            System.out.println("resutl: " + i);
				            pstmt.close();
				            conn.close();
				        } catch (SQLException e) {
				            e.printStackTrace();
				        }
					
					
				}else {
					req.getRequestDispatcher("/jsp/bank/failremind.jsp").forward(req, res);
				}
		        
		    }

	}
