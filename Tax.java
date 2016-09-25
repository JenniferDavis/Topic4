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
	public static double[] rates2009 = new double[6];
	public static double[] rates2001 = new double[5];
	public static int[][] brackets2009 = new int[4][5]; 
	public static int[][] brackets2001 = new int[4][4];
	
	
	public static void tax()  // no arg constructor
	{
		return;
	}

	public static void tax(int filingStatus, int brackets, double rates, double taxableIncome)
	{
	
	}
	
	public static void setTax()
	{
		
	}
	
	public static void getTax()
	{
		System.out.println("Filing Statuses:\nSingle Filers (Single)\nMarried filing jointly or qualifying widow(er) (MarJ-QWid)\nMarried filing separately (Mar-Sep)\nHead of Household (Head)");
		System.out.println();
		System.out.println("Based on the 2009 Tax Table");
		System.out.println("Income\t\tSingle\t\tMarJ-QWid\tMar-Sep\t\tHead");
		for (taxableIncome = 50000; taxableIncome <= 60000; taxableIncome = taxableIncome+1000)
		{
			double taxSingle2009 = brackets2009[0][0] * rates2009[0];
				if(taxableIncome > brackets2009[0][0])
				{
					taxSingle2009+= (brackets2009[0][1] - brackets2009[0][0]) * rates2009[1];
				}
				if(taxableIncome > brackets2009[0][1])
				{
					taxSingle2009+= (brackets2009[0][2] - brackets2009[0][1]) * rates2009[2];
				}
				if(taxableIncome > brackets2009[0][2])
				{
					taxSingle2009+= (brackets2009[0][3] - brackets2009[0][2]) * rates2009[3];	
				}
				if(taxableIncome > brackets2009[0][3])
				{
					taxSingle2009+= (brackets2009[0][4] - brackets2009[0][3]) * rates2009[4];
				}
				if(taxableIncome > brackets2009[0][4])
				{
					taxSingle2009+= (taxableIncome - brackets2009[0][4]) * rates2009[5];
				}
			double taxMJW2009 = brackets2009[1][0] * rates2009[0];
				if(taxableIncome > brackets2009[1][0])
				{
					taxMJW2009+= (brackets2009[1][1] - brackets2009[1][0]) * rates2009[1];
				}
				if(taxableIncome > brackets2009[1][1])
				{
					taxMJW2009+= (brackets2009[1][2] - brackets2009[1][1]) * rates2009[2];
				}
				if(taxableIncome > brackets2009[1][2])
				{
					taxMJW2009+= (brackets2009[1][3] - brackets2009[1][2]) * rates2009[3];
				}
				if(taxableIncome > brackets2009[1][3])
				{
					taxMJW2009+= (brackets2009[1][4] - brackets2009[1][3]) * rates2009[4];
				}
				if(taxableIncome > brackets2009[1][4])
				{
					taxMJW2009+= (taxableIncome - brackets2009[1][4]) * rates2009[5];
				}
			double taxMS2009 = brackets2009[2][0] * rates2009[0];
				if(taxableIncome > brackets2009[2][0])
				{
					taxMS2009+= (brackets2009[2][1] - brackets2009[2][0]) * rates2009[1];
				}
				if(taxableIncome > brackets2009[2][1])
				{
					taxMS2009+= (brackets2009[2][2] - brackets2009[2][1]) * rates2009[2];
				}
				if(taxableIncome > brackets2009[2][2])
				{
					taxMS2009+= (brackets2009[2][3] - brackets2009[2][2]) * rates2009[3];
				}
				if(taxableIncome > brackets2009[2][3])
				{
					taxMS2009+= (brackets2009[2][4] - brackets2009[2][3]) * rates2009[4];
				}
				if(taxableIncome > brackets2009[2][4])
				{
					taxMS2009+= (taxableIncome - brackets2009[2][4]) * rates2009[5];
				}
			double taxHH2009 = brackets2009[1][0] * rates2009[0]; 
				if(taxableIncome > brackets2009[1][0])
				{
					taxHH2009+= (brackets2009[3][1] - brackets2009[3][0]) * rates2009[1];
				}
				if(taxableIncome > brackets2009[3][1])
				{
					taxHH2009+= (brackets2009[3][2] - brackets2009[3][1]) * rates2009[2];
				}
				if(taxableIncome > brackets2009[3][2])
				{
					taxHH2009+= (brackets2009[3][3] - brackets2009[3][2]) * rates2009[3];
				}
				if (taxableIncome > brackets2009[3][3])
				{
					taxHH2009+= (brackets2009[3][4] - brackets2009[3][3]) * rates2009[4];
				}
				if(taxableIncome > brackets2009[3][4])
				{
					taxHH2009+= (taxableIncome - brackets2009[3][4]) * rates2009[5];
				}
			System.out.println(taxableIncome + "\t\t" + taxSingle2009 + "\t\t" + taxMJW2009 + "\t\t" + taxMS2009 + "\t\t" + taxHH2009);
		}
		System.out.println();
		System.out.println("Based on the 2001 Tax Table");
		System.out.println("Income\t\tSingle\t\tMarJ-QWid\tMar-Sep\t\tHead");
		for (taxableIncome = 50000; taxableIncome <= 60000; taxableIncome = taxableIncome+1000)
		{
			double taxSingle2001 = brackets2001[0][0] * rates2001[0];
				if(taxableIncome > brackets2001[0][0])
				{
					taxSingle2001+= (brackets2001[0][1] - brackets2001[0][0]) * rates2001[1];
				}
				if(taxableIncome > brackets2001[0][1])
				{
					taxSingle2001+= (brackets2001[0][2] - brackets2001[0][1]) * rates2001[2];
				}
				if(taxableIncome > brackets2001[0][2])
				{
					taxSingle2001+= (brackets2001[0][3] - brackets2001[0][2]) * rates2001[3];	
				}
				if(taxableIncome > brackets2001[0][3])
				{
					taxSingle2001+= (brackets2001[0][4] - brackets2001[0][3]) * rates2001[4];
				}
				//if(taxableIncome > brackets2001[0][4])
				//{
				//	taxSingle2001+= (taxableIncome - brackets2001[0][4]) * rates2001[5];
				//}
			double taxMJW2001 = brackets2001[1][0] * rates2001[0];
				if(taxableIncome > brackets2001[1][0])
				{
					taxMJW2001+= (brackets2001[1][1] - brackets2001[1][0]) * rates2001[1];
				}
				if(taxableIncome > brackets2001[1][1])
				{
					taxMJW2001+= (brackets2001[1][2] - brackets2001[1][1]) * rates2001[2];
				}
				if(taxableIncome > brackets2001[1][2])
				{
					taxMJW2001+= (brackets2001[1][3] - brackets2001[1][2]) * rates2001[3];
				}
				if(taxableIncome > brackets2001[1][3])
				{
					taxMJW2001+= (brackets2001[1][4] - brackets2001[1][3]) * rates2001[4];
				}
				//if(taxableIncome > brackets2001[1][4])
				//{
				//	taxMJW2001+= (taxableIncome - brackets2001[1][4]) * rates2001[5];
				//}
			double taxMS2001 = brackets2001[2][0] * rates2001[0];
				if(taxableIncome > brackets2001[2][0])
				{
					taxMS2001+= (brackets2001[2][1] - brackets2001[2][0]) * rates2001[1];
				}
				if(taxableIncome > brackets2001[2][1])
				{
					taxMS2001+= (brackets2001[2][2] - brackets2001[2][1]) * rates2001[2];
				}
				if(taxableIncome > brackets2001[2][2])
				{
					taxMS2001+= (brackets2001[2][3] - brackets2001[2][2]) * rates2001[3];
				}
				if(taxableIncome > brackets2001[2][3])
				{
					taxMS2001+= (brackets2001[2][4] - brackets2001[2][3]) * rates2001[4];
				}
				//if(taxableIncome > brackets2001[2][4])
				//{
				//	taxMS2001+= (taxableIncome - brackets2001[2][4]) * rates2001[5];
				//}
			double taxHH2001 = brackets2001[1][0] * rates2001[0]; 
				if(taxableIncome > brackets2001[1][0])
				{
					taxHH2001+= (brackets2001[3][1] - brackets2001[3][0]) * rates2001[1];
				}
				if(taxableIncome > brackets2001[3][1])
				{
					taxHH2001+= (brackets2001[3][2] - brackets2001[3][1]) * rates2001[2];
				}
				if(taxableIncome > brackets2001[3][2])
				{
					taxHH2001+= (brackets2001[3][3] - brackets2001[3][2]) * rates2001[3];
				}
				if (taxableIncome > brackets2001[3][3])
				{
					taxHH2001+= (brackets2001[3][4] - brackets2001[3][3]) * rates2001[4];
				}
				//if(taxableIncome > brackets2001[3][4])
				//{
				//taxHH2001+= (taxableIncome - brackets2001[3][4]) * rates2001[5];
				//}
			System.out.println(taxableIncome + "\t\t" + taxSingle2001 + "\t\t" + taxMJW2001 + "\t\t" + taxMS2001 + "\t\t" + taxHH2001);
		}
	}	
}
