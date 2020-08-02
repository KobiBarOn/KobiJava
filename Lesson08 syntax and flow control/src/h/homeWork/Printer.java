package h.homeWork;

// Module 3-4 – Expressions & Flow control
public class Printer {

	public static void main(String[] args) {

		String part1 = "There will be ";
		int visitors = 5;
		String part2 = " people for dinner.";
		System.out.println(part1 + (visitors + 2) + part2);
		// without the parenthesis it will print: 52 (5 & 2 instead of 5 + 2)

	}

}
