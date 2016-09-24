/*
 * UML
 * Class: Tax
 * 
 * + filingStatus: int
 * + SINGLE_FILER: int, final
 * + MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER: int, final
 * + MARRIED_SEPATATELY: int, final
 * + HEAD_OF_HOUSEHOLD: int, final
 * + taxableIncome: double
 * 
 * brackets [][]: int
 * rates []: double
 * 
 * getTax(): static void
 * getTaX(filingStatus, brackets, rates, taxableIncome): static void
 * setTax(): static void
 * 
 */


public class Tax {

	int filingStatus;
	public final static int SINGLE_FILER = 0;
	public final static int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
	public final static int MARRIED_SEPATATELY = 2;
	public final static int HEAD_OF_HOUSEHOLD = 3;
	public static double taxableIncome;
	public static double[] rates; // used
	public static int[][] brackets; // used

	
	
	public static void tax()  // no arg constructor
	{
		return;
	}
	
	
	
	public static void getTax(int bracket, double taxableIncome)
	{
		//Suppose the taxable income is $400,000 for single filers. The tax can be computed as follows:
		double tax = brackets[bracket][0] * rates[0] +
		(brackets[bracket][1] - brackets[bracket][0]) * rates[1] +
		(brackets[bracket][2] - brackets[bracket][1]) * rates[2] +
		(brackets[bracket][3] - brackets[bracket][2]) * rates[3] +
		(brackets[bracket][4] - brackets[bracket][3]) * rates[4] +
		(taxableIncome - brackets[bracket][4]) * rates[5];
		
		System.out.println(tax);
	}
	
	public static void tax(int filingStatus, int brackets, double rates, double taxableIncome)
	{
		if (filingStatus == 0)
		{
			getTax(0, taxableIncome);
		}
		
	}
	
	public static void setTax()
	{
		
	}
	
	
}
