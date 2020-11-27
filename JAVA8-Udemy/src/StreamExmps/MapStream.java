package StreamExmps;

import java.util.stream.Collectors;

import functioninterface.Student;
import functioninterface.StudentDataBase;

public class MapStream {

	public static void main(String[] args) {

		System.out.println(
				StudentDataBase.getAllStudents().stream() //Stream<Student>
				.map(Student::getName) //Stream<String>
				.map(String::toUpperCase) //Stream<String> to uppercase
				.collect(Collectors.toList())); // List<String>
		
		System.out.println(
				StudentDataBase.getAllStudents().stream() //Stream<Student>
				.map(Student::getName) //Stream<String>
				.map(String::toUpperCase) //Stream<String> to uppercase
				.collect(Collectors.toSet())); // Set<String>
	}
}
