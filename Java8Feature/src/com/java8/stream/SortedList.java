package com.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class EmployeeSort {

	int empId;
	String empName;
	float empSal;

	public EmployeeSort(int empId, String empName, float empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
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

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

}

public class SortedList {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Santosh", "Priyanka", "Rani", "Nitin", "Sneha", "Ranjal");
		List<String> result = list.stream().sorted().collect(Collectors.toList());
		List<String> result2 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		List<String> result3 = list.stream().sorted((s1, s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(result);
		System.out.println(result2);
		System.out.println("result3 : " + result3);

		List<Integer> list2 = Arrays.asList(100, 45, 800, 30, 50, 60);
		Integer result4 = list2.stream().max(Comparator.comparing(Integer::intValue)).get();
		System.out.println("result4 : " + result4);

		List<EmployeeSort> empList = new ArrayList<>();
		empList.add(new EmployeeSort(102, "Santosh", 30000));
		empList.add(new EmployeeSort(104, "Mantosh", 70000));
		empList.add(new EmployeeSort(103, "Rantosh", 40000));
		empList.add(new EmployeeSort(101, "Aantosh", 20000));
		empList.add(new EmployeeSort(108, "Zantosh", 90000));
		empList.add(new EmployeeSort(110, "Kantosh", 10000));
		empList.add(new EmployeeSort(104, "Mantosh", 70000));

		List<EmployeeSort> resuList1 = empList.stream().sorted(Comparator.comparing(EmployeeSort::getEmpSal))
				.collect(Collectors.toList());
		System.out.println("resuList1 :  " + resuList1);
		System.out.println();

		/* In Set no guarantee for order for sorting not recommended. */
		Set<EmployeeSort> resuList2 = empList.stream().sorted(Comparator.comparing(EmployeeSort::getEmpSal))
				.collect(Collectors.toSet());
		System.out.println("resuList1  " + resuList2);

	}

}
