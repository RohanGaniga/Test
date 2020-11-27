package functioninterface;

import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateExample {

	
	static BiPredicate<Integer,Double> avg = (gradeLevel,gpa) -> gpa>=4 && gradeLevel>=3;
	
	public static void main(String[] args) {
		
		List<Student> listStudents = StudentDataBase.getAllStudents();
		
		listStudents.forEach(student -> {
			if(avg.test(student.getGradeLevel(), student.getGpa())) {
				System.out.println(student);
			}
		});
		

	}

}
