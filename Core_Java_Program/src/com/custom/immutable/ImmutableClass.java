package com.custom.immutable;

/*Immutable class benefits is we are getting thread safety. Object creation is costly so we can reuse this object for every same requirement. We can use Immutable class object in HashMap of key. */
final class Student {
	final int rollNo;
	final String name;
	final Address address;

	Student(int rollNo, String name, Address address) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	/* This not recommended way, Singleton pattern will break. */
//	public Address getAddress() {
//		return address;
//	}

	/*
	 * This will not break Singleton pattern, we are returning clone object not
	 * original object like above code. Not good programming.
	 */
//	public Address getAddress() {
//		return new Address(address.getCity(), address.getState());
//	}

	/* This is recommended approach. */
	public Address getAddress() {
		return new Address(address);
	}

}

public class ImmutableClass {

	public static void main(String[] args) {

		Address address = new Address("Pune", "MH");
		Student student = new Student(100, "Santosh", address);
		System.out.println(
				student.getRollNo() + "  " + student.getName() + " " + address.getCity() + " " + address.getState());

		Address address2 = student.getAddress();
		address2.setCity("Aurangabad");
		address2.setState("Bihar");

		System.out.println(
				student.getRollNo() + "  " + student.getName() + " " + address.getCity() + " " + address.getState());
	}

}
