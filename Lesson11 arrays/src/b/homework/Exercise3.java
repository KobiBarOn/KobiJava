package b.homework;

import java.util.Arrays;

public class Exercise3 {

	public static void main(String[] args) {

		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 11);
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
			if (arr[i] == arr[j]) {
				arr[i++] = arr[j];
				arr.length -= 1;
			}
			System.out.println(Arrays.toString(arr));

		}
	}

}