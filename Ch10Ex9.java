import java.util.*;

public class Ch10Ex9 {

	public static void main(String[] args) {
		// create a course
		Course biology = new Course("Biology");
		
		// add 3 students
		biology.addStudent("Jennifer");
		biology.addStudent("Whitney");
		biology.addStudent("Alex");

		
		// remove on student
		biology.dropStudent("Jennifer");
		
		// display the students in the course
		biology.getStudents();
		System.out.println();

		
	}

}
