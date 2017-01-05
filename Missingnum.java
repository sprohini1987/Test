package com.payilagam.test;

import java.util.Scanner;

public class Missingnum {

	public static void main(String[] args) {
		Scanner n= new Scanner(System.in);
		System.out.println("enter the num");
		int a=n.nextInt();
		int []b=new int[a];
		for(int i=0;i<a;i++){
			b[i]=n.nextInt();
		}
		for(int i=0;i<a;i++){
			if(i==2){
				System.out.println();
			}
			else{
			System.out.println(b[i]);
		}
		
                 
	}

}
}