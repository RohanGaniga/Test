package optional;

import java.util.Optional;

import functioninterface.Student;
import functioninterface.StudentDataBase;

public class EmptyOffnullableOfExamples {
	
	public static void main(String[] args) {
		
		Optional<Student> stu = Optional.ofNullable(StudentDataBase.getAllStudents().get(0));
		System.out.println("ofNullable : " + stu.get());
		
		Optional<Student> stu1 = Optional.ofNullable(null);
		System.out.println("ofNullablenull : " + stu1);
		
		Optional<String> s = Optional.empty();
		System.out.println("Empty : "+(s.isPresent()?s.get():s));
		
		Optional<Student> stu3 = Optional.of(StudentDataBase.getAllStudents().get(0));
		System.out.println("of : " + stu3.get());
		
		//this gives error. This is the diff between ofNullable and of
		Optional<Student> stu4 = Optional.of(null);
		System.out.println("ofnull : " + stu4);
		
	}

}
