package Servlet;
import java.sql.*;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Service.UserService;
import Service.Imp.UserServiceImp;
import entity.user;

public class RegisterAction extends HttpServlet{

	protected void service(HttpServletRequest hsr,HttpServletResponse hsrr) throws ServletException, IOException {
		
		String name = hsr.getParameter("abc");
		String password = hsr.getParameter("xyz");
		
		
		
		
		UserService us = new UserServiceImp();

			
			user u = new user(name,password,"100");
			us.regist(u);

			
			hsr.getRequestDispatcher("/login.jsp").forward(hsr, hsrr);
		}
		
		
	
}
