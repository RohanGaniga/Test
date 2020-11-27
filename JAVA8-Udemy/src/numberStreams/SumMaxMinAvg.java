package numberStreams;

import java.util.stream.IntStream;

public class SumMaxMinAvg {

	public static void main(String[] args) {

		System.out.println(IntStream.range(1, 10).sum());
		System.out.println(IntStream.range(1, 10).max());
		System.out.println(IntStream.range(1, 10).min());
		System.out.println(IntStream.range(1, 10).average());
		
	}

}
