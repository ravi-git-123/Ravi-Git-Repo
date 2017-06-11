package com.chetak;

public class Employee {
	private int id;
	private String name;
	private String email;
	private String address;
	
	Employee emp;
	
	public Employee() {
		super();
	}
	public Employee(int id, String name, String email, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	
	
	@Override
	public boolean equals(Object emp1) {
		if(emp1 instanceof Employee)
		{
			emp = (Employee)emp1;
			if(this.id == emp.id)
				return true;
			
		}
			
		return false;
	}
	
//	hashcode and equals method will impact on performance if they don't follow the contract rule
	
	
//	Hashcode is not overrided correctly.
	/*@Override
	public int hashCode() {
		return 1;
	}*/
	
// Hashcode is overrided correctly.
	
	/*@Override
	public int hashCode() {
		return id;
	}*/
	
	@Override
	public String toString() {
		return "Emp-Id : "+id+" Emp-Name : "+name+" Emp-Email : "+email+"Emp-Address "+address;
	}
	
	
}
