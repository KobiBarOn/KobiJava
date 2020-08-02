package f.homework;

public class Exercise6loops1 {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 101);
		System.out.println("The number is: " + x);
		int i = 1;

		while (x >= i) {
			System.out.println(i);
			i++;
		}

	}

}
