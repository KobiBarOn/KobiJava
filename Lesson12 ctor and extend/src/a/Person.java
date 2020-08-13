package a;

/**
 * A person will never have a negative value for id
 */

public class Person {

	// fields
	public int id; // visible int this class only
	String name; // visible from any sub-class
	int age; // (default) package private - visible in the package only

	// methods
	public String getDetails() { // public = is visible from everywhere
		return "person [id: " + id + ", name: " + name + ", age: " + age + "]";

	}

	public void setId(int val) {
		if (val >= 0) {
			id = val;
		}
	}
}
