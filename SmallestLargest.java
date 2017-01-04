package com.payilagam.test;

import java.util.Scanner;

public  class SmallestLargest {
      static int largest=0;
	static int smallest=0;
	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		System.out.println("enter n=");
		int n=a.nextInt();
		System.out.println("enter the numbers");
		int[] b=new int[n];
		for(int i=0;i<=n;i++){
			 b[i]=a.nextInt();
			 System.out.println(b[i]);
	}
		for(int j=0;j<=b.length;j++){
			if(b[j]>largest){
				largest=b[j];
			}
			else if(b[j]>smallest){
				smallest=b[j];
			}
		}
		System.out.println("The largest num is"+largest);
		System.out.println("The Smallest num is"+smallest);
	}
}
