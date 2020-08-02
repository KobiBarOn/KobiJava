package operators;

public class Demo {

	public static void main(String[] args) {
		int x = 5;
		System.out.println(x++); // 5 - print an then increment
		System.out.println(x); // 6 - print after increment
		System.out.println(++x); // 7 - increment and then print x

		// assignment returns a value - the result
		x = 350; // returns 350
		int a, b, c, d, e;
		a = b = c = d = e = 5; // all variables are now 5
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

		System.out.println(x = 10); // assign x as 10 and print x
		System.out.println(x);
		System.out.println(-x);
		System.out.println(true);
		System.out.println(!true); // not reverses a boolean value

		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(true || false);

		System.out.println("=========");
	}

	{

		int a = 5;
		int b = 24;
		int max = a > b ? a : b; // a shortcut to the loops down below

		// if (a > b) {
		// max = a;
		// } else {
		// max = b;
		// }

		System.out.println(max);

	}
}
