package com.payilagam.test;

import java.util.Scanner;

public class CreateClass {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		CreateClass d=new CreateClass();
		System.out.println("e=");
		int e=a.nextInt();
		System.out.println("f=");
		int f=a.nextInt();
        System.out.println("h="+d.getSub(e, f));
        d.getAdd();
        
	}
        public void getAdd() {
    		// TODO Auto-generated method stub
    		int e=5,f=6,c;
    		c=e+f;
    		System.out.println("c="+c);
    	}
	
	private int getSub(int i, int j) {
		int h=i-j;
	return h ;
	}
  

}
