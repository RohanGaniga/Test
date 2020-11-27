package com.info;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Day {
	public static void main(String[] args) {
		int a = 3;
		int b = 9;
		int cc = 2019;
		String[] day = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		Calendar c = null;
		try{
			String str = String.valueOf(a)+"/"+String.valueOf(b)+"/"+String.valueOf(cc);
			
			SimpleDateFormat s = new SimpleDateFormat("MM/dd/yyyy");
			Date d = s.parse(str);
			c = Calendar.getInstance();
			c.setTime(d);
			System.out.println(day[c.get(Calendar.DAY_OF_WEEK)-1]);
		}
		catch(ParseException e){
			
		}
		System.out.println(day[c.get(Calendar.DAY_OF_WEEK)-1]);
	}
}
