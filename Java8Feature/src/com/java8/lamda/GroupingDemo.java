package com.java8.lamda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class GroupingTest {

	public void testGroup(List<EmployeeGroup> empList) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(7);
		list.add(11);
		list.add(5);
		list.add(10);
		list.add(11);
		list.add(5);
		list.add(3);
		list.add(5);
		list.add(25);

//		/* Occurrence of Each Element in array. */
//		Map<Integer, Long> result1 = list.stream().collect(Collectors.groupingBy(data -> data, Collectors.counting()));
//		Map<Integer, Long> result2 = list.stream()
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		result1.forEach((keyD, valD) -> {
//			System.out.println(keyD + "    " + valD);
//		});
//
//		/* Grouping by Name. */
//		Map<Object, List<EmployeeGroup>> groupResult = empList.stream()
//				.collect(Collectors.groupingBy(data -> data.empName));

		Comparator<EmployeeGroup> compareEmp = (o1, o2) -> {
			if (o1.getEmpSal() > o2.getEmpSal()) {
				return 1;
			} else if (o1.getEmpSal() < o2.getEmpSal()) {
				return -1;
			} else {
				return 0;
			}
		};

		/* Get Max salary according to department wise. */
		Map<Object, Optional<EmployeeGroup>> resultMap = empList.stream().collect(Collectors.groupingBy(
				data -> data.getEmpDept(), Collectors.maxBy(Comparator.comparing(EmployeeGroup::getEmpSal))));

		Map<Object, Optional<EmployeeGroup>> resultMap1 = empList.stream()
				.collect(Collectors.groupingBy(data -> data.getEmpDept(), Collectors.maxBy(compareEmp)));

		resultMap1.entrySet().forEach(data -> {
			System.out.println(data.getKey() + "         " + data.getValue());
		});

	}

	/**
	 * o/p : B = [1, 6, 8], A = [2, 4], D =[3, 10]
	 */
	public void mapGroupDemo() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "B");
		map.put(2, "A");
		map.put(3, "D");
		map.put(4, "A");
		map.put(5, "F");
		map.put(6, "B");
		map.put(7, "C");
		map.put(8, "B");
		map.put(9, "E");
		map.put(10, "D");
		map.put(11, "X");

		Map<String, List<Integer>> resultMap = map.entrySet().stream().collect(Collectors
				.groupingBy(data -> data.getValue(), Collectors.mapping(data1 -> data1.getKey(), Collectors.toList())));
		resultMap.forEach((keyD, ValD) -> {
			System.out.println(keyD + "  Map Grouping  " + ValD);
		});
	}
}

public class GroupingDemo {

	public static void main(String[] args) {
		GroupingTest groupingTest = new GroupingTest();
		List<EmployeeGroup> empList = new ArrayList<EmployeeGroup>();
		empList.add(new EmployeeGroup(100, "Santosg", 10000, "civil"));
		empList.add(new EmployeeGroup(102, "Nitin", 2, "IT"));
		empList.add(new EmployeeGroup(101, "Zoko", 40000, "Instr"));
		empList.add(new EmployeeGroup(10, "Balu", 100, "EXTC"));
		empList.add(new EmployeeGroup(111, "Tan", 28000, "IT"));
		empList.add(new EmployeeGroup(178, "Kalu", 35000, "Computer"));
		empList.add(new EmployeeGroup(103, "Nitin", 45000, "EXTC"));
		empList.add(new EmployeeGroup(109, "Balu", 75000, "Mech"));
		empList.add(new EmployeeGroup(108, "Raghu", 75, "EXTC"));
		groupingTest.testGroup(empList);
	//	groupingTest.mapGroupDemo();

	}
}

class EmployeeGroup {

	int empId;
	String empName;
	float empSal;
	String empDept;

	public EmployeeGroup(int empId, String empName, float empSal, String empDept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empDept = empDept;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
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
		return "EmployeeGroup [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empDept=" + empDept
				+ "]";
	}

}
