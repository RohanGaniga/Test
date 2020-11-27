package com.info;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currency {
	public static void main(String[] args) {
		Currency c = new Currency();
		Scanner scan = new Scanner(System.in);
		double cur = scan.nextDouble();
		scan.close();
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		String us = nf.format(cur);
		 nf = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
	        String india = nf.format(cur);
	        india = "Rs."+india.substring(1);
	        
	        nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
	        String china = nf.format(cur);
	        nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	        String france = nf.format(cur);
		//nf.setCurrency(US);
		
		
		System.out.println("INDIA: " + india);
      //  System.out.println("India: " + india);
       // System.out.println("China: " + china);
      //  System.out.println("France: " + france);
		
	}

}
