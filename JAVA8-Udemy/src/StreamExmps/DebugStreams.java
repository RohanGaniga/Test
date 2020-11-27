package StreamExmps;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import functioninterface.Student;
import functioninterface.StudentDataBase;

public class DebugStreams {

	public static void main(String[] args) {

		Map<String,List<String>> stoMap2 = StudentDataBase.getAllStudents().stream()
				.peek((student) -> {System.out.println(student);})
				.filter((student) -> {return student.getGpa()>=3;}) // Stream<String> // intermediate Stream API operation
				.peek((student) -> {System.out.println("FIRST FILTER "+student);})
				.filter((student) -> {return student.getGradeLevel()>=3;}) // Stream<String> // intermediate Stream API operation
				.peek((student) -> {System.out.println("SECOND FILTER "+student);})
				.collect(Collectors.toMap(Student::getName , Student::getActivities)); // Map<String,List<String> // terminal Stream API operation
		//System.out.println(stoMap2);
		
	}
}
