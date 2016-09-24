import java.util.*;

public class Ch5Ex21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the loan amount: ");
		double loanAmount = input.nextDouble();
		System.out.print("Enter the loan period in number of years: ");
		int loanPeriodYears = input.nextInt();
		
		System.out.printf("Loan amount: $%1.2f\n", loanAmount);
		System.out.println("Number of Years: " + loanPeriodYears);
		System.out.println("Interest Rate\t\tMonthly Payment\t\tTotal Payment");
		paymentCalculation(loanAmount, loanPeriodYears);

	}

	public static void paymentCalculation(double loanAmount, int yearsOfLoan){
		int years = yearsOfLoan;
		double interestRate = 5.000;
		
		while(interestRate <= 8.000)
		{
			double convertInterestRate = (interestRate / 100);
			double monthlyInterestRate = convertInterestRate / 12;
			/*How to calculate monthly interest:
			 * P = the amount borrowed
			 * r = the monthly interest rate
			 * n = the number of months of the loan
			 * M = the monthly payment
			 * Formula: M = P(1+r)n r / [(1+r)n-1]
			 */
			double monthlyPayment = (loanAmount * Math.pow(1 + monthlyInterestRate, years * 12) * monthlyInterestRate) / (Math.pow(1 + monthlyInterestRate,  years * 12) - 1);
			double totalPayment = monthlyPayment * 12 * years;
			System.out.printf("%1.3f%%\t\t\t%1.2f\t\t\t%1.2f\n",interestRate,monthlyPayment,totalPayment);
			interestRate = interestRate + 0.125;
		
		}
	}
}
