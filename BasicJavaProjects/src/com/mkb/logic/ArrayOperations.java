package com.mkb.logic;

import java.util.Scanner;

public class ArrayOperations {

	// find even
	public static void findEven(int[] a) {
		for (int i = 0; i < a.length; ++i) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
	}

	// find even using for each loop
	public static void findEvenForEach(int[] a) {
		for (int i : a) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	// find largest
	public static void findLargest(int[] a) {
		int large = 0;
		for (int el : a) {
			if (large < el) {
				large = el;
			}
		}
		System.out.println("max num is " + large);

	}
	
	//insertOneElement
	public static void insertElement(int[] a, int elem, int loc, int len) {

		for (int i = len; i >= loc; i--) {
			a[i + 1] = a[i];
		}

		a[loc] = elem;

		for (int i = 0; i <= len; i++) {
			System.out.println(a[i]);
		}

	}

	//insert array
	public static void insertArray(int src[], int tar[], int srcLen, int loc) { // srcLen=sizeOfTheArray i.e. no of elem
																				// in array
		if (loc + tar.length <= src.length) {
			// increasing size of array for insertion                         // loc=inWhich loc you want to insert tar[]
			for (int i = srcLen-1 ; i >= loc; i--) {
				src[i + tar.length] = src[i];
			}
			// inserting tar[] to src[]
			int in = 0;
			for (int j = loc; j < loc + tar.length; j++) {
				src[j] = tar[in];
				in++;
			}
			// displaying total array
			for (int i = 0; i < src.length; i++) {
				System.out.println(src[i]);
			}
		} else
			System.out.println("change location, May cause Exception");
	}
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = null;
		int a[] = null,b[]=null, len = 0,lenb=0,loc=0;

		sc = new Scanner(System.in);
		System.out.println("enter 1st array length");
		len = sc.nextInt();
		a = new int[len + 5];
		//adding elem to array
		for (int index = 0; index < len; index++) {
			System.out.println("enter " + index + " element");
			a[index] = sc.nextInt();
		}

		// ArrayOperations.findEven(a);
		// ArrayOperations.findEvenForEach(a);
		// ArrayOperations.findLargest(a);
		// ArrayOperations.insertElement(a, 66, 1,len);
		
		System.out.println("enter 2nd array length");
		lenb=sc.nextInt();
		b=new int[lenb];
		//adding elem to array
		for (int index = 0; index < lenb; index++) {
			System.out.println("enter " + index + " element");
			b[index] = sc.nextInt();
		}
		System.out.println("enter location you want to insert into");
		loc=sc.nextInt();
		
		ArrayOperations.insertArray(a, b, len, loc);

	}

}
