package com.todoapp.services;

public class UserValidation {
	public boolean isUserValid(String user, String password){
		if(user.equals("Harsh") && password.equals("krishna"))
			return true;
		
		return false;
	}
}
