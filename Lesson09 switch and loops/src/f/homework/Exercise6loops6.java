package f.homework;

public class Exercise6loops6 {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 100001);
		System.out.println("The number is: " + num);

		int mun = 0; // reversed integer
		int temp = num; // original number in memory
		int digit; // remainder

		while (num != 0) {
			digit = num % 10;
			mun = digit + (mun * 10);
			num /= 10;
		}
		if (temp == mun) {
			System.out.println("The number is a flindrum number");
		} else {
			System.out.println("The number isn't a flindrum number");

		}
	}
}