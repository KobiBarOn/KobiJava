package f.homework;

public class Exercise6loops5 {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 10001);
		System.out.println("The number is: " + num);

		int i = 1;
		int sum = 0;
		int temp = num;
		int mun = 0;

		// get the left digit & the amount of digits in num variable
		while (num > 9) {
			int leftdigit = num / 10;
			num = leftdigit;
			i++;

		}

		System.out.println("The amount of digits in num variable is: " + i);
		System.out.println("The left digit is: " + num);

		// get the summary of num variable digits & opposite order of the number’s
		// digits
		while (temp != 0) {
			int digit = temp % 10;
			mun = mun * 10 + digit;
			sum = sum + (temp % 10);
			temp /= 10;
		}
		System.out.println("The summary of the digits is: " + sum);
		System.out.println("The opposite order of the number’s digits is: " + mun);

	}
}
