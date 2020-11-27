package StreamExmps;

import java.util.Arrays;
import java.util.List;

public class LimitAndSkip {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,3,5,7);
		System.out.println(numbers.stream()
				.skip(2)
				.reduce(0,Integer::sum));
		
		System.out.println(numbers.stream()
				.limit(2)
				.reduce(0,Integer::sum));

	}

}
