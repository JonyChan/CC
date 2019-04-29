package Servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class whetherLogin extends HttpServlet{

	public void service(HttpServletRequest hsr,HttpServletResponse hsrr) throws IOException {
		HttpSession session = hsr.getSession(false);
		String name = (String) session.getAttribute("abc");
		if(name == null) {
			hsrr.sendRedirect("/Test/showApp");
			return;
		}
//		session.removeAttribute("abc");
		hsrr.sendRedirect("/Test/jsp/LoginSuc.jsp");
		return;
	}
}
