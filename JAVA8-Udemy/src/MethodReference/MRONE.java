package MethodReference;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import functioninterface.Student;
import functioninterface.StudentDataBase;

public class MRONE {
	
	static Consumer<Student> print = System.out::println; 
	
	static Function<String, String> uc1 = (s) -> s.toLowerCase();
	
	static Supplier<List<Student>> listOf = StudentDataBase::getAllStudents;
	
	static Function<String, String> uc = String::toUpperCase;

	public static void main(String[] args) {
		
		//print.accept("HELLO"+"OLLEH");
		
		//print.accept(uc.apply("ok"));
		listOf.get().forEach(print);
		
		
	}

}
