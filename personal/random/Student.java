package random;
import java.util.*;

public class Student implements Comparable<Student>{
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
	public int compareTo(Student o) {
		return Integer.compare(this.roll,o.getRoll());
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
		//compare should return 1(positive number) 0 or -1(negative number) to show greater, equal or less
		//I am forcing this to be a noob code, difference or Integer.compare() is like pro
		public int compare(Student s1, Student s2) {
			if(s1.roll>s2.roll) {
				return 1;
			}else if(s1.roll==s2.roll) {
				return 0;
			}else{
				return -1;
			}
			//or return s1.roll-s2.roll also works

		}
	};
}
