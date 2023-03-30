package com.programs.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {

	int eid;
	String ename;
	float esal;
	String eaddress;

	public Employee(int eid, String ename, float esal, String eaddress) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.eaddress = eaddress;
	}

}

public class LamdaWithCollection {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(100, "Santosh", 1110, "karve"));
		empList.add(new Employee(101, "Rahu;", 11155, "fvf karve"));
		empList.add(new Employee(144, "Ganesg", 11177, "bb karve"));
		empList.add(new Employee(106, "Priyana", 11199, "ada karve"));
		empList.add(new Employee(105, "Rani", 11196, "Laca karve"));
		empList.add(new Employee(109, "Sanrha", 1156, " cfsfd karve"));

//		Collections.sort(empList, (e1, e2) -> {
//			//return e1.eid.(e2.eid);
//		});

//		Collections.sort(empList, (p1, p2) -> {
//			return p1.ename.compareTo(p2.ename);
//		});

		for (Employee emp : empList) {
			System.out.println(emp.eid + "    " + emp.ename + "    " + emp.esal + "     " + emp.eaddress);
		}
	}

}
