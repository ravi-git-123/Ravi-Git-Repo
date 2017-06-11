package com.chetak;

import java.util.Comparator;

public class IdSorter implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if(emp1.getId() < emp2.getId())
			return -1;
		else if(emp1.getId() > emp2.getId())
			return +1;
		else
			return 0;
	}
	

}
