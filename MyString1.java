import java.util.*;

public class MyString1 {

	public static char[] myArray;
	public static String myString;
	
	public static void main(String[] args) {
		myString = "My name is Jennifer";
		myArray = myString.toCharArray();
		
		MyString1(myArray);
		
		charAt(1);
		
		length();
		
		substring(4, 10);
		
		toLowerCase();
		
		equals(myString, "Jennifer");
		
		valueOf(3);
	}

	public static void MyString1(char[] chars)
	{
		System.out.println(Arrays.toString(chars));
	}
	
	public static void charAt(int index)
	{
		char letter = myString.charAt(index);
		System.out.println(letter + " is found at index " + index);
	}
	
	public static void length()
	{
		System.out.println("Length of string is: " + myString.length());
	}
	
	public static void substring(int begin, int end)
	{
		System.out.println("MyString1 substring from index " + begin + " to index " + end + " is " + myString.substring(begin, end) + ".");
	}
	
	public static void toLowerCase()
	{
		System.out.println("MyString1 in lowercase: " + myString.toLowerCase());
	}
	
	public static void equals(String MyString1, String s)
	{
		System.out.println("\"" + s + "\" is equal to myString: " + MyString1.equals(s));

	}
	
	public static void valueOf(int i)
	{
		System.out.println("The value of index " + i + " is " + myString.valueOf(i));
	}
	
}
