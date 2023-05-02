package com.java8.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
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
		empList.add(new Employee(100, "Santosg", 30000));
		empList.add(new Employee(102, "Nitin", 2));
		empList.add(new Employee(101, "Zoko", 40000));
		empList.add(new Employee(10, "Balu", 100));
		empList.add(new Employee(111, "Tan", 3503300));
		empList.add(new Employee(109, "Balu", 35000));
		empList.add(new Employee(130, "Santosg", 20000));
		empList.add(new Employee(103, "Nitin", 222));

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
//		System.out.println(minSalary);

//		Stream<Employee> empListsal = empList.stream().filter(data -> data.empSal > 1000);
//		empListsal.forEach(data -> {
//			System.out.println(data.empId + "   " + data.empName + "   " + data.empSal);
//		});

//		/* Collect only salary. */
//		List<Float> salData = empList.stream().filter(data -> data.empSal > 1000).map(data -> data.empSal)
//				.collect(Collectors.toList());
//		System.out.println("Salary :" + salData);

//		Comparator<Employee> maxSalary = (p1, p2) -> {
//			if (p1.empSal > p2.empSal) {
//				return 1;
//			} else if (p1.empSal < p2.empSal) {
//				return -1;
//			} else {
//				return 0;
//			}
//		};
//		Employee maxSalTest = empList.stream().max(maxSalary).get();
//		System.out.println(maxSalTest.empId + "   " + maxSalTest.empName + "   " + maxSalTest.empSal);

//		Optional<Employee> empMinsal = empList.stream()
//				.collect(Collectors.minBy(Comparator.comparing(Employee::getEmpSal)));
//
//		Optional<Employee> empMaxsal = empList.stream()
//				.collect(Collectors.maxBy(Comparator.comparing(Employee::getEmpSal)));
//		System.out.println(empMinsal);
//		System.out.println(empMaxsal);

		/* Find the Second Highest salary of employee. */
		Comparator<Employee> sortedData = (o1, o2) -> {
			if (o1.getEmpSal() > o2.getEmpSal()) {
				return -1;
			} else if (o1.getEmpSal() < o2.getEmpSal()) {
				return 1;
			} else {
				return 0;
			}
		};
		List<Employee> data = empList.stream().sorted(sortedData).collect(Collectors.toList());
//		System.out.println(data.get(1));

		data.forEach(data2 -> {
			// System.out.println(data2.empId + " " + data2.getEmpName() + " " +
			// data2.getEmpSal());
		});

		Optional<Employee> data3 = empList.stream().sorted(sortedData).skip(3).findFirst();
		// System.out.println(data3);

		/*
		 * Program to convert list of employee to Map, key should be Employee ID value
		 * average Salary.
		 */
		Map<Object, Double> resultmap = empList.stream().collect(Collectors.groupingBy(empdata -> empdata.getEmpId(),
				Collectors.averagingDouble(dataAvg -> dataAvg.getEmpSal())));

		resultmap.forEach((keydata, valData) -> {
			// System.out.println(keydata + " " + valData);
		});

		/*
		 * Program to convert list of employee to Map, key should be Employee ID and
		 * value Salary.
		 */
		Map<Integer, String> empListTomap = empList.stream()
				.collect(Collectors.toMap(Employee::getEmpId, Employee::getEmpName));
		System.out.println(empListTomap);

	}

}
