/***********************************************
 * purpose : Reads in strings from standard
 * 			 input and prints them in sorted
 * 			 order.Uses insertion sort.
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 4 September 2017          
 ***********************************************/

package com.bridgelabz.programs;

import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class InsertionSort {
	
	public static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many words you want to insert:");
		int size=scan.nextInt();
		String[] words=new String[size];
		Utility.insertingElement(words);
		Utility.insertionSort(words);
		System.out.println(Arrays.toString(words));
	}

}
