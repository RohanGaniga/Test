package streamExmpsTerminalMthds;

import java.util.stream.Collectors;

import functioninterface.StudentDataBase;

public class CountingExample {

	public static void main(String[] args) {

		long count = StudentDataBase.getAllStudents()
		.stream()
		.collect(Collectors.counting());
		
		System.out.println(count);
	}

}
