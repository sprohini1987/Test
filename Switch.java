package com.payilagam.test;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		System.out.println("enter the num");
		int b=a.nextInt();
		switch(b){
		case 1:
		System.out.println("Java");
		break;
		case 2:
			System.out.println("Dotnet");
			break;
		case 3:
			System.out.println("Android");
			break;
		}
	}

}
