package com.zensar;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class loginController extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		String requestAction = request.getParameter("requestAction");
		if (requestAction.equalsIgnoreCase("login")) {
			String userName = request.getParameter("user_name");
			String password = request.getParameter("password");
			loginRepository lRepository = new loginRepository();

			boolean loginResult = lRepository.checkLogin(userName, password);
			if (loginResult) {
				try {
					response.sendRedirect("login.jsp");
				} catch (Exception e) {
					System.out.println("Exception Occured:" + e);
				}
			} else {
				request.setAttribute("errorMessage", "Invalid Username/Password");
			}
			try {
				
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				try {
					rd.forward(request, response);
				} catch (Exception e) {

				}

			} catch (Exception e) {
				System.out.println("Exception Occured:" + e);
			}
		}
	}
}
