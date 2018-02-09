package com.ps.servlet;

public class UserValidationService {
	public static boolean isValidUser(String userName, String pwd){
		if(userName.equals("dummy") && pwd.equals("dummy")){
			return true;
		}
		return false;
	}
}
