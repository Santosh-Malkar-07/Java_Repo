package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.crypto.Data;

/**
 * The operations which return another stream as a result are called
 * intermediate operations.
 * 
 * @Stream.filter() @Stream.map() @Stream.sorted() @Stream.flatMap() @Stream.distinct() @Stream.limit() @Stream.skip() @Stream.peek()
 */
class Intermediate_OR_Non_TerminalOperation {

	public void TestIntermediateOperation() {
		List<String> list = new ArrayList<String>();
		list.add("Neema");
		list.add("Heena");
		list.add("Priyanaka");
		list.add("Rani");
		list.add("Ganesh");

		/* @Stream.filter() it is work with boolean only internal is Predicate */
		List<String> filterData = list.stream().filter(data -> data.length() > 5).collect(Collectors.toList());

		/* @Stream.map() it work with some value internal is Function. */
		List<String> mapData = list.stream().map(data -> data.toUpperCase()).collect(Collectors.toList());

		/*
		 * @Stream.flapMap() it is also like map but map is one to one mapping and
		 * Flatmap is one to many mapping. map return stream but flatmap return stream
		 * of stream. ex one employee has more that one mobile number. to retrieve this
		 * number we required flatMap.
		 */

		/* @Stream.sorted() it work with to sort */
		List<String> sortedData = list.stream().sorted().collect(Collectors.toList());

		for (String data : sortedData) {
			System.out.println(data);
		}

	}

	public void mapOrFlatMapIntermediate() {

		List<String> list = new ArrayList<String>();
		list.add("9730685745");
		list.add("8668534689");
		Employee employee = new Employee(100, "Santosh", list);

		List<String> list1 = new ArrayList<String>();
		list.add("5730685745");
		list.add("6668534689");
		Employee employee1 = new Employee(102, "Nitin", list1);

		List<String> list2 = new ArrayList<String>();
		list.add("8600723365");
		list.add("7558460793");
		Employee employee2 = new Employee(99, "Priyanaka", list2);

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(employee);
		empList.add(employee1);
		empList.add(employee2);

		List<String> employeeName = empList.stream().map(empName -> empName.getEmpName()).collect(Collectors.toList());
//		System.out.println(employeeName);

		List<List<String>> empMobMap = empList.stream().map(data2 -> data2.getEmpMobNo()).collect(Collectors.toList());
		// o/p : [[9730685745, 8668534689, 5730685745, 6668534689, 8600723365,
		// 7558460793], [], []]
		System.out.println("Map :  " + empMobMap);

		List<String> empMobFlatMap = empList.stream().flatMap(mob -> mob.getEmpMobNo().stream())
				.collect(Collectors.toList());
		// [9730685745, 8668534689, 5730685745, 6668534689, 8600723365, 7558460793]

		System.out.println("Flat Map :  " + empMobFlatMap);

	}
}

/**
 * @Stream.forEach
 * @Stream.collect
 * @Steram.anyMatch
 * @Stream.allMatch
 * @Stream.nonMatch
 * @Stream.count
 * @Stream.reduce
 * @Stream.toArray
 * @Stream.min
 * @Stream.max
 *
 */
class Terminal {

	public void terminalOperator() {
		List<String> list = new ArrayList<String>();
		list.add("Neema");
		list.add("Zeena");
		list.add("Rriyanaka");
		list.add("Aani");
		list.add("Panesh");

		/* stream().forEach() it is use to pring data or other operation. */
//		list.stream().forEach(data -> {
//			System.out.println(data);
//		});

		/* Min And Max. */
		String min = list.stream().min((name1, name2) -> name1.compareTo(name2)).get();
		System.out.println("Min : " + min);

		String max = list.stream().max((name1, name2) -> {
			return name1.compareTo(name2);
		}).get();

		System.out.println("Max : " + max);

//		boolean anyMatchRes = list.stream().anyMatch(data -> data.startsWith("P"));
		// System.out.println(anyMatchRes);

		/*
		 * All Match will match data in all list elements then it will return true
		 * otherwise false.
		 */
//		List<String> stringList = new ArrayList<String>();
//		stringList.add("Java Guides");
//		stringList.add("Python Guides");
//		stringList.add("C Guides");
//		boolean allMatch = stringList.stream().allMatch((value) -> {
//			return value.contains("Guides");
//		});
//		System.out.println(allMatch);

	}

}

public class StreamOperation {

	public static void main(String[] args) {
		Intermediate_OR_Non_TerminalOperation intermediate = new Intermediate_OR_Non_TerminalOperation();
		// intermediate.TestIntermediateOperation();
		// intermediate.mapOrFlatMapIntermediate();
		Terminal objTerminal = new Terminal();
		objTerminal.terminalOperator();
	}

}

class Employee {

	int empId;
	String empName;
	List<String> empMobNo;

	public Employee() {
	}

	public Employee(int empId, String empName, List<String> empMobNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empMobNo = empMobNo;
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

	public List<String> getEmpMobNo() {
		return empMobNo;
	}

	public void setEmpMobNo(List<String> empMobNo) {
		this.empMobNo = empMobNo;
	}

}
