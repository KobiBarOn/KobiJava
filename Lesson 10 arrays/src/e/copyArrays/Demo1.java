package e.copyArrays;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {

		int[] arr1 = { 2, 4, 6, 8 };
		// arr2 = only the length of arr1. 2,4,6,8 doesn't get those value inside
		int[] arr2 = new int[arr1.length];

		// print the first array
		System.out.println(Arrays.toString(arr1));
		// print the destination of coping the first array array
		System.out.println(Arrays.toString(arr2));

		// copy array 1 to array 2
		System.arraycopy(arr1, 1, arr2, 0, arr1.length);
		// print new array 2 (copied from array 1)
		System.out.println(Arrays.toString(arr2));
	}

}
