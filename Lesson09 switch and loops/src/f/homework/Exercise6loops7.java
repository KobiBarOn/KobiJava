package f.homework;

public class Exercise6loops7 {

	public static void main(String[] args) {

		float num = (int) (Math.random() * 101);
		// int num = 4;
		System.out.println("The number is: " + num);

		int i;
		int f = 1;

		for (i = 1; i <= num; i++) {
			f = f * i;
		}
		System.out.println("The factorial of " + num + " is: " + f);

	}
}