package com.todoapp.pojo;

public class ToDo {

	String name;

	public ToDo(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ToDo [name=" + name + "]";
	}

}
