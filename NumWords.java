// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    String number = args[0];
		char hundreds = (args.length >=3) ? number.charAt(args.length - 3) : '0';
		char tens = (args.length >= 2) ? number.charAt(args.length - 2) : '0';
		char ones = (args.length >= 1) ? number.charAt(args.length - 1) : '0';


		System.out.printf("%s hundreds, %s tens, and %s ones.", hundreds, tens, ones);
	}
}
