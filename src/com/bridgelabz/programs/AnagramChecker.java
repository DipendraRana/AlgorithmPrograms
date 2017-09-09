/***********************************************
 * purpose :  Take 2 Strings as Input such abcd
 * 			  and dcba and Check for Anagrams 
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 28 August 2017          
 ***********************************************/

package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class AnagramChecker {

	public static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1=scan.next();
		String word2=scan.next();
		if(Utility.anagramChecker(word1, word2))
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");

	}

}
