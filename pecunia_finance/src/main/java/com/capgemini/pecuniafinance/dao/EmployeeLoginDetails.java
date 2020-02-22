package com.capgemini.pecuniafinance.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeLoginDetails {



	   public class EmployeeLogindao{
		   public int EmployeeLoginmethod(String EmployeeUsername,String Password){
			   
		   
		Scanner s= new Scanner(System.in);
		HashMap<String,String> mydata = new HashMap<String,String>();
			   mydata.put("mdbahauddin1998@gmail.com", "12345678");
			   mydata.put("Kyasaranjith2gmail.com","654321");
			   mydata.put("ravi1512@gmail.com", "123456789");
			   
			   
			   Collection<String>keys =mydata.keySet();
			   Collection<String>values =mydata.values();
			   String str = null;
			   String Pswrd;
			   int z =0;
			   for(String name : keys) {
				boolean a =(keys.equals(EmployeeUsername)&& (values.equals(Password)));   
				int val = (a) ? 1:0;
				switch(val) {
				case 1:
					str ="LOGIN SUCCESSFULLY";
					 z = 1;
					case 0:
						str="LOGIN FAILED";
						System.out.println("Enter the new password");
						Pswrd = s.next();
						mydata.replace(EmployeeUsername, Pswrd);
						System.out.println("Password changed successfully");
						
						return z;
						
						
						
				}
			   }
			return z;
			   
			   
			   
			   
		   }
	   
	   }
}
	   	
	   
	   
	    		  
	    	
	    	
	    	
	    	
	   
	   
	    	
	    	
	    	
