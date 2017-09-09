/**********************************************************
 * purpose : given the temperature in fahrenheit as input
 * 			 outputs the temperature in Celsius or
 * 			 vice-versa
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 31 August 2017          
 **********************************************************/

package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TemperatureConversion {
	
	public static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the choice:");
		System.out.println("1. Celsius-Fahrenheit");
		System.out.println("2. Fahrenheit-Celsius");
		int choice=scan.nextInt();
		switch(choice) {
		case 1: Utility.temperatureConversion(1);
				break;
		case 2: Utility.temperatureConversion(2);
				break;
		}
	}

}
