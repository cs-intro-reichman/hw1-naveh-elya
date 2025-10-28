// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    String number = args[0];
		String hundreds = (number.length() >=3) ? number.substring(0, number.length() - 3) : "0";
		char tens = (number.length() >= 2) ? number.charAt(number.length() - 2) : '0';
		char ones = (number.length() >= 1) ? number.charAt(number.length() - 1) : '0';


		System.out.printf("%s hundreds, %s tens, and %s ones.", hundreds, tens, ones);
	}
}
