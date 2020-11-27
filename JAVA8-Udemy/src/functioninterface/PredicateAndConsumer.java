package functioninterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class PredicateAndConsumer {

	static Consumer<Student> stu = (student) -> {System.out.println(student);};
	static BiConsumer<Student, List<String>> stus = (stu,stuact) -> {System.out.println(stu.getName());System.out.print(stu.activities);};
	static BiPredicate<Double,Integer> condition = (gpa, grade) -> gpa>=4 && grade>=3;
	public static void main(String args[]) {
		int[] a = new int[10];
		
		List<Student> listOfStudent = StudentDataBase.getAllStudents();
		listOfStudent.forEach((student) -> {
			
			if(condition.test(student.getGpa(),student.getGradeLevel())) {
				stu.accept(student);
				stus.accept(student, student.getActivities());;
			}
			
		});
		
		
	}
}
