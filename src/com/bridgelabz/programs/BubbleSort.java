/***********************************************
 * purpose : Reads in integers prints them in
 * 			 sorted order using Bubble Sort
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 4 September 2017          
 ***********************************************/

package com.bridgelabz.programs;

import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BubbleSort {
	
	public static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many words you want to insert:");
		int size=scan.nextInt();
		Integer[] numbers=new Integer[size];
		Utility.insertingElement(numbers);
		Utility.bubbleSort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

}
