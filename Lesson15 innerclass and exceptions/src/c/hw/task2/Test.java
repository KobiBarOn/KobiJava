package c.hw.task2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IllegalTriangleException {

//		System.out.println(t1);
//		System.out.println("==================");
//		
//		t1.setaSide(20);
//		t1.setbSide(7);
//		t1.setcSide(6);
//		
//		System.out.println(t1);
//		System.out.println("==================");
		
		Scanner sc = new Scanner(System.in);
		double input1;
		double input2;
		double input3;

		do {
		  try {
			System.out.println("Enter A side: ");
			input1 = sc.nextDouble();
			System.out.println("Enter B side: ");
			input2 = sc.nextDouble();
			System.out.println("Enter C side: ");
			input3 = sc.nextDouble();
			Triangle t1 = new Triangle(input1, input2, input3);
			t1.setaSide(input1);
			t1.setbSide(input2);
			t1.setcSide(input3);
			System.out.println("Nice triangle! " + t1);
			break;
		  } 
		  catch (IllegalTriangleException e) {
			System.out.println("Uh oh! that's not a cool triangle");
			e.getMessage();
			continue;
		  }
		}
		while (true);
		
		sc.close();
	}
}
