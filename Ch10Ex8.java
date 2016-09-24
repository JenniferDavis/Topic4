
public class Ch10Ex8 {

	public static void main(String[] args) {

		Tax taxTable2001 = new Tax();
		Tax taxTable2009 = new Tax();
		
		taxTable2001.rates [0] = .15;
		taxTable2001.rates [1] = .275;
		taxTable2001.rates [2] = .305;
		taxTable2001.rates [3] = .355;
		taxTable2001.rates [4] = .391;
		
		taxTable2009.rates [0] = .10;
		taxTable2009.rates [1] = .15;
		taxTable2009.rates [2] = .25;
		taxTable2009.rates [3] = .28;
		taxTable2009.rates [4] = .33;
		taxTable2009.rates [5] = .35;
		
		taxTable2001.brackets [0][0] = 27050; // single filer
		taxTable2001.brackets [0][1] = 65550;
		taxTable2001.brackets [0][2] = 136750;
		taxTable2001.brackets [0][3] = 297350;
		taxTable2001.brackets [1][0] = 45200; // Married jointly -or qualifying widow(er)
		taxTable2001.brackets [1][1] = 109250;
		taxTable2001.brackets [1][2] = 166500;
		taxTable2001.brackets [1][3] = 297350;
		taxTable2001.brackets [2][0] = 22600; // Married separately
		taxTable2001.brackets [2][1] = 54625;
		taxTable2001.brackets [2][2] = 83250;
		taxTable2001.brackets [2][3] = 148675;
		taxTable2001.brackets [0][0] = 36250; // Head of household
		taxTable2001.brackets [0][1] = 93650;
		taxTable2001.brackets [0][2] = 151650;
		taxTable2001.brackets [0][3] = 297350;
		
		taxTable2009.brackets [0][0] = 8350; // single filer
		taxTable2009.brackets [0][1] = 33950;
		taxTable2009.brackets [0][2] = 82250;
		taxTable2009.brackets [0][3] = 171550;
		taxTable2009.brackets [0][4] = 372950;
		taxTable2009.brackets [1][0] = 16700; // Married jointly -or qualifying widow(er)
		taxTable2009.brackets [1][1] = 67900;
		taxTable2009.brackets [1][2] = 137050;
		taxTable2009.brackets [1][3] = 208850;
		taxTable2009.brackets [1][4] = 372950;
		taxTable2009.brackets [2][0] = 8350; // Married separately
		taxTable2009.brackets [2][1] = 33950;
		taxTable2009.brackets [2][2] = 68525;
		taxTable2009.brackets [2][3] = 104425;
		taxTable2009.brackets [2][4] = 186475;
		taxTable2009.brackets [0][0] = 11950; // Head of household
		taxTable2009.brackets [0][1] = 45500;
		taxTable2009.brackets [0][2] = 117450;
		taxTable2009.brackets [0][3] = 190200;
		taxTable2009.brackets [0][4] = 372950;		
			
				

		// print 2001 tax table for taxable income from $50,000-60,000 in $1,000 increments 
		// for all four status
		taxTable2001.tax(taxTable2001.SINGLE_FILER, 0, 0, 50000);
		
		
		
		// print 2009 tax table for taxable income from $50,000-60,000 in $1,000 increments 
		// for all four status
	}

}
