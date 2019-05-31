package Servlet;
import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;

import Service.BankUserService;

import Service.Imp.BankUserServiceImp;
import Utils.JdbcUtils;

public class pwdreset extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
	    //req.getRequestDispatcher("/bankpwdresetsuc.jsp").forward(req, res);
	    //res.sendRedirect("/bankpwdresetsuc.jsp");
		
		String username = req.getParameter("username");
		String opwd = req.getParameter("opwd");
		String npwd = req.getParameter("npwd");
		//String password = req.getParameter("xyz");
		
		BankUserService us = new BankUserServiceImp();
		
		
		boolean infocomparing = us.resetbankpwd(username, opwd);

		if(infocomparing) {
			//HttpSession session = req.getSession();
			//session.setAttribute("cde", cdk);//
			req.getRequestDispatcher("/jsp/resetPwdSuc.jsp").forward(req, res);
			
			try {  
		         Class.forName("com.mysql.jdbc.Driver");     
		         System.out.println("Success loading Mysql Driver!");  
		        }  
		        catch (Exception e) {  
		          System.out.print("Error loading Mysql Driver!");  
		          e.printStackTrace();  
		        }  
		        try {  
		          Connection connect = JdbcUtils.getConn();  
		               
		          String sql = "update user set password ='" + npwd + "' where name='" + username + "'";
		          PreparedStatement pstmt;                                                       
		          pstmt = (PreparedStatement) connect.prepareStatement(sql);
		          int i =pstmt.executeUpdate();
					if(i>0){
						System.out.println("update sucess");
					}

		          pstmt.close();
		          connect.close();
		          System.out.println("Success connect Mysql server!"); 
		          
		        }  
		        catch (Exception e) {  
		          System.out.print("get data error!");  
		          
		          
		          e.printStackTrace();  
		        }  
			
			
			
		}else {
			req.getRequestDispatcher("/jsp/resetPwdFail.jsp").forward(req, res);
			
		      }  
		}
		
    }


