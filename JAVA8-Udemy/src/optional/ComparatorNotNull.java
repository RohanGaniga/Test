package optional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComparatorNotNull {

	public static void main(String[] args) {
		
		List<String> listOfVal = Arrays.asList("One","Two","Three",null);
		
		listOfVal.sort(Comparator.nullsFirst(Comparator.naturalOrder()));// if nulls first is not used this will give null pointer exception

		System.out.println(listOfVal);
		
	}

}
