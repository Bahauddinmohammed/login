package com.capgemini.loginservice;

import com.capgemini.logindao.LoginDAO;

public class Serviceimp1 {
	public int servicemethod(String eid,String pswrd) {
	LoginDAO lda=new LoginDAO();
	return lda.loginmethod(eid, pswrd);
}
}
