/**********************************************************
 * purpose : outputs the binary (base 2) representation of
 * 			 the decimal number typed as the input.
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 31 August 2017          
 **********************************************************/

package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class ToBinary {
	
	public static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int decimalNo = scan.nextInt();
			Utility.convertToBinary(decimalNo);
	}
}
