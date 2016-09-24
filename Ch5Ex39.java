
public class Ch5Ex39 {

	public static double sales = 0;
	public static double commission = 0;

	public static void main(String[] args) {
		int basePay = 5000;
		
		while ( basePay + commission < 30000)
		{
			sales = sales + .01;
			calculateCommission(sales);
		}
		
		System.out.printf("$%1.2f are needed to earn $30,000 a year.", sales);
	}
	
	public static double calculateCommission(double sales)
	{	
		if (sales > 0 && sales <= 5000)
		{
			commission = sales * .08;
		}
		else if (sales > 0 && sales <= 10000)
		{
			commission = (5000 * .08) + ( (sales - 5000) * .10 );
		}
		else if (sales > 0 && sales >= 10000.01)
		{
			commission = (5000 * .08) + (5000 * .10) + ( (sales - 10000) * .12);
		}
		return commission;
	}

}
