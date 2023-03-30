package com.java8.lamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {

	int empId;
	String empName;
	float empSal;

	public Employee(int empId, String empName, float empSal) {
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

public class EmployeeMaxSalary {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(100, "Santosg", 10000));
		empList.add(new Employee(102, "Nitin", 2));
		empList.add(new Employee(101, "Zoko", 40000));
		empList.add(new Employee(10, "Balu", 100));
		empList.add(new Employee(111, "Tan", 35000));
		empList.add(new Employee(109, "Balu", 35000));

		/* Finding minimum and Maximum salary of employee. */
		Comparator<Employee> compareMethod = (ob1, ob2) -> {

			float I1 = ob1.getEmpSal();
			float I2 = ob2.getEmpSal();
			if (I1 > I2) {
				return 1;
			} else if (I1 < I2) {
				return -1;
			} else {
				return 0;
			}
		};
		Float minSalary = empList.stream().max(compareMethod).map(data -> data.getEmpSal()).get();
		Float minSalary1 = empList.stream().map(data -> data.getEmpSal()).max(Float::compare).get();
		System.out.println(minSalary);

//		Stream<Employee> empListsal = empList.stream().filter(data -> data.empSal > 1000);
//		empListsal.forEach(data -> {
//			System.out.println(data.empId + "   " + data.empName + "   " + data.empSal);
//		});

//		/* Collect only salary. */
//		List<Float> salData = empList.stream().filter(data -> data.empSal > 1000).map(data -> data.empSal)
//				.collect(Collectors.toList());
//		System.out.println("Salary :" + salData);

		Comparator<Employee> maxSalary = (p1, p2) -> {
			if (p1.empSal > p2.empSal) {
				return 1;
			} else if (p1.empSal < p2.empSal) {
				return -1;
			} else {
				return 0;
			}
		};
		Employee maxSalTest = empList.stream().max(maxSalary).get();
		System.out.println(maxSalTest.empId + "   " + maxSalTest.empName + "   " + maxSalTest.empSal);

//		Optional<Employee> empMinsal = empList.stream()
//				.collect(Collectors.minBy(Comparator.comparing(Employee::getEmpSal)));
//
//		Optional<Employee> empMaxsal = empList.stream()
//				.collect(Collectors.maxBy(Comparator.comparing(Employee::getEmpSal)));
//		System.out.println(empMinsal);
//		System.out.println(empMaxsal);

	}

}
