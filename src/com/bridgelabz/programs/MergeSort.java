/*********************************************************************
 * purpose : Write a program with Static Functions to do Merge Sort of
 * 			 list of Strings. 
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 6 September 2017          
 *********************************************************************/

package com.bridgelabz.programs;

import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class MergeSort {
	
	public static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many elements you want to give:");
		int number=scan.nextInt();
		String[] array=new String[number];
		Utility.insertingElement(array);
		Utility.mergeSort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}

}
