package optional;

import java.util.Optional;

import functioninterface.Bikes;
import functioninterface.Student;
import functioninterface.StudentDataBase;

public class MapFlatmapFilterExample {

	public static void main(String[] args) {

		Optional<Student> stu = Optional.ofNullable(StudentDataBase.getAllStudents().get(0));
		
		Optional<String> stu1 = stu.map(Student::getName);
		System.out.println(stu1.get());
		
		String bikeName = stu.flatMap(Student::getBikes)
		.map(Bikes::getBikeName).get()
		;
		System.out.println(bikeName);
		
		
		
		
	}

}
