package com.capgemini.pecuniafinance.ui;

import java.util.Scanner;

import org.omg.CORBA.ServiceDetail;

public class UserInterface {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Username");
	String Username =sc.next();
	System.out.println("Enter the password");
	String password=sc.next();
	ServiceDetail sp=new ServiceDetail();
	int ap=sp.servicemethod(Username,password);
	if(ap==1) {
		System.out.println("Login Sucessfully");
	}
	else {
		System.out.println("CLICK ON FORGOT PASSWORD");
	       
        System.out.println("Enter the new password");
        password=sc.next();
        System.out.println("Password changed successfully");
	}
	
	
	}

		  
		  
		  
	  
	  
	  
	  
	  
	  
	  
  }	
	
  
