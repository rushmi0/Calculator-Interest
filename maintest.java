package consoleApp03;

import java.text.DecimalFormat;

public class maintest {

	public static void main(String[] args) {
		
		/*System.out.println(df.format(((0.011119 * 5.5 / 100) * (0.08)) / 30 - (0.00000001)));
		System.out.println();*/
		
		DecimalFormat df = new DecimalFormat("#,##0.00000000");
		Calculator_Interest ci = new Calculator_Interest();
		
		ci.inputInterest();
		for(int i = 0; i < 7; i++) {
			System.out.print("day"+ i + " " + df.format(ci.getinterest_perDay()));
		}
		
		

	}

}
