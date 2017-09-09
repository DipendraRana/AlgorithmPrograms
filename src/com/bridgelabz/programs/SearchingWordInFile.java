/*********************************************************************
 * purpose : Read in a list of words from File. Then prompt the user
 * 			 to enter a word to search the list. The program reports
 * 			 if the search word is found in the list.
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 5 September 2017          
 *********************************************************************/

package com.bridgelabz.programs;

import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SearchingWordInFile {
	
	public static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the address of the file:");
		String address=scan.nextLine();
		System.out.println("Enter the word you want to search:");
		String findWord=scan.next();
		String[] array=Utility.readFromFile(address);
		Utility.bubbleSort(array);
		Utility.binarySearch(array, findWord, 0, array.length-1 );
	}

}
