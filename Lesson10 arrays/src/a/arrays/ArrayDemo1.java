package a.arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {

		// create an array of 5 int element. int=type,[]=array type,
		// arr=reference name, new=new initiation, int[5]=the length/amount of drawers
		int[] arr = new int[5];

		// assign the value 7 to element at index 2
		arr[2] = 7;

		// print array id
		System.out.println(arr);

		// access (print) array elements
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		System.out.println("===========");
// print amount of array cells/element
		System.out.println("array length is: " + arr.length);
		System.out.println("===========");
		// print the amount of parameters inside main method
		System.out.println("array length is: " + args.length);

		// example of the benefits in using arrays list - much more simple when
		// you need the insert/work with allot of data of the same type
		int[] grade = new int[1000];
		grade[1] = 95;
		grade[2] = 55;

	}

}