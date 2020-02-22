package com.capgemini.pecuniafinance.bean;
/* This module s an employee module Bean layer basically define classes and called in DAO layer */
public class EmployeeLoginDetails {

	private String employeeId;

	private String employeeName;

	private String employeeBranchId;
	private String employeeDesignation;

	private String employeeUsername;

	private String employeePassword;
	

	public EmployeeLoginDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	@Override
	public String toString() {
		return "EmployeeLoginDetails [employeeId=" + employeeId + ", employeeName=" + employeeName
				+ ", employeeBranchId=" + employeeBranchId + ", employeeDesignation=" + employeeDesignation
				+ ", employeeUsername=" + employeeUsername + ", employeePassword=" + employeePassword
				+ ", getEmployeeId()=" + getEmployeeId() + ", getEmployeeName()=" + getEmployeeName()
				+ ", getEmployeeBranchId()=" + getEmployeeBranchId() + ", getEmployeeDesignation()="
				+ getEmployeeDesignation() + ", getEmployeeUsername()=" + getEmployeeUsername()
				+ ", getEmployeePassword()=" + getEmployeePassword() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeBranchId() {
		return employeeBranchId;
	}

	public void setEmployeeBranchId(String employeeBranchId) {
		this.employeeBranchId = employeeBranchId;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public String getEmployeeUsername() {
		return employeeUsername;
	}

	public void setEmployeeUsername(String employeeUsername) {
		this.employeeUsername = employeeUsername;
	}

	public String getEmployeePassword() {
		return employeePassword;
	}

	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}

	
	

}
