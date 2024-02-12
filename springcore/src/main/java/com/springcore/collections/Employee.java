package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private String employeeName;
	private List<String> phoneNumbers;
	private Set<String> employeeAdresses;
	private Map<String, String> courses;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public Set<String> getEmployeeAdresses() {
		return employeeAdresses;
	}
	public void setEmployeeAdresses(Set<String> employeeAdresses) {
		this.employeeAdresses = employeeAdresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Employee(String employeeName, List<String> phoneNumbers, Set<String> employeeAdresses,
			Map<String, String> courses) {
		super();
		this.employeeName = employeeName;
		this.phoneNumbers = phoneNumbers;
		this.employeeAdresses = employeeAdresses;
		this.courses = courses;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", phoneNumbers=" + phoneNumbers + ", employeeAdresses="
				+ employeeAdresses + ", courses=" + courses + "]";
	}
	
	
	
}
