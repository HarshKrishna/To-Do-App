package com.todoapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.todoapp.services.ToDoService;
import com.todoapp.services.UserValidation;

@WebServlet(urlPatterns = "/todo.co")
public class ToDoServlet extends HttpServlet {
	UserValidation service = new UserValidation();
	ToDoService toDoService = new ToDoService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setAttribute("todos", toDoService.retriveToDos());
		request.getRequestDispatcher("/WEB-INF/views/todos.jsp").forward(request, response);
	}
}
