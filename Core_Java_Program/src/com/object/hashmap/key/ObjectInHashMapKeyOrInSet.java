package com.object.hashmap.key;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * 
 * Employee class object will be store in HashMap of key and in Set value.
 *
 */
class Employee {
	int empId;
	String empName;

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId, empName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(empName, other.empName);
	}

//	public int hashCode() {
//		return Objects.hash(empId, empName);
//	}
//
//	public boolean equals(Object object) {
//		Employee employee = (Employee) object;
//
//		try {
//			if (empName.equals(employee.getEmpName()) && empId == employee.getEmpId()) {
//				return true;
//			} else {
//				return false;
//			}
//		} catch (Exception e) {
//			return false;
//		}
//	}

}

public class ObjectInHashMapKeyOrInSet {

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(10);

		Employee employee1 = new Employee(10, "Santosh");
		Employee employee2 = new Employee(10, "San1tosh");

		Map<Employee, String> hm = new HashMap<>();
		hm.put(employee1, "First");
		hm.put(employee2, "Second");

		Set<Employee> set = new HashSet<>();
		set.add(employee1);
		set.add(employee2);
		System.out.println(hm.size());
		System.out.println(set.size());
	}

}
