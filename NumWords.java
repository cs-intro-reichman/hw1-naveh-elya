// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    String number = args[0];
		char hundreds = number.charAt(0);
		char tens = number.charAt(1);
		char ones = number.charAt(2);

		System.out.printf("%s hundreds, %s tens, and %s ones", hundreds, tens, ones);
	}
}
