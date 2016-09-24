import java.util.*;

public class Course {

	private String courseName;
	private static String[] students = new String[100];
	private int numberOfStudents;
	public ArrayList studentsPlus;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}

	public static void flexStudents()
	{
		ArrayList studentsPlus = new ArrayList();
		Collections.addAll(studentsPlus, students);
		
	}
	
	public void addStudent(String student) {
		students[numberOfStudents + 1] = student;
		numberOfStudents++;
	}

	public ArrayList getStudents() {
		flexStudents();
		return studentsPlus;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
		String students2 = String.valueOf(students);
		int i = students2.indexOf(student);
		System.out.println(students2);
		numberOfStudents--;	}
	
	public void clear(String array[])
	{
		Arrays.fill( array, null );	
	}
}