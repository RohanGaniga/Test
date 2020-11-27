package functioninterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class BiFunctionExample {
	
	static BiFunction<List<Student>,BiPredicate<Double,Integer>,Map<String,Double>> func1 = (someString,predic) -> {

		Map<String,Double> na = new HashMap<String,Double>();

		someString.forEach((studen) -> 

		{if(predic.test(studen.getGpa(), studen.getGradeLevel())) {

			na.put(studen.getName(), studen.getGpa());
		}
		}

				);

		return na;
	};

	public static void main(String[] args) {
		List<Student> students = StudentDataBase.getAllStudents();
		System.out.println(func1.apply(students,PredicateAndConsumer.condition ));

	}

}
