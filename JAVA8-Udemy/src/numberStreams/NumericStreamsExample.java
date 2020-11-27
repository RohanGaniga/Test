package numberStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

	public static int sumOfNumbers(List<Integer> integerList) {
		return integerList.stream()
				.reduce(0, (x,y)->{return x+y;});
	}
	public static int sumOfNumbersIntStream() {
		return IntStream.range(0, 10)
				.sum();
	}
	public static void main(String[] args) {
		
		List<Integer> lisOfInteger = Arrays.asList(1,2,3,4,5,6,7,8,9);

		System.out.println(sumOfNumbers(lisOfInteger));
		System.out.println(sumOfNumbersIntStream());
		
		
	}

}
