package com.ps.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ps.login.LoginService;
import com.ps.todo.TodoService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	
	LoginService userValidationService = new LoginService();
	TodoService todoService = new TodoService();
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.setAttribute("password", request.getParameter("password"));
		request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("name");
		String pwd = request.getParameter("password");
		if(userValidationService.isValidUser(userName, pwd)){
			request.getSession().setAttribute("name", userName);
			
			response.sendRedirect("/list-todo.do");
		} else {
			request.setAttribute("errorMessage", "Invalid credentials. Please try again.");
			request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
		}
	}

}
