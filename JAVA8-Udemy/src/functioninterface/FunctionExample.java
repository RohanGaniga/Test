package functioninterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionExample {

	static Function<String,String> func = (someString) -> {return someString.toUpperCase();};
	static Function<String,String> add = (someString) -> {return someString.concat("one");};
	
	static Function<String,String> func2 = (someString) -> {return someString.toUpperCase();};
	static Function<String,String> add2 = (someString) -> {return someString.concat("two");};
	static Function<String,String> func3 = (someString) -> {return someString.toUpperCase();};
	static Function<String,String> add3 = (someString) -> {return someString.concat("three");};
	static Function<String,String> func4 = (someString) -> {return someString.toUpperCase();};
	static Function<String,String> add4 = (someString) -> {return someString.concat("four");};
	
	static Function<Map<String,Double>,String> first = (student) -> {System.out.println(student.keySet()); return student.toString();};
	static Function<List<Student>,Map<String,Double>> func1 = (someString) -> {

		Map<String,Double> na = new HashMap<String,Double>();

		someString.forEach((studen) -> 

		{if(PredicateAndConsumer.condition.test(studen.getGpa(), studen.getGradeLevel())) {

			na.put(studen.getName(), studen.getGpa());
		}
		}

				);

		return na;
	};

	public static void main(String[] args) {

		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach((student) -> System.out.println(func.compose(add).compose(add2).andThen(add4).apply(student.getName())));
		
		//func1.andThen(first).apply(students);
		
		
	}

}
