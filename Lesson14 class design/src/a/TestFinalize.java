package a;

//This method is not in used in those days
public class TestFinalize {

	public static void main(String[] args) throws InterruptedException {
		Person p = new Person(101, "aaa", 22);
		System.out.println(p);
		p = null; // = no reference for p object

		System.gc(); // call garbage collector

		Thread.sleep(3000);

	}

}
