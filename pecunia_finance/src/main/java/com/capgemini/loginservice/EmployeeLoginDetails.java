package com.capgemini.loginservice;

public class EmployeeLoginDetails<Logindao> {
	Logindao lda=new Logindao();
	
	public class Serviceimp1 {
		public int servicemethod(String EmployeeUsername,String EmployeePassword) {
	return lda.loginmethod(EmployeeUsername, EmployeePassword);
	}
	
	}
}
	