package com.bookapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.model.User;
import com.bookapp.dao.UserDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email_id=request.getParameter("email_id");
		String password=request.getParameter("password");
		
		User user=new User();
		user.setEmailId(email_id);
		user.setPassword(password);
		
		UserDAO dao=new UserDAO();
		try{
			boolean flag= dao.login(user);
		if(flag=true){
			response.sendRedirect("SuccessfulLogin.jsp");
		}
		else{
			response.sendRedirect("LoginFailed.jsp");
		}
	}catch(Exception e){
		e.printStackTrace();
	}

}
	}
	


