/**********************************************************
 * purpose : Create Utility Class having following static methods
 *			 binarySearch method for integer
 *			 binarySearch method for String
 *			 insertionSort method for integer
 *			 insertionSort method for String
 *			 bubbleSort method for integer
 *			 bubbleSort method for String
 *
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 2 September 2017          
 **********************************************************/

package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**
 * @author Dipendra Rana
 * @version 1.0
 * @since 31 September 2017   
 */
public class SortSearchElapseTime {
	
	public static Scanner scan=new Scanner(System.in);
	
	public static int numberOfElement;
	
	public static String[] stringArray;
	
	public static Integer[] intArray;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Choose the operation:");
		System.out.println("1.Bubble Sort-Binary Search(Int)");
		System.out.println("2.Insertion Sort-Binary Search(Int)");
		System.out.println("3.Bubble Sort-Binary Search(String)");
		System.out.println("4.Insertion Sort-Binary Search(String)");
		int choice=scan.nextInt();
		switch(choice) {
		case 1: System.out.println("Enter the number of element you want:");;
				numberOfElement=scan.nextInt();
				intArray= new Integer[numberOfElement];
				Utility.casses(intArray,1);
				break;

		case 2:	System.out.println("Enter the number of element you want:");;
				numberOfElement=scan.nextInt();
				intArray= new Integer[numberOfElement];
				Utility.casses(intArray,2);
				break;
				
		case 3:	System.out.println("Enter the number of element you want:");;
				numberOfElement=scan.nextInt();
				stringArray= new String[numberOfElement];
				Utility.casses(stringArray,3);
				break;
				
		case 4:	System.out.println("Enter the number of element you want:");;
				numberOfElement=scan.nextInt();
				stringArray= new String[numberOfElement];
				Utility.casses(stringArray,4);
				break;
		}
	}
}
