package StreamExmps;

import java.util.List;

import functioninterface.Student;
import functioninterface.StudentDataBase;

public class AllAnyNoneMatch {


	public static boolean allMatch(List<Student> st) {

		return st.stream()
			.allMatch((stu) -> stu.getGpa()>4.2);
		
	}

	public static boolean anyMatch(List<Student> st) {

		return st.stream()
				.anyMatch((stu) -> stu.getGpa()>4.2);
		
	}

	public static boolean noneMatch(List<Student> st) {

		return st.stream()
				.noneMatch((stu) -> stu.getGpa()>4.2);
		
	}

	public static void main(String[] args) {
		
		System.out.println(allMatch(StudentDataBase.getAllStudents()));
		System.out.println(anyMatch(StudentDataBase.getAllStudents()));
		System.out.println(noneMatch(StudentDataBase.getAllStudents()));

	}

}
