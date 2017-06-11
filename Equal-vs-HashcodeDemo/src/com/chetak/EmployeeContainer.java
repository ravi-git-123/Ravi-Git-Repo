package com.chetak;

import java.util.HashMap;

public class EmployeeContainer {
	HashMap<Integer, Employee> hm = new HashMap<Integer,Employee>();
	long startTime = System.currentTimeMillis();
	long endTime;
	
	public long performanceCalculation(){
	
		for(int i=1; i<1000000;i++){
			
			Employee emp = new Employee(i, "emp"+i, "email"+i, "address"+1);
			hm.put(i, emp);
		
		}
		
		endTime = System.currentTimeMillis();
		
		return (endTime-startTime);
	}
	

}
