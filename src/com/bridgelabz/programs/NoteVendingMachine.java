/************************************************************************
 * purpose : There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which
 * 			 can be returned by Vending Machine. Write a Program to
 * 			 calculate the minimum number of Notes as well as the Notes
 * 			 to be returned by the Vending Machine as a Change.
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 4 September 2017          
 ************************************************************************/

package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class NoteVendingMachine {
	
	public static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] denomination= {1,2,5,10,50,100,500,1000};
		System.out.println("Enter the amont you have:");
		int money=scan.nextInt();
		System.out.println("Denomination(Rs)  numberOfnotes");
		Utility.moneyChangeVendingMachine(denomination, money, 7);

	}

}
