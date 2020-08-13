package g.HomeWork;

public class Person {

	private int id;
	private int age;
	private String name;

	public Person(int id, int age, String name) {
		super();
		if (this.id <= 0) {
			System.out.println("Invalid ID number");
		} else {
			this.id = id;
			if (this.age <= 0 || this.age > 120) {
				System.out.println("Invalid working age");
			} else {
				this.age = age;
			}
		}
		this.name = name;
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Person(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}
	// מה הקוד ל toString ומה הוא עושה בדיוק?!?!?!
}
