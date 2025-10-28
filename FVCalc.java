// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int startMoney = Integer.parseInt(args[0]);
		double ratio = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);

		double countSaving = startMoney;

		for (int i = 0; i < years; i++) {
			countSaving += countSaving * (ratio / 100);	
		}

		System.out.printf("After %d years, $%d saved at %.1f%% will yield $%d", years, startMoney, ratio, (int)countSaving);
	}
}