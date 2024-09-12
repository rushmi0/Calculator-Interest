package consoleApp03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator_Interest {

	private double cost;
	private double interest_rate;
	private int period;
	private char funtion;

	DecimalFormat df = new DecimalFormat("#,##0.00000000");

	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	/*
	 * public Calculator_Interest(double cost, double interest_rate, int period) {
	 *    this.cost = cost; this.interest_rate = interest_rate; this.period = period; 
	 * }
	 * 
	 * public Calculator_Interest(double cost, double interest_rate) { 
	 *    this(0,0,0);
	 * }
	 */

	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	public void setcost(double cost) {
		this.cost = cost;
	}

	public void setapr(float interest) {
		this.interest_rate = interest;
	}

	public void setperiod(int period) {
		this.period = period;
	}

	public void setfuntion(float funtion) {
		this.funtion = (char) funtion;
	}

	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	public double getcost() {
		return this.cost;
	}

	public double getapr() {
		return this.interest_rate;
	}

	public int getperiod() {
		return this.period;
	}

	public char getfuntion() {
		return this.funtion;
	}

	public double getinterest_perDay() {
		return this.cost * (this.interest_rate / 100) * 0.08 / 30;
	}

	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	

	
	

	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	
	public double getinterest_perMonth() { // ผลรวมดอกเบี้ยรายวัน
		return  getinterest_perDay() * 30;			   
	}
	

	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	public double getinterest_perYear() {
		return getinterest() - this.cost;
	}

	public double getinterest() {
		return (this.cost * Math.pow(1 + this.interest_rate / 100, this.period));
	}

	public double gettotolInterest_perMonth() {
		return (getinterest_perDay() + this.cost);
	}

	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	public void toprintln1() {
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("");
		System.out.println("\t\t\tFinancial calculator");
		System.out.println("");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("");
	}

	public void toprintln2() {
		// System.out.println("[]~[]~[]~[]~[]~[]~[]~[]~[]~[]~[]~[]~[]~[]~[]~[]~[]~[]~");
		System.out.println("Do you want to Calculator Function...?\n"
				+ "|> Choose Function >> [ (I) Interest. (E) Epoch. (N) Exit. ]");
		System.out.print("|> Input:~$ ");
	}


	public void inputInterest() {
		Scanner sc = new Scanner(System.in);
		Calculator_Interest ci = new Calculator_Interest();
		System.out.print("|> COST: ");
		ci.setcost(sc.nextDouble());
		System.out.print("|> INTEREST RATE%: ");
		ci.setapr(sc.nextFloat());
		System.out.print("|> PERIOD (Per Year): ");
		ci.setperiod(sc.nextInt());

		System.out.println();
		System.out.println(ci.outputInterest());
		System.out.println();
		
		// df.format(ci.getinterest_perDay())
		// ((ci.getinterest_perDay() * this.interest_rate / 100) * (0.08)) / 30
		/*for(int i = 0; i < 30; i++) {
			System.out.println(df.format( (ci.getinterest_perDay() + ci.getcost()) * ci.getapr() / 100 * (0.08) / 30)); 
		}*/
	}
	
	
	public void toExit() {
		System.out.println();
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("\t\t\t<Exit. while-loop>");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}

	
	public String outputInterest() {
		return "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n" 
	            + "\tInterest Per Day\n"
				+ "\tEstimated Earnings >> " + df.format(getinterest_perDay()) + "\n"
				+ "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n" 
				+ "\tInterest Per Month\n"
				+ "\tEstimated Earnings >> " + df.format(getinterest_perMonth()) + "\n"
				+ "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n" 
				+ "\tInterest Per Year\n"
				+ "\tEstimated Earnings >> " + df.format(getinterest_perYear()) + "\n"
				+ "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n"
				+ "\tTotal Compound Per Month\n" 
				+ "\tEstimated Earnings >> " + df.format(gettotolInterest_perMonth())+ "\n" 			
				+ "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n"
				+ "\tTotal Compound Interest\n" 
				+ "\tEstimated Earnings " + getperiod() + " Year >> " + df.format(getinterest()) + "\n"				
				+ "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n" 
				+ "\n";
	}


}