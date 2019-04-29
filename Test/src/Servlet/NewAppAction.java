package Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.AppService;
import Service.Imp.AppServiceImp;
import entity.app;

public class NewAppAction extends HttpServlet{

	public void service(HttpServletRequest hsr, HttpServletResponse hsrr) throws ServletException, IOException {
		
//		List<app> list = new ArrayList<app>();
		String appname = hsr.getParameter("appname");
		String appdescri = hsr.getParameter("appdescri");
		
		String provider = hsr.getParameter("provider");
		
		app a = new app(appname,appdescri,provider);
		AppService as = new AppServiceImp();
		as.newApp(a);
//		list.add(a);
//		hsr.setAttribute("abc", a);
		
		hsr.getRequestDispatcher("/showApp").forward(hsr, hsrr);
	}
}
