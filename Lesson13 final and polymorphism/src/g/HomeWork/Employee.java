package g.HomeWork;

public class Employee extends Person {

	private int sal;
	private int eAge;

	public Employee(int id, int age, String name, int sal, int eAge) {
		super(id, age, name);
		if (sal < 10) {
			System.out.println("Invalid Salary");
		} else {
			this.sal = sal;
		}
		if (eAge <= 18) {
			System.out.println("Invalid Employee Age");
		} else {
			this.eAge = eAge;
		}
	}

	public Employee(int sal, int id, String name) {
		super(id, name);
		this.sal = sal;
	}

	public Employee(int id) {
		super(id);
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int geteAge() {
		return eAge;
	}

	public void seteAge(int eAge) {
		this.eAge = eAge;
	}
	// מה הקוד ל toString ומה הוא עושה בדיוק?!?!?!

}
