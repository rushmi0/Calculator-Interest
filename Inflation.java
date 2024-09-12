package consoleApp03;
import java.text.DecimalFormat;
public class Inflation {
	public static  void main(String[] args) {
				
		DecimalFormat df = new DecimalFormat("#,##0.00000000");
		
		double num = 0.00513113;
		double num1 = 100;
		double[] date ={num, num, num, num, num, num, num};
		
		
		// ((100 * 5.5 / 100) * (0.08)) / 30;
		for(int i = 0;i < date.length;i++) {
			double interest_perDay = ((num * 5.5 / 100) * (0.08)) / 30;
			double a =num + interest_perDay;
			System.out.println("วันที่ "+(i+1)+" -> "+ (df.format(interest_perDay) ));
			System.out.println("ดอกทบต้น = "+(df.format(interest_perDay+a) ));
			System.out.println("---------------------------------");
					
		}
		
	}
	

}
