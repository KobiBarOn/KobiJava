package c.loops.forDemo;

public class Demo1ForGoodParctice {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);

		System.out.println(a + ", " + b);

		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
			System.out.println(a + ", " + b);
		}

		for (int i = a; i <= b; i++) {
			System.out.println(i + ", ");
		}
	}

}
