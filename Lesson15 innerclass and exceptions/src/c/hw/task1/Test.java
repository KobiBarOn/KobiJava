package c.hw.task1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {

		Point p1 = new Point(5,10);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int input1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int input2 = sc.nextInt();
		
		try {
			p1.setX(input1);
			p1.setY(input2);
		} catch (Exception outOfRange) {
			System.out.println(outOfRange);
		}		
	
		sc.close();
	}
}
