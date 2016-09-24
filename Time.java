
public class Time {

/*
 * UML Diagram:
 * Class: Time
 * 
 * + hours: long
 * + minutes: long
 * + seconds: long
 * 
 * Time(): void //no arg constructor
 * Time(long milliseconds): void
 * Time(long hour, long minute, long second): void
 * getHour(): static
 * getMintue(): static
 * getSecond(): static
 * setTime(long elapseTime): void
 *  
 */
public static long hour;
public static long minute;
public static long second;

	public static void Time()
	{
		// get the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();
		
		// get total seconds since midnight, Jan 1, 1970
		 long totalSeconds = totalMilliseconds / 1000;
		 
		 // compute current second in the minute in the hour
		 second = totalSeconds % 60;
		 
		 // obtain the total minutes
		 long totalMinutes = totalSeconds / 60;
		 
		 // compute the current minute in the hour
		 minute = totalMinutes % 60;
		 
		 // obtain the total hours
		 long totalHours = totalMinutes / 60;
		 
		 // compute the current hour
		 hour = totalHours % 24;
		 
		 // display results
		 System.out.println("Current time is " + hour + ":" + minute + ":" + second + " GMT");
		
	}
	
	public static void Time(long elapseTime)
	{
		// get the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = elapseTime;
				
		// get total seconds since midnight, Jan 1, 1970
		 long totalSeconds = totalMilliseconds / 1000;
				 
		 // compute current second in the minute in the hour
		 second = totalSeconds % 60;
				 
		 // obtain the total minutes
		 long totalMinutes = totalSeconds / 60;
				 
		 // compute the current minute in the hour
		 minute = totalMinutes % 60;
				 
		 // obtain the total hours
		 long totalHours = totalMinutes / 60;
				 
		 // compute the current hour
		 hour = totalHours % 24;
				 
		 // display results
		 System.out.println("Elapsed time is " + hour + ":" + minute + ":" + second + " GMT");
	}
	
	public static void Time(long givenHours, long givenMinutes, long givenSeconds)
	{
		hour = givenHours;
		minute = givenMinutes;
		second = givenSeconds;
		
		// display results
		 System.out.println("Given time is " + hour + ":" + minute + ":" + second + " GMT");
	}
	
	public static long getHour()
	{
		return hour;
	}
	
	public static long getMinute()
	{
		return minute;
	}
	
	public static long getSecond()
	{
		return second;
	}
	
	public static void setTime(long elapseTime)
	{
		// get the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = elapseTime;
						
		// get total seconds since midnight, Jan 1, 1970
		 long totalSeconds = totalMilliseconds / 1000;
						 
		 // compute current second in the minute in the hour
		 second = totalSeconds % 60;
						 
		 // obtain the total minutes
		 long totalMinutes = totalSeconds / 60;
						 
		 // compute the current minute in the hour
		 minute = totalMinutes % 60;
						 
		 // obtain the total hours
		 long totalHours = totalMinutes / 60;
						 
		 // compute the current hour
		 hour = totalHours % 24;
	}
}
