package c.multiDimentionalArray;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {

		// 1 Dimention array
		int[] arr1 = { 2, 4, 6, 8 };

		// multi-dimentions array - example 1
		int[][] arr2 = { { 1, 1, 1 }, { 2, 2, 2, }, { 3, 3, 3 } };

		int[][] matrix = new int[3][4];

		matrix[0][0] = 1;
		matrix[0][1] = 1;
		matrix[0][2] = 1;
		matrix[0][3] = 1;

		matrix[1][0] = 2;
		matrix[1][1] = 2;
		matrix[1][2] = 2;
		matrix[1][3] = 2;

		matrix[2][0] = 3;
		matrix[2][1] = 3;
		matrix[2][2] = 3;
		matrix[2][3] = 3;

		// for (int i = 0; i < matrix.length; i++) {
		// System.out.println(Arrays.toString(matrix[i]));
		// }

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 11);
				System.out.println(matrix[i][j] + ", ");
			}

		}
	}

}