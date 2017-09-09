/**************************************************
 * purpose : take a date as input and prints
 * 			 the day of the week that date falls on.
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 31 August 2017          
 **************************************************/

package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day=Integer.parseInt(args[0]);
		int month=Integer.parseInt(args[1]);
		int year=Integer.parseInt(args[2]);
		System.out.println(Utility.weeks[Utility.dayOfWeek(day, month, year)]);
	}

}
