package a;

public class App2 {

	public static void main(String[] args) {
       
		//insert a value to the String
		Person p = new Person();
		
	    // method invocation
		String x = p.saySomething("bla bla");
		System.out.println(x);
		
		// method invocation
		int sum = p.add2numbers(4, 3);
		System.out.println(sum);
	}
	

}
