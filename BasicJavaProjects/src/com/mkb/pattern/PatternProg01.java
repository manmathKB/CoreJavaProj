package com.mkb.pattern;

public class PatternProg01 {
/*
 	*****
 	*****
 	*****
 	*****
 	*****
 			*/
	public static void pattern1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

/*	1				
	12
	123
	1234
	12345 
	
	1
	22
	333
	4444
	55555
	
	*/
	public static void pattern2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
/*	5
	54
	543
	5432
	54321 
	
	5
	44
	333
	2222
	11111
    		*/

	public static void pattern3(int n) {
		for (int i = n; i >= 1; i--) {

			for (int j = n; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
/*	1
	21
	321
	4321
	54321 
	
	1
	22
	333
	4444	
	55555
	*/
	public static void pattern4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

/*	5
	45
	345
	2345
	12345
	
	5
	44
	333
	2222
	11111
 			*/ 
	
	public static void pattern5(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = i; j <= n; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

/*	1
	01
	101
	0101
	10101 
1
00
111
0000
11111
	*/
	
	public static void pattern6(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = i; j <= n; j++) {
				System.out.print(j % 2);
			}
			System.out.println();
		}
	}

/*	1
	12
	103
	1014
	10105
	101016
	1010107  
1
02
113
0004
11115
000006
1111117

	*/
	
	public static void pattern7(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (j != i) {
					System.out.print(j % 2);
				} else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
	
/*	10 * 1 = 10
	10 * 2 = 20
	......
	......
	*/
	public static void numberTable(int lm,int up) {
		for(int i=lm;i<=up;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println();
		}
		
	}
	
	//reverse of an array
	
	public static void swapArray(int a[]) {
		for(int i:a) {
			System.out.print(i+" ");
		}
		/*int in=0,ls=a.length-1;
		while(in<a.length && in<ls) {
			int temp=a[in];
			a[in]=a[ls];
			a[ls]=temp;
			ls--;
			in++;
		}*/
		
		for(int i=0,j=a.length-1;i<j;i++,j--) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		
		System.out.println();
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	
	// find pair of elem whose sum is a given sum (e.g 40)
	
	public static void findPairOfElemEqToSum(int a[],int sum) {

		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==sum) {
					System.out.print("("+a[i]+","+a[j]+"), ");
					break;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		int a[]= {10,20,30,20,32,8,31,9,40,50,60};
		PatternProg01.pattern1(5);
		System.out.println();
		PatternProg01.pattern2(5);
		System.out.println();
		PatternProg01.pattern3(5);
		System.out.println();
		PatternProg01.pattern4(5);
		System.out.println();
		PatternProg01.pattern5(5);
		System.out.println();
		PatternProg01.pattern6(5);
		System.out.println();
		PatternProg01.pattern7(7);
		System.out.println();
		PatternProg01.numberTable(10, 14);
		System.out.println();
		PatternProg01.swapArray(a);
		System.out.println();
		PatternProg01.findPairOfElemEqToSum(a,40);

	}

}
