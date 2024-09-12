package consoleApp03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Epoch  {

		
	    private double cost;
	    private int period;
	    
	  
		DecimalFormat df = new DecimalFormat("#,##0.00000000");
	    
	    public void setcost(double cost) {
			this.cost = cost;
		}
	    
	    public void setperiod(int period) {
			this.period = period;
		}
	    
	
	 // --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	    
	    public double getcost() {
	    	return this.cost;
	    }
	    
	    public int getperiod() {
	    	return this.period;
	    }
	    
	    
	 // --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


		public double getEpochWORST_CASE() {
			double minimum = 2.99;
			double maximum = 4.9 - minimum;
			double randomAPY = ((Math.random() * maximum) + minimum);
			return ((this.cost * randomAPY / 100) * (0.08)) / 30 * 5;
		}
		

		public double getEpochBEST_CASE() {
			double minimum = 3.9;
			double maximum = 5.0 - minimum;
			double randomAPY = ((Math.random() * maximum) + minimum);
			return ((this.cost * randomAPY / 100) * (0.08)) / 30 * 5;
		}
		
		
		public double getEpochWORST_CASE_compound() {
			double minimum = 3.0;
			double maximum = 5.0 - minimum;
			double randomAPY = ((Math.random() * maximum) + minimum);
			return (this.cost * Math.pow(1 + randomAPY / 100, this.period));
		}

		
		// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		
		public void inputEpoch() throws InterruptedException {	
			Scanner sc = new Scanner(System.in);
			Epoch ep = new Epoch();
			System.out.print("|> COST: ");
			ep.setcost(sc.nextDouble());		
			System.out.print("|> PERIOD (Per Year): ");
			ep.setperiod(sc.nextInt()); 
			
			System.out.println();
			for(int i = 0; i < 3; i++) {
				System.out.print("{- Case "+ (i+1)+" -}");
				System.out.println(ep.outputEpoch());
				Thread.sleep(1200);
			}
			
			}

		public String outputEpoch() { 
			return"\n"
				   + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n"
				   + "\tper Epoch Worst Case\n"
				   + "\tEstimated Earnings     >>  " + df.format(getEpochWORST_CASE()) + " ADA\n"
				   
				   + "\tEpoch Per Month\n"
				   + "\tEstimated Earnings     >>  " + df.format(getEpochWORST_CASE()*6) + " ADA\n"
				   + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n"
				   + "\tper Epoch Best Case\n"
				   + "\tEstimated Earnings     >>  " + df.format(getEpochBEST_CASE()) + " ADA\n"
				   
				   + "\tEpoch Per Month\n"
				   + "\tEstimated Earnings     >>  " + df.format(getEpochBEST_CASE()*6) + " ADA\n"
				   + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n"
				   + "\tTotal Reward\n"
				   + "\tEstimated Earnings "+getperiod()+" Year >>  "+ df.format(getEpochWORST_CASE_compound()) + " ADA\n"
				   + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="
				   +"\n";
		}
		
		
}
