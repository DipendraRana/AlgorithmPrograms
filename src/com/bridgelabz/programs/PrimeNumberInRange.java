/***********************************************
 * purpose : Take a range of 0 - 1000 Numbers
 * 			 and find the Prime numbers in that
 * 			 range
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 28 August 2017          
 ***********************************************/

package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrimeNumberInRange {
	
	public static Scanner input=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minRange=input.nextInt();
		int maxRange=input.nextInt();
		System.out.println(Utility.primeFinderInRange(minRange, maxRange));
	}

}
