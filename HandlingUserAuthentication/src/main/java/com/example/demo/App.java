package com.example.demo;

import java.util.Scanner;

public abstract class App {
	public static Scanner sc = new Scanner(System.in);
	public static String Defineid = "sanjeev@yahoo.com";
	public static String Definepass = "abc@123";
	public static String pass;
	public static String id;
	
	public static boolean authenticate() {
		if(id.equals(Defineid) && pass.equals(Definepass))
			return true;
		else return false;
	}
	
	static void inputID() {
		System.out.println("Enter UserName: ");
		id=sc.next();	
	}
	
	static void inputPassword() {
		System.out.println("Enter Password: ");
		pass=sc.next();
	}
	
}

