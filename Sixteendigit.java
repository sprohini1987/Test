package com.payilagam.test;

import java.util.Scanner;

public class Sixteendigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner n= new Scanner(System.in);
        int []a={6,7,9,0,9,8,7,6,6,8,9,5,2,3,4,5};
        for(int i=0;i<a.length;i++){
        	if(i<12){
        		System.out.print("x");
        	}
        	else
        	System.out.print(a[i]);
        }
        
	}	
}

