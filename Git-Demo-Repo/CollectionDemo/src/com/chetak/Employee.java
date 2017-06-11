package com.chetak;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private int salary;
	
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee emp) {
		if(this.id < emp.id)
			return -1;
		else if(this.id > emp.id)
			return +1;
		
		return 0;
	}
	
	public String toString(){
		
		return "  EmpId -> "+id+" EmpName -> "+name+" EmpSal -> "+salary+"\n";
	}
	

}
