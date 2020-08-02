package a.switching;

import java.util.Scanner;

public class SwitchDemo3Menu {

	public static void main(String[] args) {
		System.out.println("===Menu===");
		System.out.println("1 ....... Say Hi");
		System.out.println("2 ....... Say Yes");
		System.out.println("3 ....... Say No");
		System.out.println("==========");
		System.out.println("Your Choice is: ");

		Scanner sc = new Scanner(System.in); // create scanner for input
		int input = sc.nextInt(); // input from keyboard
		sc.close(); // close scanner
		System.out.println(input); // print user input

		switch (input) {
		case 1:
			System.out.println("Hi");
			break;
		case 2:
			System.out.println("Yes");
			break;
		case 3:
			System.out.println("No");
			break;
		default:
			System.out.println(input + " is not a valid option");
			break;
		}

	}
}