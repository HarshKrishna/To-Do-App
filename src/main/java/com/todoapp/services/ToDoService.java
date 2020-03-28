package com.todoapp.services;

import java.util.ArrayList;
import java.util.List;

import com.todoapp.pojo.ToDo;

public class ToDoService {

	private static List<ToDo> todos = new ArrayList<ToDo>();
	static{
		todos.add(new ToDo("Learn JSP"));
		todos.add(new ToDo("Complete Web App Development Bootcamp"));
		todos.add(new ToDo("Learn a new Language"));
	}
	public List<ToDo> retriveToDos(){
		return todos;
	}
}
