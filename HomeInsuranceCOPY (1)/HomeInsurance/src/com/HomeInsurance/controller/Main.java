package com.HomeInsurance.controller;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main mainObj=new Main();
		mainObj.input();
//		Customer Obj= new Customer();
//		 NewUserRegistration Obj2= new  NewUserRegistration();
		}
	      public void input()
	      { Scanner sc=new Scanner(System.in);
	       SignInController Obj=new SignInController();
	    	System.out.println("This system is for applying home insurance");
	  		System.out.print("1-Sign In 2-Sign Up: ");
	  		int options=sc.nextInt();
	  		Obj.optionChoose(options);
	      }
		

	}


