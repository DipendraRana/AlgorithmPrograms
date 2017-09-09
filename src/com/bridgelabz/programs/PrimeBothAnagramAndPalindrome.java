/***********************************************
 * purpose : find the prime numbers that are
 * 			 Anagram and Palindrome 
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 31 August 2017          
 ***********************************************/

package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrimeBothAnagramAndPalindrome {
	
	public static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minRange=scan.nextInt();
		int maxRange=scan.nextInt();
		Utility.primeBothPalindromeAndAnagram(minRange, maxRange);

	}

}
