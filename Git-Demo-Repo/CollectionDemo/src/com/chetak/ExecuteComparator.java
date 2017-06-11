package com.chetak;

import java.util.ArrayList;
import java.util.Collections;

public class ExecuteComparator {

	public static void main(String[] args) {
		Employee emp1 = new Employee(10, "Ravi", 5000);
		Employee emp2 = new Employee(5, "Ravindra", 15000);
		Employee emp3 = new Employee(20, "Akash", 10000);
		Employee emp4 = new Employee(30, "Ganesh", 8000);
		Employee emp5 = new Employee(8, "Pushpendra", 4000);
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		Collections.sort(empList, new SalarySorter());;
		System.out.println(empList);
	}

}
