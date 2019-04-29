package Servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginOut extends HttpServlet{

	public void service(HttpServletRequest hsr, HttpServletResponse hsrr) throws IOException {
		HttpSession session = hsr.getSession(false);
		session.removeAttribute("abc");
		hsrr.sendRedirect("/Test/loginCheck");
		return;
	}
}
