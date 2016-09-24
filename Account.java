import java.util.Date;
import java.util.Scanner; 

public class Account {

	/* UML---
	 * class:  			Account
	 * 
	 * data fields:		- id: int
	 * 					- balance: double
	 * 					- annualInterestRate: double
	 * 					- dateCreated: string
	 * 
	 * constructors:	Account()
	 * 					CreateAccount()
	 * 
	 * methods:						
	 * 					id()
	 * 					balance
	 * 					annualInterestRate
	 * 								// accessor method
	 * 					dateCreated
	 * 								// rest of methods
	 * 					getMonthlyInterestRate()
	 * 					getMonthlyInterest()
	 * 					withdraw()
	 * 					deposit()
	 * 								
	 */
	
									
	private static int id;							// id for the account with default at 0			
	private static double balance;				// balance for the account with default at 0
	private static double annualInterestRate;	// stores current interest rate with default at 0
	private static String dateCreated;					// stores when account was created
	private double monthlyInterestRate;

	public Account() {					// constructor for default account
	}
	
	public static void createAccount(int newId, double newBalance) {		// constructor for creating an account with id and initial balance
		id = newId;
		balance = newBalance;
		dateCreated = dateCreated();
	}
	
	private static String dateCreated(){
		Date date = new Date();
		String dateCreated = date.toString();			
		return dateCreated;
	}
	
	public String getDateCreated() {
		String getDateCreated = dateCreated;
		return getDateCreated;
	}
	
	// set annualInterestRate and calculate and return monthlyInterestRate
	public double getMonthlyInterestRate() {			// returns monthly interest rate
		monthlyInterestRate = ( (annualInterestRate / 100) / 12);
		return monthlyInterestRate;
	}
	
	
	public double getMonthlyInterest() {				// returns monthly interest
		monthlyInterestRate = getMonthlyInterestRate();
		double monthlyInterest = balance * monthlyInterestRate;
		return monthlyInterest;
	}
	
	
	public static double withdraw(double withdraw) {						// withdraws amount from account
		balance = balance - withdraw;
		return balance;
	}
	
	public static double deposit(double deposit) {						// withdraws amount from account
		balance = balance + deposit;
		return balance;
	}
	
	
	public int getId(){
		return id;
	}
	
	public void setId(int newId){
		id = newId;
	}
	
	public static double getBalance() {
		return balance;
	}
	
	public void setBalance(double x){
		balance = x;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}
		
	public static void checkID(int iD)
	{
		if (iD < 0 || iD > 9)
		{
			System.out.print("Invalid ID.  Try again.\n");
			startGame();
		}
		else 
		{
			playGame();
		}
	}
	
	public static void playGame()
	{
		System.out.println("Main Menu\n 1: check balance \n 2: withdraw \n 3. deposit \n 4. exit\n");
		System.out.print("Enter a choice: ");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		takeAction(choice);
	}
	
	public static void takeAction(int choice)
	{
		if (choice == 1)
		{
			double balance = getBalance();
			System.out.println("The balance is " + balance);
			playGame();
		}
		else if (choice == 2)
		{
			System.out.println("Enter an amount to withdraw: ");
			Scanner input = new Scanner(System.in);
			double withdrawAmount = input.nextDouble();
			System.out.println("The balance is " + withdraw(withdrawAmount));
			playGame();
		}
		else if (choice == 3)
		{
			System.out.println("Enter an amount to withdraw: ");
			Scanner input = new Scanner(System.in);
			double depositAmount = input.nextDouble();
			System.out.println("The balance is " + deposit(depositAmount));
			playGame();
		}
		else if (choice == 4)
		{
			System.exit(0);
		}
	}
	
	public static void startGame()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an id:");
		int id = input.nextInt();
		checkID(id);
	}
}
