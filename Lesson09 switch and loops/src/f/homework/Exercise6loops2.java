package f.homework;

public class Exercise6loops2 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 101);
		int b = (int) (Math.random() * 101);
		System.out.println("a= " + a + " b= " + b);

		int temp = 0;
		int i = 0;

		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}

		for (i = a; b >= i; i++) {
			System.out.println(i);
		}
	}

}
