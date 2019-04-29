package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Service.UserService;
import Service.Imp.UserServiceImp;
import entity.user;

public class LoginAction extends HttpServlet{
	
	protected void service(HttpServletRequest hsr,HttpServletResponse hsrr) throws ServletException, IOException {
		
		String name = hsr.getParameter("abc");
		String password = hsr.getParameter("xyz");
		user u = new user(name,password);
		
		UserService us = new UserServiceImp();
		boolean loginSuc = us.login(name, password);
		if(loginSuc) {
			HttpSession session = hsr.getSession();
			session.setAttribute("abc",name);
//			System.out.println(u.getMoney());
//			session.setAttribute("bc", u.getMoney());
			hsr.getRequestDispatcher("/showApp").forward(hsr, hsrr);
			
		}else {
			hsr.getRequestDispatcher("/jsp/error.jsp").forward(hsr, hsrr);
		}
	}
}
