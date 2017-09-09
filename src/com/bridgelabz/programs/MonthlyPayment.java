/**********************************************************
 * purpose : three command-line arguments P, Y, and R and
 * 			 calculates the monthly payments you would have
 * 			 to make over Y years to pay off a P principal
 * 			 loan amount at R per cent interest compounded
 * 			 monthly.
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 31 August 2017          
 **********************************************************/

package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class MonthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int principal=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		float ratePerYear=Float.parseFloat(args[2]);
		Utility.monthlyPayment(principal, year, ratePerYear);

	}

}
