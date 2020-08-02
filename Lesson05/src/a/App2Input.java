package a;

import java.util.Scanner;

public class App2Input {

	public static void main(String[] args) {

		// input queue
		String str = "3 9 11 2 100";
		System.out.println(str);
		
		//scanner is a java object for input operations
		Scanner sc = new Scanner(str);
        //read first element from input queue
		int x = sc.nextInt();
		
		System.out.println(x);
		
		// read next element in queue
		x = sc.nextInt();
		System.out.println(x);
		x = sc.nextInt();
		System.out.println(x);
		x = sc.nextInt();
		System.out.println(x);
		x = sc.nextInt();
		System.out.println(x);
		
		// closing Scanner
		sc.close();
		
	}

}
