package com.bookapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.dao.BookDAO;
import com.bookapp.model.Book;

/**
 * Servlet implementation class DisplayBooksServlet
 */
@WebServlet("/DisplayBooksServlet")
public class DisplayBooksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayBooksServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BookDAO dao=new BookDAO();
		
		
		
		try {
		List<Book>	books = dao.findAllBooks();
		if(books.size()>0){
			RequestDispatcher rd=request.getRequestDispatcher("DisplayBooks.jsp");
			request.setAttribute("books", books);
			rd.forward(request,response);
			
		}
		else{
			response.sendRedirect("NoBookFound.jsp");
		}
		
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	
					
		
		
	}

}
