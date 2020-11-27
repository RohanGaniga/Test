package numberStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxInboxMactoInt {

	public static void main(String[] args) {
		List<Integer> ints = IntStream.range(1, 10)
		.boxed()
		.collect(Collectors.toList());
		
		System.out.println(ints);
		
		System.out.println();
		
		
		List<Integer> inn = IntStream.range(1, 10)
				.mapToObj((x)->new Integer(x))//intStream // wrapper to primitive
				.collect(Collectors.toList());
				
				System.out.println(inn);
		
		System.out.println(ints.stream() //Stream
				.mapToInt(Integer::intValue)//intStream // wrapper to primitive
				.sum());
		
		System.out.println(ints.stream() //Stream
				.mapToDouble(Integer::doubleValue)//intStream // wrapper to primitive
				.sum());
		IntStream.range(1, 10)
		.mapToDouble((x)->x)//intStream // wrapper to primitive
		.sum();
		
		System.out.println(ints.stream() //Stream
				.mapToLong(Integer::longValue)//intStream // wrapper to primitive
				.sum());
		
		
	}
}
