package com.collections.programs;

import java.util.TreeSet;

class Employee implements Comparable {
	String name;
	int eid;

	public Employee(String name, int eid) {
		super();
		this.name = name;
		this.eid = eid;
	}

	public String toString() {
		return eid + "       " + name;
	}

	public int compareTo(Object obj) {
		int id1 = this.eid;
		String name1 = this.name;
		Employee e = (Employee) obj;
		int id2 = e.eid;
		String name2 = e.name;

		if (id1 > id2) {
			return 1;
		} else if (id1 < id2) {
			return -1;
		} else {
			return 0;
		}
	}

}

public class ComparableInterface {

	public static void main(String[] args) {

		Employee e1 = new Employee("nag", 100);
		Employee e2 = new Employee("balaiah", 200);
		Employee e3 = new Employee("chiru", 50);
		Employee e4 = new Employee("venki", 150);
		Employee e5 = new Employee("nag", 100);

		TreeSet<Employee> t1 = new TreeSet<>();
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);

//		System.out.println(t1);

		for (Employee emp : t1) {
			System.out.println(emp.eid + "   " + emp.name);
		}
	}

}
