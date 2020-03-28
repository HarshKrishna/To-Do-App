package com.todoapp.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todoapp.services.ToDoService;
import com.todoapp.services.UserValidation;

@WebServlet(urlPatterns = "/harsh.co")
public class LoginServlet extends HttpServlet{
	UserValidation service = new UserValidation();
	ToDoService toDoService = new ToDoService();
	@Override
	protected void doGet(HttpServletRequest request, 
						 HttpServletResponse response)
			throws ServletException, IOException {
//				PrintWriter out = response.getWriter();
//				out.println("Hello World! ");
//		System.out.println(request.getParameter("name"));
//		String name = request.getParameter("name");
//		request.setAttribute("name", name);
//		request.setAttribute("password", request.getParameter("password"));
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		
	}
	@Override
	protected void doPost(HttpServletRequest request, 
						 HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		boolean isUserValid = service.isUserValid(name, password);
		if (isUserValid == true){
			request.setAttribute("name", name);
			request.setAttribute("todos", toDoService.retriveToDos());
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		}
		else {
			request.setAttribute("errorMessage", "Either username or password is incorrect.");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		
		
	}	

}
