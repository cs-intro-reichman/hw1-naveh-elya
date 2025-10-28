// Generates three integer random numbers in a given range,
// and prints them in increasing order.
import java.util.Arrays;
import java.util.Random;

public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		Random random = new Random();

		int rangeStartString = Integer.parseInt(args[0]);
		int rangeEndString = Integer.parseInt(args[1]);

		int[] numbers = new int[3];
		for (int i = 0; i < 3; i++) {
			numbers[i] = random.nextInt(rangeEndString - rangeStartString +1) + rangeStartString;
		}
		Arrays.sort(numbers);

		for (int j = 0; j < 10; j++) {
			System.err.println(numbers[j]);
		}
	}
}
