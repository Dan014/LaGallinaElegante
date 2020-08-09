package edu.uptc.model;

import java.io.Serializable;

public class Employee implements Serializable {

	private int emp_id;
	private String emp_name;
	private String email_emp;
	private long phone_emp;
	
	public Employee() {
		super();
	}
	
	public Employee(int emp_id) {
		super();
		this.emp_id = emp_id;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmail_emp() {
		return email_emp;
	}
	public void setEmail_emp(String email_emp) {
		this.email_emp = email_emp;
	}
	public long getPhone_emp() {
		return phone_emp;
	}
	public void setPhone_emp(long phone_emp) {
		this.phone_emp = phone_emp;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee emp = (Employee)obj;
		return emp_id==emp.getEmp_id();
	}

}
