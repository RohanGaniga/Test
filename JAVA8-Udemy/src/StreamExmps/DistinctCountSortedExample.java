package StreamExmps;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import functioninterface.Student;
import functioninterface.StudentDataBase;

public class DistinctCountSortedExample {

	public static void main(String[] args) {

		System.out.println(
				StudentDataBase.getAllStudents().stream() //Stream<Student>
				.map(Student::getActivities) //Stream<List<String>>
				.flatMap(List::stream)
				.distinct()
				.sorted()
				.collect(Collectors.toList())); // List<String>

		System.out.println(
				StudentDataBase.getAllStudents().stream()
				.count()
				);


		System.out.println(
				StudentDataBase.getAllStudents().stream() //Stream<Student>
				.sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(Collectors.toList())); // List<String>

	}

}
