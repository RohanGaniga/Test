package functioninterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerExample {

	//static Consumer<Student> c1 = student -> System.out.println(student);
	//static Consumer<Student> c3 = student -> System.out.println(student.activities);
	static BiConsumer<Student, List<String>> c5 = (student,activities) -> {
		System.out.println("The student is : "+student+" and the activites are : "+activities);
	};

	public static void main(String[] args) {

		List<Student> listStudents = StudentDataBase.getAllStudents();
		listStudents.forEach(student -> {
			if(student.getGpa()>=4 && student.getGradeLevel()>=3) {
				c5.accept(student, student.getActivities());
			}
		}

				);




	}

}
