import java.util.*;

public class Ch7Ex9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		// create array with input
		double[] elements = new double[10];
		// add input to array
		elements[0] = input.nextDouble();
		elements[1] = input.nextDouble();
		elements[2] = input.nextDouble();
		elements[3] = input.nextDouble();
		elements[4] = input.nextDouble();
		elements[5] = input.nextDouble();
		elements[6] = input.nextDouble();
		elements[7] = input.nextDouble();
		elements[8] = input.nextDouble();
		elements[9] = input.nextDouble();
		
		// display output
		System.out.println("The minimum number is: " + min(elements));

	}

	public static double min(double[] array)
	{
		double test1 = Math.min(array[0], array[1]);
		double test2 = Math.min(array[2], array[3]);
		double test3 = Math.min(array[4], array[5]);
		double test4 = Math.min(array[6], array[7]);
		double test5 = Math.min(array[8], array[9]);
		double test6 = Math.min(test1, test2);
		double test7 = Math.min(test3, test4);
		double test8 = Math.min(test5, test6);
		double test9 = Math.min(test7, test8);

		return test9;
	}
}
