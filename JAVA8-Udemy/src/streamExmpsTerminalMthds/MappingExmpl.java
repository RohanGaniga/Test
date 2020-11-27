package streamExmpsTerminalMthds;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import functioninterface.Student;
import functioninterface.StudentDataBase;

public class MappingExmpl {

	public static void main(String[] args) {

		List<String> s = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.mapping(Student::getName, Collectors.toList()));
		System.out.println(s);

		Set<String> s1 = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.mapping(Student::getName, Collectors.toSet()));
		System.out.println(s1);

	}

}
