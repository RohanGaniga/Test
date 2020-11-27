package functioninterface;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	static Consumer<Student> c1 = student -> System.out.println(student);
	static Consumer<Student> c2 = student -> System.out.println(student.getName());
	static Consumer<Student> c3 = student -> System.out.println(student.activities);
	
	public static void main(String[] args) {

		List<Student> listOdStudent = StudentDataBase.getAllStudents();
		listOdStudent.forEach(c1);
		System.out.println("Second");
		listOdStudent.forEach(student -> {
			if(student.getGpa()>=4 && student.getGradeLevel()>=3) {
				c2.andThen(c3).accept(student);;
			}
		});
		
		
		
	}

}
