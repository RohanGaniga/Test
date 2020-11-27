package streamExmpsTerminalMthds;

import java.util.stream.Collectors;

import functioninterface.Student;
import functioninterface.StudentDataBase;

public class SummingIntAvgIntExample {

	public static void main(String[] args) {

		int a = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.summingInt(Student::getGradeLevel));

		System.out.println(a);

		double a1 = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.averagingInt(Student::getGradeLevel));

		System.out.println(a1);

	}

}
