package com.capgemini.logindao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class LoginDAO {
	public int loginmethod(String email_id,String password){
		Scanner s=new Scanner(System.in);
	HashMap<String,String> mydata=new HashMap<String,String>();
	mydata.put("pavithra@gmail.com", "12345");
	mydata.put("kyasaranjith@gmail.com", "54321");
	mydata.put("akkirajubhavana@gmail.com", "987654");
	Collection<String> keys = mydata.keySet();
	Collection<String> values= mydata.values();
	

	String str = null;
	String pswrd;
int z = 0;

	for(String name : keys) {
	 boolean    a= (keys.equals(email_id)&& (values.equals(password)));
	 int val = (a) ? 1 : 0;
	    switch(val) {
	    case 1:
	    	str="LOGIN SUCCESFULLY";
	    	z=1;
		case 0:
	    str= "Login failed";
	    z= 0;
	    
	    /*System.out.println("CLICK ON FORGOT PASSWORD");
	       
	        System.out.println("Enter the new password");
	        pswrd=s.next();
	        mydata.replace(email_id, pswrd);
	        System.out.println("Password changed successfully");
	    }*/
	     
	}
}
return z;	
	}
}
