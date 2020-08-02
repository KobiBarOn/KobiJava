package b.loops.whileDemo;

import java.util.Scanner;

public class Demo2While {

	public static void main(String[] args) {
		// define a secret password
		int secretPassword = 2406;
		// prompt user for input
		System.out.println("Enter password: ");

		// input user password
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();

		while (userInput != secretPassword) {
			System.out.println("Wrong password.Please enter again: ");
			userInput = sc.nextInt();
		}

		System.out.println("You are logged in");
		sc.close();
	}

}
