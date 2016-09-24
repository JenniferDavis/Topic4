import java.util.*;

public class Ch8Ex9 {

	public static String [][] ticTacToeBoard;
	public static final int ROWS = 3;
	public static final int COLUMNS = 7;
	public static String dashes = "-------";
	public static int count = 1; // odd is x turn, even is o turn
	
	public static void main(String[] args) 
	{
		ticTacToeBoard = new String[ROWS][COLUMNS];
		// create board: set up spaces
		ticTacToeBoard[0][1] = " ";
		ticTacToeBoard[0][3] = " ";
		ticTacToeBoard[0][5] = " ";
		ticTacToeBoard[1][1] = " ";
		ticTacToeBoard[1][3] = " ";
		ticTacToeBoard[1][5] = " ";
		ticTacToeBoard[2][1] = " ";
		ticTacToeBoard[2][3] = " ";
		ticTacToeBoard[2][5] = " ";
		showBoard(ticTacToeBoard);
		playerInput();
	}

	
	
	public static void showBoard(String[][] array)
	{
		// create board: set up barriers
		ticTacToeBoard[0][0] = "|";
		ticTacToeBoard[0][2] = "|";
		ticTacToeBoard[0][4] = "|";
		ticTacToeBoard[0][6] = "|";
		ticTacToeBoard[1][0] = "|";
		ticTacToeBoard[1][2] = "|";
		ticTacToeBoard[1][4] = "|";
		ticTacToeBoard[1][6] = "|";
		ticTacToeBoard[2][0] = "|";
		ticTacToeBoard[2][2] = "|";
		ticTacToeBoard[2][4] = "|";
		ticTacToeBoard[2][6] = "|";
		
		//display board
		System.out.println(dashes);
		for (int i = 0; i < COLUMNS; i++)
		{
			System.out.print(String.valueOf(ticTacToeBoard[0][i]));
		}
		System.out.println("\n" + dashes);
		for (int i = 0; i < COLUMNS; i++)
		{
			System.out.print(String.valueOf(ticTacToeBoard[1][i]));
		}		
		System.out.println("\n" + dashes);
		for (int i = 0; i < COLUMNS; i++)
		{
			System.out.print(String.valueOf(ticTacToeBoard[2][i]));
		}		
		System.out.println("\n" + dashes);
	}
	
	public static void fillSpaces(String array[][], int row, int column, String a)
	{			
		// reset space to entry
		int i = row;
		int j = column;
		array[i][j] = a;	
	}

	public static void playerInput()
	{
		
		if (count%2 == 0)//number is even - it's O's turn
		{
			System.out.print("Enter a row (0, 1, or 2); for player O: ");
			Scanner input = new Scanner(System.in);
			int oRow = input.nextInt();	
			System.out.print("Enter a column (0, 1, or 2); for player O: ");
			int oCol = input.nextInt();
			int correctCol = 0;
			switch(oCol){
			case 0: correctCol = 1;
				break;
			case 1: correctCol = 3;
				break;
			case 2: correctCol = 5;
				break;
			}
			checkSpace(ticTacToeBoard, oRow, correctCol);
			fillSpaces(ticTacToeBoard, oRow, correctCol, "O");
			count++;
		}
		else
		{
			System.out.print("Enter a row (0, 1, or 2); for player X: ");
			Scanner input = new Scanner(System.in);
			int xRow = input.nextInt();
			System.out.print("Enter a column (0, 1, or 2); for player X: ");
			int xCol = input.nextInt();	
			// fix the xCol to match indices
			int correctCol = 0;
			switch(xCol){
				case 0: correctCol = 1;
					break;
				case 1: correctCol = 3;
					break;
				case 2: correctCol = 5;
					break;
			}
			checkSpace(ticTacToeBoard, xRow, correctCol);
			fillSpaces(ticTacToeBoard, xRow, correctCol, "X");
			count++;
		}
		showBoard(ticTacToeBoard);
		checkForAWinner();
		playerInput();
	}
	
	public static void checkSpace(String array[][], int row, int col)
	{
		boolean checkSpace = ticTacToeBoard[row][col].contains(" ");
		if(checkSpace)
		{
			return;
		}
		else if(!checkSpace)
		{
			System.out.println("That space is already taken.  Choose another space.");
			playerInput();
		}
	}
	
