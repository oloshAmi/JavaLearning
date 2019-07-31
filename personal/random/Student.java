package random;
import java.util.*;

public class Student{
	private String name;
	private int roll;
	public Student(String name, int roll) {
		this.name=name;
		this.roll=roll;
	}

	public String getName() {
		return name;
	}
	public int getRoll() {
		return roll;
	}
	
	@Override
	public String toString() {
		return "Name:"+ this.name+"\tRoll:"+this.roll;
	}
	//Modern style, lambda
	public static final Comparator<Student> BY_ROLL=Comparator.comparing(Student::getRoll);

	//Java 7 style
	public static Comparator<Student> rollComparator=new Comparator<Student>() {

		@Override
		//Wrong implementation
		public int compare(Student s1, Student s2) {
			if(s1.roll>s2.roll) {
				return s1.roll;
			}else {
				return s2.roll;
			}

		}
	};
}
