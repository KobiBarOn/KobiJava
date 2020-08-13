package b.homework;

public class Exercise5 {
	public static void main(String[] args) {
		// 20 students, 10 grades per student
		int students = 20;
		int grades = 10;
		double sumOfAvg = 0;

		int[][] gradesMatrix = new int[students][grades];

		for (int student = 0; student < gradesMatrix.length; student++) {
			System.out.println("student: " + student);
			int sum = 0;
			double avg = 0;
			for (int grade = 0; grade < gradesMatrix[student].length; grade++) {
				gradesMatrix[student][grade] = (int) (Math.random() * 101);
				System.out.print(gradesMatrix[student][grade] + "\t");
				sum += gradesMatrix[student][grade];
				avg = sum / gradesMatrix[grades].length;

			}
			System.out.println();
			System.out.println("sum = " + sum);
			System.out.println("student number: " + (student + 1) + " avrage grade is: " + avg);
			sumOfAvg += avg;
		}
		if (students <= gradesMatrix.length) {
			double classAvg = sumOfAvg / students;
			System.out.println("the class avrage grade is: " + classAvg);
		}

	}

}