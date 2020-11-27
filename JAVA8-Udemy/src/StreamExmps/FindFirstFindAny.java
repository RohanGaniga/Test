package StreamExmps;

import java.util.Optional;

import functioninterface.Student;
import functioninterface.StudentDataBase;

public class FindFirstFindAny {

	public static void main(String[] args) {
		
		
		Optional<Student> stu = StudentDataBase.getAllStudents()
				.stream()
				.filter((Stu) -> Stu.getGpa()>=3.9)
				.findFirst();
		
		Optional<Student> stu1 = StudentDataBase.getAllStudents()
				.stream()
				.filter((Stu) -> Stu.getGpa()>=3.9)
				.findAny();
		
		System.out.println(stu);
		System.out.println(stu1);

	}

}
