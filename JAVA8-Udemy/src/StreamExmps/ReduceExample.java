package StreamExmps;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import functioninterface.Student;
import functioninterface.StudentDataBase;

public class ReduceExample {
	
	
	public static int mulNumbers(List<Integer> num) {
		return num.stream().
				//take integer on eby one
				//first iteration a = 1, b = 1 //we have set 1 as the default value
				//second a = 1 , b = 3 //a is the result of the previous iteration 1*1=>a*b
				//third a = 3 , b = 5 
				//fourth a = 15 b = 7
				
				reduce(1, (a,b) -> a*b);
	}
	
	
	public static Optional<Integer> mulNumberswithoutdefault(List<Integer> num) {
		return num.stream().
				//take integer on eby one
				//first iteration a = 1, b = 1 //we have set 1 as the default value
				//second a = 1 , b = 3 //a is the result of the previous iteration 1*1=>a*b
				//third a = 3 , b = 5 
				//fourth a = 15 b = 7
				
				reduce((a,b) -> a*b);
	}

	public static int sumNumbers(List<Integer> num) {
		return num.stream().
				//take integer on eby one
				//first iteration a = 1, b = 1 //we have set 1 as the default value
				//second a = 1 , b = 3 //a is the result of the previous iteration 1*1=>a*b
				//third a = 3 , b = 5 
				//fourth a = 15 b = 7
				reduce(1, Integer::sum);
	}
	
	public static Optional<Student> maxGrade() {
		return StudentDataBase.getAllStudents().stream()
				//take integer on eby one
				//first iteration a = 1, b = 1 //we have set 1 as the default value
				//second a = 1 , b = 3 //a is the result of the previous iteration 1*1=>a*b
				//third a = 3 , b = 5 
				//fourth a = 15 b = 7
				.reduce((s1,s2) -> s1.getGpa()>s2.getGpa()?s1:s2);
	}
	
	
	
	public static void main(String[] args) {
		
		
		/*StudentDataBase.getAllStudents().stream()
		.map(Student::getGradeLevel)
		.reduce(1, (a,b) -> {return a*b;});*/
		
		List<Integer> numbers = Arrays.asList(1,3,5,7);
		System.out.println(mulNumbers(numbers));
		System.out.println(mulNumberswithoutdefault(numbers).get());
		System.out.println(sumNumbers(numbers));
		System.out.println(maxGrade().get());
	}

}
