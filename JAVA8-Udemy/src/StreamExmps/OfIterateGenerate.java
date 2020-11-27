package StreamExmps;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class OfIterateGenerate {

	public static void main(String[] args) {

		
		Stream<String> someStr = Stream.of("Hello","Hi","Hello");
		someStr.forEach(System.out::println);
		
		Stream.iterate(1, (x) -> x+1)
		.limit(10)
		.forEach(System.out::println);
		
		Supplier<Integer> ranNum = new Random()::nextInt;
		Stream.generate(ranNum)
		.limit(10)
		.forEach(System.out::println);
		
	}

}
