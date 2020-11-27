package numberStreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RangeClosedCountforEach {

	public static void main(String[] args) {

		
		IntStream range = IntStream.range(1, 10);
		System.out.println(range.count());
		IntStream.rangeClosed(1, 10)
		.forEach((x) -> {System.out.print(x+",");});
		System.out.println();
		LongStream.range(1, 10)
		.forEach((x) -> {System.out.print(x+",");});
		System.out.println();
		LongStream.range(1, 10)
		.asDoubleStream()
		.forEach((x) -> {System.out.print(x+",");});
		System.out.println();
		IntStream.rangeClosed(1, 10)
		.asDoubleStream()
		.forEach((x) -> {System.out.print(x+",");});
	}

}
