/***********************************************
 * purpose : To store all logic of the Algorithm
 * 			 programs
 *           
 * @author Dipendra Rana
 * @version 5.0
 * @since 24 August 2017          
 ***********************************************/

package com.bridgelabz.utility;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Utility {

	public static Scanner scanner = new Scanner(System.in);

	public static int count = 0,countn=0;
	
	public static ArrayList<String> store;
	
	public static ArrayList<Integer> storeBinary=new ArrayList<Integer>();
	
	public static String[] weeks= {"SUN","MON","TUE","WED","THU","FRI","SAT"};
	
	public static int middleIndex=0;
	
	public static long startTime,stopTime;
	
	public static int incriment=0;
	
	public static long[] elapsedTime=new long[2];	

	public static boolean primeChecker(int number) {
		count=0;
		for(int i=2;i<=number/2;i++) {
			if(number%i==0)
				count++;
		}
		if(count==0)
			return true;
		else
			return false;
	}
	
	public static boolean anagramChecker(String word1,String word2) {
<<<<<<< HEAD
		word1=word1.replaceAll("\\s+", "");
		word2=word2.replaceAll("\\s+", "");
=======
		count=0;
		countn=0;
>>>>>>> c6044c817cfb6da7a23440eade92b26f40ef448d
		if(word1.length()==word2.length()) {
			word1=word1.toLowerCase();
			word2=word2.toLowerCase();
			Character[] copyOfWord1=new Character[word1.length()];
			Character[] copyOfWord2=new Character[word2.length()];
			for(int i=0;i<word1.length();i++) 
				copyOfWord1[i]=word1.charAt(i);
			for(int i=0;i<word2.length();i++) 
				copyOfWord2[i]=word2.charAt(i);
			bubbleSort(copyOfWord1);
			bubbleSort(copyOfWord2);
			if(Arrays.equals(copyOfWord1, copyOfWord2))
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	public static ArrayList<String> primeFinderInRange(int minRange,int maxRange) {
		store=new ArrayList<String>();
		for(int i=minRange;i<maxRange;i++) {
			if(primeChecker(i)&&i!=0&&i!=1) {
				//System.out.println(i);
				store.add(Integer.toString(i));
			}	
		}
		return store;
	}

	public static void primeBothPalindromeAndAnagram(int minRange,int maxRange) {
		ArrayList<String> secondryStorage=new ArrayList<String>();
		primeFinderInRange(minRange,maxRange);
		for(int i=0;i<store.size();i++) {
			if(palindromeChecker(store.get(i)))
				secondryStorage.add(store.get(i));
		}
		int count=0;
		for(int i=0;i<secondryStorage.size();i++) {
			for(int j=i+1;j<secondryStorage.size();j++){ 
				if(anagramChecker(secondryStorage.get(i),secondryStorage.get(j))) {
					System.out.println(secondryStorage.get(i)+" "+secondryStorage.get(j));
					count++;
				}
			}	
		}
		if(count==0)
			System.out.print("There is no Such Prime number");
	}
		
	public static boolean palindromeChecker(String word) {
		count=0;
		int length=word.length();
		for(int i=0,j=length-1;i<=j&&length>1&&j>=i;i++,j--) {
				if(word.charAt(i)!=word.charAt(j))
					return false;
		}
		return true;
	} 
	
	public static int checkNumOfDigits(int number) {
		while(number!=0) {
			number=number/10;
			count++;
		}
		return count;
	}
	
	public static int dayOfWeek(int day,int month,int year) {
		int y0= year-(14-month)/12;
		int x=y0+y0/4-y0/100+y0/400;
		int m0=month+12*((14-month)/12)-2;
		int dayOfWeek=(day+x+31*m0/12)%7;
		return dayOfWeek;
	}
	
	public static void temperatureConversion(int choice) {
		System.out.print("Enter the temperature:");
		double temperature=scanner.nextDouble();
		if(choice==1) {
			temperature=(temperature*9/5)+32;
			System.out.println(temperature+" F");
		}
		else {
			temperature=(temperature-32)*5/9;
			System.out.println(temperature+" C");
		}
	}

	public static void monthlyPayment(int principal,int year,float ratePerYear) {
		int months=12*year;
		float ratePerMonth=ratePerYear/(12*100);
		double payment=(principal*ratePerMonth)/1-Math.pow(1+ratePerMonth, -months);
		System.out.printf("%.2f",payment);
	}
	
	public static void sqrt(double number) {
		double temperory=number;
		double eplison=1e-15;
		while(Math.abs(temperory-number/temperory)>eplison*temperory)
			temperory=(number/temperory+temperory)/2;
		System.out.println(temperory);
	}
	
	public static void convertToBinary(int decimalNo) {
		//ArrayList<Integer> storeBinary=new ArrayList<Integer>();
		int incriment=0;
		while(decimalNo!=0||incriment<32){
			storeBinary.add(decimalNo%2);
			decimalNo=decimalNo/2;
			incriment++;
		}
		Collections.reverse(storeBinary);
		/*System.out.println(storeBinary.toString().replace("[","").
							replace("]","").replace(",", ""));*/
		nibbleSwapper(0,7);
	}
	
	public static void nibbleSwapper(int startingIndex,int lastIndex) {
		if(startingIndex>24&&lastIndex>32) {
			/*System.out.println(storeBinary.toString().replace("[","").
					replace("]","").replace(",", ""));*/
			checkingForPowerOf2(findValueOfBinary());
		}
		else {
			int halfOctet=(lastIndex+startingIndex)/2;
			for(int i=startingIndex,j=halfOctet+1;i<=halfOctet;i++,j++) {
				int temp=storeBinary.get(i);
				storeBinary.set(i, storeBinary.get(j));
				storeBinary.set(j, temp);
			}
			nibbleSwapper(startingIndex+8,lastIndex+8);
		}
	}
	
	public static int findValueOfBinary() {
		int sum=0;
		for(int i=storeBinary.size()-1,j=0;i>-1;i--,j++)
			sum=(int) (sum+storeBinary.get(i)*Math.pow(2, j));
		//System.out.println(sum);
		return sum;
	}
	
	public static void checkingForPowerOf2(int number) {
		int power=(int)(Math.log10(number)/Math.log10(2));
		if(Math.pow(2, power)==number)
			System.out.println(number+" is power of two");
		else
			System.out.println(number+" is Not!!!power of two");
	}

	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> void insertingElement(T[] array) {
		if(array instanceof String[] ) {
			System.out.println("Insert String element");
			for(int i=0;i<array.length;i++)
				array[i]=(T) scanner.next();
		}
		else if(array instanceof Float[]) {
			System.out.println("Insert Float element");
			for(int i=0;i<array.length;i++)
				array[i]=(T) Float.valueOf(scanner.nextFloat());
		}
		else if(array instanceof Double[]) {
			System.out.println("Insert Double element");
			for(int i=0;i<array.length;i++)
				array[i]=(T) Double.valueOf(scanner.nextDouble());
		}
		else if(array instanceof Boolean[]) {
			System.out.println("Insert Float element");
			for(int i=0;i<array.length;i++)
				array[i]=(T) Boolean.valueOf(scanner.nextBoolean());
		}
		else {
			System.out.println("Insert Integer element");
			for(int i=0;i<array.length;i++)
				array[i]=(T) Integer.valueOf(scanner.nextInt());
		}	
		
	}
	
	public static void sortingElapsedTime(long[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=1;j<array.length;j++)
				if(array[j-1]<array[j]) {
					long temporary=array[j-1];
					array[j-1]=array[j];
					array[j]=temporary;
				}
		}
		System.out.println("elapsed times performance(millisecond):"+Arrays.toString(array));
	}
	
	public static <T extends Comparable<T>> void binarySearch(T[] array,
						T intElement,int startingIndex,int lastIndex) {
		middleIndex=(startingIndex+lastIndex)/2;
		if(intElement.equals(array[middleIndex]))
			System.out.println("Found the Word");
		else if(startingIndex==lastIndex)
			System.out.println("There is no such element");
		else {
			if(array[middleIndex].compareTo((T) intElement)>0)	
				binarySearch(array,intElement,startingIndex,middleIndex);
			else
				binarySearch(array,intElement,middleIndex+1,lastIndex);				
		}
	}
	
	public static <T extends Comparable<T>> void bubbleSort(T[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=1;j<array.length;j++) {
				if(array[j-1].compareTo(array[j])>0) {
					T temporary=array[j-1];
					array[j-1]=array[j];
					array[j]=temporary;
				}
			}	
		}
	}
	
	public static <T extends Comparable<T>>void insertionSort(T[] array) {
		for(int i=0;i<array.length;i++) {
			T insertingElement=array[i];
			for(int j=0;j<=i;j++) {
				if(array[j].compareTo(array[i])>0) {
					for(int k=i;k>j;k--)
						array[k]=array[k-1];
					array[j]=insertingElement;
				}
			}
		}
	}	

	public static <T> void casses(T[] array,int choice) {
		if(array instanceof Integer[]&&(choice==1||choice==2))
			integerType((Integer[]) array,choice);
		else
			stringType((String[])array,choice);
	}
	
	public static void integerType(Integer[] array,int choice) {
		startTime=System.currentTimeMillis();
		insertingElement(array);
		if(choice==1)
			bubbleSort(array);
		else
			insertionSort(array);
		stopTime=System.currentTimeMillis();
		elapsedTime[0]=stopTime-startTime;
		System.out.println(Arrays.toString(array));
		System.out.println("Time taken is:"+elapsedTime[0]);
		startTime=System.currentTimeMillis();
		System.out.println("Enter the integer elment you want to search:");
		Integer intElement=Integer.valueOf(scanner.next());
		System.out.println(intElement);
		binarySearch(array,intElement, 0, array.length-1);
		stopTime=System.currentTimeMillis();
		elapsedTime[1]=stopTime-startTime;
		System.out.println("Time taken is:"+elapsedTime[1]);
		Utility.sortingElapsedTime(elapsedTime);

	}
	
	public static void stringType(String[] array,int choice) {
		startTime=System.currentTimeMillis();
		insertingElement(array);
		if(choice==3)
			bubbleSort(array);
		else
			insertionSort(array);
		stopTime=System.currentTimeMillis();
		elapsedTime[0]=stopTime-startTime;
		System.out.println(Arrays.toString(array));
		System.out.println("Time taken is:"+elapsedTime[0]);
		startTime=System.currentTimeMillis();
		System.out.println("Enter the String elment you want to search:");
		String stringElement=scanner.next();
		binarySearch(array,stringElement, 0,array.length-1);
		stopTime=System.currentTimeMillis();
		elapsedTime[1]=stopTime-startTime;
		System.out.println("Time taken is:"+elapsedTime[1]);
		Utility.sortingElapsedTime(elapsedTime);
	}
	
	public static void moneyChangeVendingMachine(int[] denomination,int money,int lastIndex) {
		if(denomination[lastIndex]<=money) {
			int remainder=money%denomination[lastIndex];
			money=money/denomination[lastIndex];
			System.out.format("%16d  %13d",denomination[lastIndex],money);
			System.out.println();
			if(remainder!=0) {
				moneyChangeVendingMachine(denomination,remainder,lastIndex-1);
			}
		}
		else {
			moneyChangeVendingMachine(denomination,money,lastIndex-1);
		}
	}
	
	public static void guessingYourNumber(int lowerIndex,int higherIndex) {
		int middleIndex=(lowerIndex+higherIndex)/2;
		if(lowerIndex==higherIndex) 
			System.out.println(middleIndex+" is the number.");
		else {
			System.out.println("Is your number between "+lowerIndex+" and "+middleIndex);
			String answer1=scanner.next();
			if(answer1.contains("yes")) 
				guessingYourNumber(lowerIndex, middleIndex);
			else 
				guessingYourNumber(middleIndex+1, higherIndex);
		}		
	}
	
	public static String[] readFromFile(String address) throws IOException {
		@SuppressWarnings("resource")
		BufferedReader file=new BufferedReader(new InputStreamReader(new FileInputStream(address)));		
		String lines=null;
		ArrayList<String> words=new ArrayList<String>();
		while((lines=file.readLine())!=null)
			words.add(lines);
		String[] cloneWords=words.toArray(new String[words.size()]);
		for(int i=0;i<cloneWords.length;i++) {
			cloneWords[i]=cloneWords[i].replaceAll("[()?:!.,;{}]+", "");
		}
		words.clear();
		for(int i=0;i<cloneWords.length;i++) {
			ArrayList<String> newWords=new ArrayList<String>(Arrays.asList(cloneWords[i].split("\\s+")));
			for(int j=0;j<newWords.size();j++)
				words.add(newWords.get(j));
		}
		cloneWords=words.toArray(new String[words.size()]);
		/*System.out.println(Arrays.toString(cloneWords));*/
		return cloneWords;
	}
	
	public static <T extends Comparable<T>> void merge(T[] array,int lowerIndex,int middleIndex,int higherIndex) {
		int sizeOfLeftArray=(middleIndex-lowerIndex)+1;
		int sizeOfRightArray=higherIndex-middleIndex;
		ArrayList<T> leftArray=new ArrayList<T>();;
		ArrayList<T> rightArray=new ArrayList<T>();;
		int k=0,i=0,j=0;
		for(i=lowerIndex;i<=middleIndex;i++) {
			leftArray.add(array[i]);
			k++;
		}
		k=0;
		for(i=middleIndex+1;i<=higherIndex;i++) {
			rightArray.add(array[i]);
			k++;
		}
		i=0;
		k=0;
		while(i<sizeOfLeftArray&&j<sizeOfRightArray) {
			if((leftArray.get(i)).compareTo(rightArray.get(j))<0||leftArray.get(i).compareTo(rightArray.get(j))==0) {
				array[lowerIndex+k]=leftArray.get(i);
				i++;
			}	
			else {
				array[lowerIndex+k]=rightArray.get(j);
				j++;
			}
			k++;
		}
		while(i<sizeOfLeftArray||j<sizeOfRightArray) {
			if(i<sizeOfLeftArray) {
				array[lowerIndex+k]=leftArray.get(i);
				i++;
			}
			else {
				array[lowerIndex+k]=rightArray.get(j);
				j++;
			}
			k++;
		}
	}
	
	public static <T extends Comparable<T>> void mergeSort(T[] array,int lowerIndex,int higherIndex) {
		if(lowerIndex<higherIndex) {
			int middleIndex=(lowerIndex+higherIndex)/2;
			mergeSort(array,lowerIndex,middleIndex);
			mergeSort(array,middleIndex+1,higherIndex);
			merge(array,lowerIndex,middleIndex,higherIndex);
		}
	}	

	public static void stringPermutationRecursion(char[] word,String[] storeWords,int startingIndex,int lastIndex) {
		if(startingIndex==lastIndex) {
			System.out.println(Arrays.toString(word)+" "+(incriment+1));
			storeWords[incriment]=String.copyValueOf(word);
			incriment++;
		}	
		else {
			for(int i=startingIndex;i<=lastIndex;i++) {
				swap(word,startingIndex,i);
				stringPermutationRecursion( word,storeWords, startingIndex+1, lastIndex);
				swap(word,startingIndex,i);
			}
		}
	}
		
	public static void swap(char[] array,int constantIndex,int incrimentalIndex) {
		char temp=array[constantIndex];
		array[constantIndex]=array[incrimentalIndex];
		array[incrimentalIndex]=temp;
		
	}
	
	public static int factorial(int number) {
		if(number==0||number==1)
			return 1;
		else
			return number=number*factorial(number-1);
	} 

	public static void checkForWord(String sourceAddress,String findWord) throws IOException {
		List<String> array=new LinkedList<String>(Arrays.asList(readFromFile(sourceAddress)));
		if(array.contains(findWord)) {
			System.out.println("Found the word.....removing from list");
			array.remove(findWord);
		}	
		else {
			System.out.println("Not Found the word.....Adding the word to list");
			array.add(findWord);
		}
		System.out.println("Enter the file name to which the array is going to be stored:");
		String destinationAddress=scanner.nextLine();
		FileWriter file=new FileWriter(destinationAddress);
		PrintWriter writeToFile=new PrintWriter(file);
		for(String word : array) 
			writeToFile.write(word+" ");
		file.close();
		//System.out.println(array);
	}

	public static void checkForNumber(String sourceAddress,Integer findNumber) throws IOException {
		String[] stringArray=readFromFile(sourceAddress);
		List<Integer> integerArray=new LinkedList<Integer>();
		for(int i=0;i<stringArray.length;i++)
			integerArray.add(i, Integer.parseInt(stringArray[i]));
		if(integerArray.contains(findNumber)) {
			System.out.println("Found the number.....removing from list");
			integerArray.remove(findNumber);
		}	
		else {
			System.out.println("Not Found the number.....Adding to list");
			integerArray.add(findNumber);
		}
		Collections.sort(integerArray);
		System.out.println("Enter the file name to which the array is going to be stored:");
		String destinationAddress=scanner.nextLine();
		FileWriter file=new FileWriter(destinationAddress);
		PrintWriter writeToFile=new PrintWriter(file);
		for(Integer number : integerArray) 
			writeToFile.write(number+" ");
		file.close();
		
	}

}