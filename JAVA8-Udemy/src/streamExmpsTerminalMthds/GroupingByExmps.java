package streamExmpsTerminalMthds;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

import functioninterface.Student;
import functioninterface.StudentDataBase;

public class GroupingByExmps {

	public static void main(String[] args) {
		System.out.println("TYPE 1");
		//Type1
		Map<String,List<Student>> mapStu = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(Student::getGender));
		System.out.println(mapStu);
		Map<String,List<Student>> mapStu1 = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy((st) -> st.getGpa()>3.9?"NICE":"NOTNICE"));
		System.out.println(mapStu1);
		
		System.out.println("TYPE 2");
		//type 2
		Map<String,Set<Student>> mapStu2 = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(Student::getGender,Collectors.toSet()));
		System.out.println(mapStu2);
		
		Map<Integer,Map<String,List<Student>>> mapStu3 = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.groupingBy((s)->s.getGpa()>3.9?"NICE":"NOTNICE")));
		System.out.println(mapStu3);
		
		Map<Integer,Integer> mapStu4 = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.summingInt	(Student::getGradeLevel)));
		System.out.println(mapStu4);
		
		System.out.println("Collecting and then");
		Map<Integer, Optional<Student>> mapStucomp = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.maxBy(Comparator.comparing(Student::getName))));
		System.out.println(mapStucomp);
		Map<Integer, Student> mapStucomp2 = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getName)), Optional::get)));
		System.out.println(mapStucomp2);
		
		
		
		System.out.println("TYPE 3");
		//type 3
		HashMap<Integer,Set<Student>> mapStu5 = StudentDataBase.getAllStudents()
				.stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,HashMap::new,Collectors.toSet()));
		System.out.println(mapStu5);

	}

}
