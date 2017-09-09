/*********************************************************************
 * purpose : takes a command-line argument N, asks you to think of a
 * 			 number between 0 and N-1, where N = 2^n, and always
 * 			 guesses the answer with n questions.
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 5 September 2017          
 *********************************************************************/

package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class FindYourNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		int number=Integer.parseInt(args[0]);
		System.out.println("Guess any number between 0 to "+number);
		Utility.guessingYourNumber(0, number);
		
	}

}
