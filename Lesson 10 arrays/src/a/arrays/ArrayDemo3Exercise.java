package a.arrays;

public class ArrayDemo3Exercise {

	public static void main(String[] args) {

		// create an array of 100 int elements. and print all of them
		int[] arr = new int[100];
		// all of value 150

		for (int i = 0; i < 100; i++) {
			arr[i] = 150;
			System.out.println(arr[i] + ", " + i);
		}

	}

}
