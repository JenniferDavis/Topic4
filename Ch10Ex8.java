import java.util.*;

public class Ch10Ex8 {

	public static void main(String[] args) {

		Tax taxTable2001 = new Tax();
		Tax taxTable2009 = new Tax();
		
		//TaxTable2001
		taxTable2001.rates2001 [0] = .15;
		taxTable2001.rates2001 [1] = .275;
		taxTable2001.rates2001 [2] = .305;
		taxTable2001.rates2001 [3] = .355;
		taxTable2001.rates2001 [4] = .391;
		
		taxTable2009.rates2009 [0] = .10;
		taxTable2009.rates2009 [1] = .15;
		taxTable2009.rates2009 [2] = .25;
		taxTable2009.rates2009 [3] = .28;
		taxTable2009.rates2009 [4] = .33;
		taxTable2009.rates2009 [5] = .35;
		
		taxTable2001.brackets2001 [0][0] = 27050; // single filer
		taxTable2001.brackets2001 [0][1] = 65550;
		taxTable2001.brackets2001 [0][2] = 136750;
		taxTable2001.brackets2001 [0][3] = 297350;
		taxTable2001.brackets2001 [1][0] = 45200; // Married jointly -or qualifying widow(er)
		taxTable2001.brackets2001 [1][1] = 109250;
		taxTable2001.brackets2001 [1][2] = 166500;
		taxTable2001.brackets2001 [1][3] = 297350;
		taxTable2001.brackets2001 [2][0] = 22600; // Married separately
		taxTable2001.brackets2001 [2][1] = 54625;
		taxTable2001.brackets2001 [2][2] = 83250;
		taxTable2001.brackets2001 [2][3] = 148675;
		taxTable2001.brackets2001 [3][0] = 36250; // Head of household
		taxTable2001.brackets2001 [3][1] = 93650;
		taxTable2001.brackets2001 [3][2] = 151650;
		taxTable2001.brackets2001 [3][3] = 297350;
		
		taxTable2009.brackets2009 [0][0] = 8350; // single filer
		taxTable2009.brackets2009 [0][1] = 33950;
		taxTable2009.brackets2009 [0][2] = 82250;
		taxTable2009.brackets2009 [0][3] = 171550;
		taxTable2009.brackets2009 [0][4] = 372950;
		taxTable2009.brackets2009 [1][0] = 16700; // Married jointly -or qualifying widow(er)
		taxTable2009.brackets2009 [1][1] = 67900;
		taxTable2009.brackets2009 [1][2] = 137050;
		taxTable2009.brackets2009 [1][3] = 208850;
		taxTable2009.brackets2009 [1][4] = 372950;
		taxTable2009.brackets2009 [2][0] = 8350; // Married separately
		taxTable2009.brackets2009 [2][1] = 33950;
		taxTable2009.brackets2009 [2][2] = 68525;
		taxTable2009.brackets2009 [2][3] = 104425;
		taxTable2009.brackets2009 [2][4] = 186475;
		taxTable2009.brackets2009 [3][0] = 11950; // Head of household
		taxTable2009.brackets2009 [3][1] = 45500;
		taxTable2009.brackets2009 [3][2] = 117450;
		taxTable2009.brackets2009 [3][3] = 190200;
		taxTable2009.brackets2009 [3][4] = 372950;		
			
				

		taxTable2001.getTax();
		
	}
}
