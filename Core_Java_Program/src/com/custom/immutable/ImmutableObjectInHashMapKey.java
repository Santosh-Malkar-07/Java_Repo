package com.custom.immutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * If we want put Hashmap key as employee object then we have to override equals
 * and hash code method in that class.
 */

class Employee {

	int id = 10;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {

		try {
			Employee employee = (Employee) obj;
			if (this.name.equals(employee.getName()) && this.id == employee.getId()) {
				return true;
			} else {
				return false;
			}

		} catch (ClassCastException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return id == other.id && Objects.equals(name, other.name);
	}

}

public class ImmutableObjectInHashMapKey {

	public static void main(String[] args) {

		Map<Employee, String> hm = new HashMap<>();
		Employee employee1 = new Employee(101, "Santosh");
		Employee employee2 = new Employee(101, "Santosh");

		hm.put(employee1, "ff");
		hm.put(employee2, "mm");

		System.out.println(hm.size());
	}

}
