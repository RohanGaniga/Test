package MethodReference;

import java.util.function.Function;
import java.util.function.Supplier;

import functioninterface.Student;

public class ConstructorRes {

	static Supplier<Student> stu = Student::new; 
	
	static Function<String,Student> stuname = Student::new;
	
	public static void main(String[] args) {
		
		System.out.println(stu.get());
		
		System.out.println(stuname.apply("Ron").getName());

	}

}
