package com.thereimlearningjava.todo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thereimlearningjava.todo.TodoService;
/**
 * Todo servlet. Application redirects here in case of login was successful
 * @author Alex Sergeenko
 *
 */
@WebServlet(urlPatterns="/list-todos.do")
public class ListTodoServlet extends HttpServlet {
	//Services
	TodoService todoService = new TodoService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setAttribute("todos", todoService.retrieveTodos());
		request.getRequestDispatcher("/WEB-INF/views/list-todos.jsp").forward(request, response);
	}
	
}
