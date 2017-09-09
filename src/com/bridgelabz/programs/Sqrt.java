/**********************************************************
 * purpose : compute the square root of a nonnegative
 * 			 number c given in the input using Newton's
 * 			 method
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 31 August 2017          
 **********************************************************/

package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Sqrt {
	
	public static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number=scan.nextInt();
		Utility.sqrt(number);
	}

}
