package random;

import java.util.*;

public class YearBook {

	public static void main(String[] args) {
		List<Student> studentList=new ArrayList<>();

		
		studentList.add(FinalYearStudents.Jane);
		studentList.add(FinalYearStudents.John);
		studentList.add(FinalYearStudents.Monica);
		
/*		System.out.println("Before sort\n");
		for(Student stud:studentList) {
			System.out.println(stud);
		}
		
		Collections.sort(studentList,Student.rollComparator);
		System.out.println("After sort\n");
		for(Student stud:studentList) {
			System.out.println(stud);
		}*/
		
		studentList.add(FinalYearStudents.Monica);
		
		System.out.println("Before sort\n");
		for(Student stud:studentList) {
			System.out.println(stud);
		}
		
		
		Collections.sort(studentList,Student.BY_ROLL);
		System.out.println("After sort\n");
		for(Student stud:studentList) {
			System.out.println(stud);
		}
		
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
