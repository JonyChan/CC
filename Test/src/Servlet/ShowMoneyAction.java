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

public class ShowMoneyAction extends HttpServlet{

	public void service(HttpServletRequest hsr, HttpServletResponse hsrr) throws ServletException, IOException {
		user u = null;
		HttpSession session = hsr.getSession();
		String name = (String) session.getAttribute("abc");
		UserService us = new UserServiceImp();
		u = us.selectOne(name);
		session.setAttribute("mo", u.getMoney());
		if(session==null) {
			hsr.getRequestDispatcher("/Test/login.jsp").forward(hsr, hsrr);
		}else {
		hsr.getRequestDispatcher("/jsp/bank/wallet.jsp").forward(hsr, hsrr);
	}
	}
}
