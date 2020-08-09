package edu.uptc.model;

import java.util.ArrayList;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class EmployeeManager {
	ArrayList<Employee> employeeList = new ArrayList<Employee>();

	public EmployeeManager() {
		
	}   
	
	public void addEmployee(int emp_id, String emp_name, String email_emp, long phone_emp){
		Employee emp = new Employee();
		emp.setEmp_id(emp_id);
		emp.setEmp_name(emp_name);
		emp.setEmail_emp(email_emp);
		emp.setPhone_emp(phone_emp);
		employeeList.add(emp);
	}
	
	public ArrayList<Employee> addEmployee2(int emp_id, String emp_name, String email_emp, long phone_emp){
		Employee emp = new Employee();
		emp.setEmp_id(emp_id);
		emp.setEmp_name(emp_name);
		emp.setEmail_emp(email_emp);
		emp.setPhone_emp(phone_emp);
		employeeList.add(emp);
		return employeeList;
	}
	
	public void deleteEmployee(int emp_id){
		employeeList.remove(new Employee(emp_id));
	}
	
	
	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}
	public void modifyEmployee(int emp_id, String emp_name, String email_emp, long phone_emp) {
		for (Employee employee : employeeList) {
			if (employee.getEmp_id()==emp_id) {
				employee.setEmp_name(emp_name);
				employee.setEmail_emp(email_emp);
				employee.setPhone_emp(phone_emp);
			}
			
		}
	}
	
	public int totalEmployee() {
		return employeeList.size();
	}


}
