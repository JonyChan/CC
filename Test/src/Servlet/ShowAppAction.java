package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.AppService;
import Service.Imp.AppServiceImp;
import entity.app;

public class ShowAppAction extends HttpServlet{
	public void service(HttpServletRequest hsr, HttpServletResponse hsrr) throws ServletException, IOException {
		AppService as = new AppServiceImp();
		List<app> list = as.showAll();
		
		hsr.setAttribute("applist", list);
//		for(app a:list) {
//			System.out.println(a.getAppname());
//		}
//		hsr.getRequestDispatcher("/jsp/LoginSuc.jsp").forward(hsr, hsrr);
		hsr.getRequestDispatcher("/platform.jsp").forward(hsr, hsrr);
		
	}
}
