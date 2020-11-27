package optional;

import java.util.Optional;

import functioninterface.Student;
import functioninterface.StudentDataBase;

public class OrElseOrElseGetOrElseThrow {

	public static void main(String[] args) {

		Optional<Student> stu = Optional.ofNullable(StudentDataBase.getAllStudents().get(0));
		System.out.println(stu.map(Student::getName).orElse("NOPE"));

		Optional<Student> stu1 = Optional.ofNullable(null);
		System.out.println(stu1.map(Student::getName).orElse("NOPE"));
		
		System.out.println(stu1.map(Student::getName).orElseGet(()->{return "NOPESUPPLIER";}));
		
		System.out.println(stu1.map(Student::getName).orElseThrow(()->{throw new RuntimeException("YEAH, NO");}));


	}

}
