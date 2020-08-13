package c.polymorphism;

import b.finalDemo.Employee;
import b.finalDemo.Person;

public class Demo1 {

	public static void main(String[] args) {

		// reference type and instance type are the same
		Person p1 = new Person(101);

		// reference type and instance type are the same
		Employee e = new Employee(102);

		// reference type and instance type are the same
		// only when the instance is a subclass of the reference
		// this is called polymorphism
		// a dog is a polymorphism of an animal
		Person p2 = new Employee(103);

	}

}
