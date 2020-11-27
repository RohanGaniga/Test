package streamExmpsTerminalMthds;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import functioninterface.Student;
import functioninterface.StudentDataBase;

public class MinByMaxByExmp {

	public static void main(String[] args) {

		Optional<Student> collect = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.minBy(Comparator.comparing(Student::getName)));

		System.out.println(collect.get());

		Optional<Student> collect1 = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Student::getName)));

		System.out.println(collect1.get());

	}

}
