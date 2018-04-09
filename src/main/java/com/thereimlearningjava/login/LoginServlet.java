package com.thereimlearningjava.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thereimlearningjava.todo.TodoService;
//Redirected by default here (see web.xml welcome-page)
/**
 * Login servlet
 * @author Alex Sergeenko
 *
 */
@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet {
	//Services
	private LoginService userValidationService = new LoginService();
	private TodoService todoService = new TodoService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		boolean isUserValid = userValidationService.isUserValid(name, password);
		
		if (isUserValid) {
			request.getSession().setAttribute("name", name);//set attribute to the session(!)
			response.sendRedirect("list-todos.do");
		} else 	{
			request.setAttribute("errorMessage", "Invalid credentials");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);	
		}

		
		
	}
}
