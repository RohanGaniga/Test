package StreamExmps; 

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import functioninterface.Student;
import functioninterface.StudentDataBase;

public class FlatMapExample {

	public static void main(String[] args) {
		
		
		System.out.println(
				StudentDataBase.getAllStudents().stream() //Stream<Student>
				.map(Student::getActivities) //Stream<List<String>>
				.flatMap(List::stream)
				.collect(Collectors.toList())); // List<String>



	}

}