	public static void checkForAWinner()
	{
		// col 1 down
		String a = String.valueOf(ticTacToeBoard[0][1]);
		String b = String.valueOf(ticTacToeBoard[1][1]);
		String c = String.valueOf(ticTacToeBoard[2][1]);
		// col 3 down
		String d = String.valueOf(ticTacToeBoard[0][3]);
		String e = String.valueOf(ticTacToeBoard[1][3]);
		String f = String.valueOf(ticTacToeBoard[2][3]);	
		// col 5 down
		String g = String.valueOf(ticTacToeBoard[0][5]);	
		String h = String.valueOf(ticTacToeBoard[1][5]);	
		String i = String.valueOf(ticTacToeBoard[2][5]);	
		// row 0 across
		String j = String.valueOf(ticTacToeBoard[0][1]);	
		String k = String.valueOf(ticTacToeBoard[0][3]);	
		String l = String.valueOf(ticTacToeBoard[0][5]);
		// row 1 across
		String m = String.valueOf(ticTacToeBoard[1][1]);	
		String n = String.valueOf(ticTacToeBoard[1][3]);	
		String o = String.valueOf(ticTacToeBoard[1][5]);			
		// row 2 across
		String p = String.valueOf(ticTacToeBoard[2][1]);
		String q = String.valueOf(ticTacToeBoard[2][3]);
		String r = String.valueOf(ticTacToeBoard[2][5]);
		// diagonal top left to bottom right 
		String s = String.valueOf(ticTacToeBoard[0][1]);
		String t = String.valueOf(ticTacToeBoard[1][3]);
		String u = String.valueOf(ticTacToeBoard[2][5]);	
		// diagonal top right to bottom left 
		String v = String.valueOf(ticTacToeBoard[0][5]);
		String w = String.valueOf(ticTacToeBoard[1][3]);
		String x = String.valueOf(ticTacToeBoard[2][1]);
		
		if(a == b && b == c && a != " ")
		{
			System.out.println(String.valueOf(ticTacToeBoard[0][1]) + " player won");
			System.exit(0);
		}
		else if(d == e && e == f && d != " ")
		{
			System.out.println(String.valueOf(ticTacToeBoard[0][3]) + " player won");
			System.exit(0);
		}
		else if(g == h && h == i && g != " ")
		{
			System.out.println(String.valueOf(ticTacToeBoard[0][5]) + " player won");
			System.exit(0);
		}	
		else if(j == k && k == l && j != " ")
		{
			System.out.println(String.valueOf(ticTacToeBoard[0][1]) + " player won");
			System.exit(0);
		}
		else if(m == n && n == o && m != " ")
		{
			System.out.println(String.valueOf(ticTacToeBoard[1][1]) + " player won");
			System.exit(0);
		}
		else if(p == q && q == r && p != " ")
		{
			System.out.println(String.valueOf(ticTacToeBoard[2][1]) + " player won");
			System.exit(0);
		}
		else if(s == t && t == u && s != " ")
		{
			System.out.println(String.valueOf(ticTacToeBoard[0][1]) + " player won");
			System.exit(0);
		}
		else if(v == w && w == x && v != " ")
		{
			System.out.println(String.valueOf(ticTacToeBoard[0][5]) + " player won");
			System.exit(0);
		}
		
		// if all spaces are filled and there is no winner, it is a draw
		if (	String.valueOf(ticTacToeBoard[0][1]) == " ")
		{
			return;
		}
		else if (String.valueOf(ticTacToeBoard[0][3]) == " ")
		{
			return;
		}
		else if (	String.valueOf(ticTacToeBoard[0][5]) == " ")
		{
			return;
		}
		else if (	String.valueOf(ticTacToeBoard[1][1]) == " ")
		{
			return;
		}
		else if (	String.valueOf(ticTacToeBoard[1][3]) == " ")
		{
			return;
		}
		else if (	String.valueOf(ticTacToeBoard[1][5]) == " ")
		{
			return;
		}
		else if (	String.valueOf(ticTacToeBoard[2][1]) == " ")
		{
			return;
		}
		else if (	String.valueOf(ticTacToeBoard[2][3]) == " ")
		{
			return;
		}
		else if (	String.valueOf(ticTacToeBoard[2][5]) == " ")
		{
			return;
		}
		else
		{
			System.out.println("No winner; it is a draw.");
			System.exit(0);
		}
	}
			
}
