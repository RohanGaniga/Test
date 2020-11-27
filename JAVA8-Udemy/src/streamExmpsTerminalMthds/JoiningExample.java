package streamExmpsTerminalMthds;

import java.util.stream.Collectors;

import functioninterface.Student;
import functioninterface.StudentDataBase;

public class JoiningExample {

	public static void main(String[] args) {


		String s = StudentDataBase.getAllStudents()
				.stream()
				.map(Student::getName)
				.collect(Collectors.joining());

		System.out.println(s);

		String s1 = StudentDataBase.getAllStudents()
				.stream()
				.map(Student::getName)
				.collect(Collectors.joining(","));

		System.out.println(s1);
		
		String s2 = StudentDataBase.getAllStudents()
				.stream()
				.map(Student::getName)
				.collect(Collectors.joining(",","{","}"));

		System.out.println(s2);

	}

}
