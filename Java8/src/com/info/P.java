package com.info;

import java.util.Scanner;

public class P {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range");
		String prime = "2,3,5";
		int range = scan.nextInt();
		int count;
		for(int i = 2 ;i <= range ; i++){
			count = 0;
			for(int j = 2; j<i ; j++ ){
				if(i%j == 0){
					count ++;
					break;
				}
			}
			if(count == 0 ){

				System.out.print(i+" ");
			}

		}

	}
}

