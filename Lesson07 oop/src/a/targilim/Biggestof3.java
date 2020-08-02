package a.targilim;

import java.util.Scanner;

public class Biggestof3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter 1st numeber: ");
		int a = sc.nextInt();
		System.out.print("enter 2nd numeber: ");
		int b = sc.nextInt();
		System.out.print("enter 3rd numeber: ");
		int c = sc.nextInt();

		System.out.println("the numbers are: ");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		if (a > b) {
			if (a > c) {
				System.out.println("The maximum number is: ");
				System.out.println(a);

			} else
				System.out.println("The maximum number is: ");
			System.out.println(c);
		} else {
			if (b > c) {
				System.out.println("The maximum number is: ");
				System.out.println(b);

			} else {
				System.out.println("The maximum number is: ");
				System.out.println(c);
			}
			sc.close();
		}
	}

}
