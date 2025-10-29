// Generates three integer random numbers in a given range,
// and prints them in increasing order.

public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code

		int limit = Integer.parseInt(args[0]);

		int[] numbers = new int[3];
		for (int i = 0; i < 3; i++) {
			numbers[i] = (int) (Math.random() * limit);
		}

		for (int j = 0; j < 3; j++) {
			System.out.print(numbers[j] + (j < 2 ? " " : "\n"));
		}
		int first = numbers[0];
		int second = numbers[1];
		int third = numbers[2];

		int min = Math.min(Math.min(first, second), third);
		int max = Math.max(Math.max(first, second), third);
		int middle = (first + second + third) - (min + max);

		numbers[0] = min;
		numbers[1] = middle;
		numbers[2] = max;

		for (int j = 0; j < 3; j++) {
			System.out.print(numbers[j] + (j < 2 ? " " : ""));
		}
	}
}
