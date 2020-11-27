package StreamExmps;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import functioninterface.Student;
import functioninterface.StudentDataBase;

public class ListToMAp {

	public static void main(String[] args) {

		//using lambda
		Function<Student,String> stu = (student)->{return student.getName();};
		Function<Student,List<String>> act= (student) -> {return student.getActivities();};
		List<Student> sl = StudentDataBase.getAllStudents();
		Map<String,List<String>> stoMap = sl.parallelStream()
				.collect(Collectors.toMap(stu , act));
		//System.out.println(stoMap);

		//using method refernce
		List<Student> sl1 = StudentDataBase.getAllStudents();
		Map<String,List<String>> stoMap1 = sl1.parallelStream()
				.collect(Collectors.toMap(Student::getName , Student::getActivities));
		System.out.println(stoMap1);

		//apply filters
		Map<String,List<String>> stoMap2 = sl1.parallelStream()
				.filter((student) -> {return student.getGpa()>=4;}) // Stream<String> // intermediate Stream API operation
				.filter((student) -> {return student.getGradeLevel()>=3;}) // Stream<String> // intermediate Stream API operation
				.collect(Collectors.toMap(Student::getName , Student::getActivities)); // Map<String,List<String> // terminal Stream API operation
		System.out.println(stoMap2);

	}

}
