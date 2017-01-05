package com.payilagam.test;

import java.util.Scanner;

public class ReverseString {
     
	public static void main(String[] args) {
		String c= "";
		Scanner a= new Scanner(System.in);
		System.out.println("enter the string");
		String b=a.nextLine();
		int l=b.length();
		for(int i=l-1;i>=0;i--){
				c= c+b.charAt(i);
		}
		System.out.println(c);
			
		}


}
