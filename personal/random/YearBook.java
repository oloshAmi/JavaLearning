package random;

import java.util.*;

public class YearBook {

	public static void main(String[] args) {
		List<Student> studentList=new ArrayList<>();

		
		studentList.add(FinalYearStudents.Jane);
		studentList.add(FinalYearStudents.John);
		studentList.add(FinalYearStudents.John);
		studentList.add(FinalYearStudents.Monica);

		//Tryout Iterator interface application to print
		Iterator<Student> studentIterator=studentList.iterator();
		
		System.out.println("Before sort\n");
		while(studentIterator.hasNext()) {
			System.out.println(studentIterator.next());
		}
		// Use comparator contained in the student class, old style
		//Collections.sort(studentList,Student.rollComparator);

		//Use comparator in a separate class
		Collections.sort(studentList,new StudentComparator());
		System.out.println("After sort\n");
		for(Student stud:studentList) {
			System.out.println(stud);
		}

		//Reverse Sorting
		Collections.sort(studentList,new ReverseComparator<>(new StudentComparator()));
		System.out.println("Reverse sort\n");
		for(Student stud:studentList) {
			System.out.println(stud);
		}
		//Using Comparable interface (student is now comparable also)
		studentList.add(FinalYearStudents.Leonard);

		System.out.println("Before sort\n");
		for(Student stud:studentList) {
			System.out.println(stud);
		}

		Collections.sort(studentList);
		System.out.println("After sort\n");
		for(Student stud:studentList) {
			System.out.println(stud);
		}

		/*
		studentList.add(FinalYearStudents.Monica);
		
		System.out.println("Before sort\n");
		for(Student stud:studentList) {
			System.out.println(stud);
		}
		
		//Comparator contained in the student class, modern style
		Collections.sort(studentList,Student.BY_ROLL);
		System.out.println("After sort\n");
		for(Student stud:studentList) {
			System.out.println(stud);
		}
		*/
		/*studentList.add(FinalYearStudents.Leonard);
		
		System.out.println("Before sort\n");
		for(Student stud:studentList) {
			System.out.println(stud);
		}
		studentList.sort(Student.BY_ROLL);	

		
		System.out.println("After sort\n");
		for(Student stud:studentList) {
			System.out.println(stud);
		}
*/
	}


}
