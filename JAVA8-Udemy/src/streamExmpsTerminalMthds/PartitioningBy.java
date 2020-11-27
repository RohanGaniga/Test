package streamExmpsTerminalMthds;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import functioninterface.Student;
import functioninterface.StudentDataBase;

public class PartitioningBy {

	public static void main(String[] args) {
		Predicate<Student> p = (s) -> s.getGpa()>3.5;
		
		Map<Boolean, List<Student>> collect = StudentDataBase.getAllStudents()
		.stream()
		.collect(Collectors.partitioningBy(p));
		System.out.println(collect);
		
		Map<Boolean, Set<Student>> collect1 = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.partitioningBy(p,Collectors.toSet()));
				System.out.println(collect1);
	}

}
